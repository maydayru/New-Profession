package Database;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Mayday on 27.01.2017.
 */

@WebServlet("/LoginServlet")
public class  LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String login=request.getParameter("login");
        String pass=request.getParameter("password");
        Auth authObject = new Auth();
        if (authObject.isLogin(login) && authObject.checkPassForLogin(login, pass)){
               RequestDispatcher adminView = request.getRequestDispatcher("/index.jsp");
            HttpSession session = request.getSession();
               session.setAttribute("user", login);
               //А если будет несколько админов
                   if (login.equals("root")) adminView.forward(request, response);
        }
        else {
            if(!authObject.isLogin(login) && !authObject.checkPassForLogin(login,pass))
            {	RequestDispatcher view1 = request.getRequestDispatcher("/login.jsp");
                PrintWriter out= response.getWriter();
                //и выводим там приветствие авторизованного пользователя
                out.println(" <div class=\"myadmin-alert myadmin-alert-icon myadmin-alert-click alert-danger  alertbottom\"> <i class=\"ti-user\"></i> Введен неправильный логин или пароль <a href=\"#\" class=\"closed\">&times;</a> </div>");
                view1.include(request, response);
            }

        }
    }
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
