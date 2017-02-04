package Database;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Auth {
    Connection conn=null; // объект для связи с БД
    Statement stmt=null; // объект для SQL-запросов
    private Statement getStmt() { //метод для получения объекта для SQL-запросов к БД
        Statement localStmt=null;
        try { // блок try … Catch для работы с БД
            // получаем доступ к БД jdbc:h2:file://F:\\JavaEEprojects\\ MyWebProject\\portal
            conn=dbconnect.getConnection();
            //получаем объект для выполнения команд SQL
            localStmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) { //обрабатываем возможные ошибки
            Logger.getLogger(Auth.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Trouble with query!!");
        }
        return localStmt; // возвращаем объект для SQL-запросов
    }
    public boolean isLogin(String login) { //метод для проверки существования логина
        stmt=getStmt(); // получаем объект для SQL-запросов
        ResultSet localRS=null; //локальный объект для результата SQL-запросов
        try { //получаем все логины из таблицы account
            localRS=stmt.executeQuery("select account_login from accountinfo");
            localRS.beforeFirst(); //переходим на первую запись
            while (localRS.next()) { //пока есть записи
                //если введенный пользователем логин равен логину в таблице
                if (login.equals(localRS.getString(1))) { //то выводим
                    System.out.println("Yes login!"); //сообщение в консоль
                    conn.close(); //закрываем соединение с БД
                    return true; //возвращаем true
                }
            }
            //если цикл завершился, а соответствие с введенным логином не найдено, то
            conn.close(); //закрываем соединение с БД
        } catch (SQLException e) { //обрабатываем исключения
            e.printStackTrace();
        }
        //эта часть сработает, если в цикле ничего не нашлось
        System.out.println("No login"); //выводим соответствующий текст
        return false; //и возвращаем false
    }
    //метод для проверки соответствия логина и пароля
    public boolean checkPassForLogin(String login, String pass) {
        stmt=getStmt(); // получаем объект для SQL-запросов
        ResultSet localRS=null; //локальный объект для результата SQL-запросов
        try { //получаем все логины и пароли из таблицы account
            localRS=stmt.executeQuery("select account_login, account_password from accountinfo");
            localRS.beforeFirst(); //переходим на первую запись
            while (localRS.next()) {
                //добавляем строку, в которой записываем md5-хеш от переданного из сервлета пароля
                String passHash=getHash(pass);
                //и проверяем теперь равенство хешей
                if (login.equals(localRS.getString(1)) && passHash.equals(localRS.getString(2))) {
                    System.out.println("Yes login & pass");
                    conn.close();
                    return true;
                }
            }
            //эта часть сработает, если в цикле ничего не нашлось
            System.out.println("Pass isn't correct");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; //возвращаем false, если ничего не нашлось
    }
    //здесь прикрутили md5
    public static  String getHash(String str) { //в примере просто public String... без static
        MessageDigest md5 ;
        StringBuffer hexString = new StringBuffer();
        try {
            md5 = MessageDigest.getInstance("md5");
            md5.reset();
            md5.update(str.getBytes());
            byte messageDigest[] = md5.digest();
            for (int i = 0; i < messageDigest.length; i++) {
                hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
            }
        }
        catch (NoSuchAlgorithmException e) {
            return e.toString();
        }
        return hexString.toString();
    }
}