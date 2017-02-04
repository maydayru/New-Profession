package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class dbconnect {
    //создаем статичный метод для получения соединения к БД
    public static Connection getConnection() {
        // создаем строковую переменную, в которой будет храниться путь к БД
        String dbPath="jdbc:h2:file://D:\\Diplom\\NewProfessionDataBase";
        // подгружаем класс драйвера СУБД H2
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {//если проблема с подгрузкой класса драйвера
            System.out.println("Trouble with connection!");
            Logger.getLogger(dbconnect.class.getName()).log(Level.SEVERE, null, e);
        }
        // создаем объект для получения соединения с БД
        Connection connection = null;
        try { //получаем соединение с БД, указывая путь, пользователя и пароль
            connection = DriverManager.getConnection(dbPath,"root","root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection; //возвращаем объект, хранящий соединение с БД
    }
}
