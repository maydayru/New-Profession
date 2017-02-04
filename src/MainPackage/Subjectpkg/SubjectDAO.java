package MainPackage.Subjectpkg;

import Database.dbconnect;
import MainPackage.Directionpkg.Direction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mayday on 29.01.2017.
 */
public class SubjectDAO {
    public List<Subject> list() throws SQLException {
        List<Subject> subjects = new ArrayList<>();
        Connection connection= dbconnect.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT subject.subject_id, subject.subject_name, direction.direction_name, subject.lecturer_id, subject.direction_id, lecturer.lecturer_name, subject.price, subject.duration from subject, direction, lecturer where subject.direction_id=direction.direction_id and subject.lecturer_id=lecturer.lecturer_id");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Subject subject = new Subject();
            subject.setSubject_name(resultSet.getString("subject_name"));
            subject.setDirection_id(resultSet.getString("direction_name"));
            subject.setLecturer_id(resultSet.getString("lecturer_name"));
            subject.setPrice(resultSet.getInt("price"));
            subject.setDuration(resultSet.getString("duration"));
            subjects.add(subject);
        }
        connection.close();
        return subjects;
    }
    public static long addNewSubject(String coursename, String course_direction_id, String course_lecturer_id, Integer course_price, String course_duration) throws SQLException {
        Connection connection=dbconnect.getConnection();
        PreparedStatement statement = connection.prepareStatement("insert into subject "
                + "(subject_name, direction_id, lecturer_id, price,duration) values(?,?,?,?,?)");
        statement.setString(1, coursename);
        statement.setString(2, course_direction_id);
        statement.setString(3, course_lecturer_id);
        statement.setLong(4, course_price);
        statement.setLong(5, Long.valueOf(course_duration));
        int result= statement.executeUpdate();
        System.out.println("DB insert subject result="+result);
        connection.close();
        connection=dbconnect.getConnection();
        statement = connection.prepareStatement("SELECT subject_name FROM subject where subject_name='"+coursename+"'");
//	        statement.setString(1, account.getLogin());
        ResultSet resultSet = statement.executeQuery();
        resultSet.next();
        System.out.println("from DAO inserted subject id="+resultSet.getLong("subject_name"));
        long id=resultSet.getLong("subject_name");
        connection.close();
        return id;
    }
}
