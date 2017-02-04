package MainPackage.SubjectListpkg;

import MainPackage.Directionpkg.Direction;
import MainPackage.Directionpkg.DirectionDAO;
import MainPackage.Subjectpkg.Subject;
import MainPackage.Subjectpkg.SubjectDAO;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by on on 30.01.2017.
 */
@WebServlet(name = "SubjectList")
public class SubjectList extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            List<Subject> subjects = null;
            SubjectDAO subjDAO = new SubjectDAO();
                subjects = subjDAO.list();
                request.setAttribute("FSubjects", subjects);

//                DirectionDAO directDAO = new DirectionDAO();
//                List<Direction> directions = null; //создаем объект для хранения списка групп
//                directions = directDAO.list(); //записываем в него группы
//                //помещаем список групп запрос, они будут доступны в jsp-файле через имя groupList
//                request.setAttribute("FDirections", directions);

            } catch (SQLException e) { //отлавливаем исключение
                throw new ServletException("Не удалось получить данные из БД", e);
           }
    }
}
