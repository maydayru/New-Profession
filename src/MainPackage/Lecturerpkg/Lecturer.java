package MainPackage.Lecturerpkg;

import java.util.Date;

/**
 * Created by on on 31.01.2017.
 */
public class Lecturer {
    private Long lecturer_id;
    private String lecturer_name;
    private Date lecturer_birthday;
    private String lecturer_sex_id;
    private String subject_id;
    private String degree;
    private String lecturer_phone;
    private String lecturer_email;
    public Lecturer() {
        super();
    }
    public Lecturer(Long lecturer_id, String lecturer_name, Date lecturer_birthday, String lecturer_sex_id, String subject_id, String degree, String lecturer_phone, String lecturer_email) {
        super();
        this.lecturer_id = lecturer_id;
        this.lecturer_name = lecturer_name;
        this.lecturer_birthday = lecturer_birthday;
        this.lecturer_sex_id = lecturer_sex_id;
        this.subject_id = subject_id;
        this.degree = degree;
        this.lecturer_phone = lecturer_phone;
        this.lecturer_email = lecturer_email;
    }

    public Long getLecturer_id() {
        return lecturer_id;
    }

    public void setLecturer_id(Long lecturer_id) {
        this.lecturer_id = lecturer_id;
    }

    public String getLecturer_name() {
        return lecturer_name;
    }

    public void setLecturer_name(String lecturer_name) {
        this.lecturer_name = lecturer_name;
    }

    public Date getLecturer_birthday() {
        return lecturer_birthday;
    }

    public void setLecturer_birthday(Date lecturer_birthday) {
        this.lecturer_birthday = lecturer_birthday;
    }

    public String getLecturer_sex_id() {
        return lecturer_sex_id;
    }

    public void setLecturer_sex_id(String lecturer_sex_id) {
        this.lecturer_sex_id = lecturer_sex_id;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getLecturer_phone() {
        return lecturer_phone;
    }

    public void setLecturer_phone(String lecturer_phone) {
        this.lecturer_phone = lecturer_phone;
    }

    public String getLecturer_email() {
        return lecturer_email;
    }

    public void setLecturer_email(String lecturer_email) {
        this.lecturer_email = lecturer_email;
    }


}
