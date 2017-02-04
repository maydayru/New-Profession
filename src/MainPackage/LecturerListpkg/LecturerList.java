package MainPackage.LecturerListpkg;

import MainPackage.Lecturerpkg.Lecturer;
import MainPackage.Lecturerpkg.LecturerDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by on on 31.01.2017.
 */
@WebServlet(name = "LecturerList")
public class LecturerList extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            LecturerDAO lectuDAO = new LecturerDAO();
            List<Lecturer> lecturers = null;
            lecturers = lectuDAO.list();
            request.setAttribute("FLecturers", lecturers);

        } catch (SQLException e) {
            throw new ServletException("Не удалось получить данные из БД", e);
        }
    }
}
