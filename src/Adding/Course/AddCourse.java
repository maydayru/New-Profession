package Adding.Course;

import MainPackage.Directionpkg.Direction;
import MainPackage.Directionpkg.DirectionDAO;
import MainPackage.Lecturerpkg.LecturerDAO;
import MainPackage.Subjectpkg.Subject;
import MainPackage.Subjectpkg.SubjectDAO;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by on on 31.01.2017.
 */
@WebServlet(name = "AddCourse")
public class AddCourse extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        RequestDispatcher adminView = request.getRequestDispatcher("/addcourse.jsp");
        String coursename=request.getParameter("fcoursename");
        String course_direction_id=request.getParameter("fcoursedirection");
        String course_lecturer_id=request.getParameter("flecturercourse");
        Integer course_price= Integer.valueOf(request.getParameter("fcourseprice"));
        String course_duration=request.getParameter("fcourseduration");
        System.out.println("Новый курс"+" "+coursename+" "+course_direction_id+" "+course_lecturer_id+" "+course_price+" "+course_duration);
        Subject newSubject=new Subject(coursename,course_direction_id,course_lecturer_id,course_price,course_duration);
        long subjectID=0;
        long directionID=0;
        long lecturerID=0;
        try {
            lecturerID = LecturerDAO.getLecturerID(course_lecturer_id);
            directionID = DirectionDAO.getDirectionID(course_direction_id);
            subjectID = SubjectDAO.addNewSubject(newSubject);
            System.out.println("from servlet new subjID = "+subjectID);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(subjectID);
adminView.forward(request,response);
    }
}
