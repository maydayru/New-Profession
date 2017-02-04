package MainPackage.Lecturerpkg;

import Database.dbconnect;
import MainPackage.Directionpkg.Direction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

/**
 * Created by on on 31.01.2017.
 */
public class LecturerDAO {
    public List<Lecturer> list() throws SQLException {

        List<Lecturer> lecturers = new ArrayList<>();
        Connection connection= dbconnect.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT lecturer.lecturer_id, lecturer.lecturer_name, lecturer.lecturer_birthday, sex.sex_name, lecturer.lecturer_sex_id, subject.subject_name, lecturer.subject_id, lecturer.degree, lecturer.lecturer_phone, lecturer.lecturer_email from lecturer, sex, subject where lecturer.lecturer_sex_id=sex.sex_id and lecturer.subject_id=subject.subject_id");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Lecturer lecturer = new Lecturer();
            lecturer.setLecturer_id(resultSet.getLong("lecturer_id"));
            lecturer.setLecturer_name(resultSet.getString("lecturer_name"));
            lecturer.setLecturer_birthday(resultSet.getDate("lecturer_birthday"));
            lecturer.setLecturer_sex_id(resultSet.getString("sex_name"));
            lecturer.setSubject_id(resultSet.getString("subject_name"));
            lecturer.setDegree(resultSet.getString("degree"));
            lecturer.setLecturer_phone(resultSet.getString("lecturer_phone"));
            lecturer.setLecturer_email(resultSet.getString("lecturer_email"));
            lecturers.add(lecturer);
        }
        connection.close();
        return lecturers;
    }
    public static long addNewLecturer(Long lecturer_id, String lecturer_name, Date lecturer_birthday, Long sex_id, Long subject_id, String degree, String lecturer_phone, String lecturer_email) throws SQLException {
        Connection connection=dbconnect.getConnection();
        PreparedStatement statement = connection.prepareStatement("insert into lecturer (lecturer_id, lecturer_name, lecturer_birthday, lecturer_sex_id, subject_id, degree, lecturer_phone, lecturer_email) values(?,?,?,?,?,?,?,?)");
        statement.setLong(1, lecturer_id);
        statement.setString(2, lecturer_name);
        statement.setDate(3,lecturer_birthday);
        statement.setLong(4,sex_id);
        statement.setLong(5,subject_id);
        statement.setString(6,degree);
        statement.setString(7,lecturer_phone);
        statement.setString(8,lecturer_email);
        int result= statement.executeUpdate();
        connection.close();
        connection=dbconnect.getConnection();
        statement = connection.prepareStatement("SELECT lecturer_id FROM lecturer where lecturer_id='"+lecturer_id+"'");
        ResultSet resultSet = statement.executeQuery();
        resultSet.next();
        long id=resultSet.getLong("lecturer_id");
        connection.close();
        return id;
    }

    public static long getLecturerID(String Lecturer) throws SQLException {
        long lecturer_id = 0;
        Connection connection = dbconnect.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT lecturer_id FROM lecturer where lecturer_id='" + Lecturer + "'");
        ResultSet resultSet = statement.executeQuery();
        resultSet.next();
        lecturer_id = resultSet.getLong("lecturer_id");
        connection.close();
        return lecturer_id;
    }
    }
