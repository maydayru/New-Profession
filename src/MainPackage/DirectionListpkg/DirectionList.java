package MainPackage.DirectionListpkg;
import MainPackage.Directionpkg.Direction;
import MainPackage.Directionpkg.DirectionDAO;

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
@WebServlet(name = "DirectionList")
public class DirectionList extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
                DirectionDAO directDAO = new DirectionDAO();
                List<Direction> directions = null;
                directions = directDAO.list();
            request.setAttribute("FDirections", directions);
        } catch (SQLException e) {
            throw new ServletException("Не удалось получить данные из БД", e);
        }
    }
}
