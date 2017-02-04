package MainPackage.Subjectpkg;

/**
 * Created by Mayday on 29.01.2017.
 */
public class Subject {
    private Long subject_id;
    private String subject_name;
    private String direction_id;
    private String lecturer_id;
    private Integer price;
    private String duration;
    public Subject() {
        super();
    }
    public Subject(String subject_name, String direction_id, String lecturer_id, Integer price, String duration) {
        super();
        this.subject_name = subject_name;
        this.direction_id = direction_id;
        this.lecturer_id = lecturer_id;
        this.price = price;
        this.duration = duration;
    }
    public Long getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(Long subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public String getDirection_id() {
        return direction_id;
    }

    public void setDirection_id(String direction_id) {
        this.direction_id = direction_id;
    }

    public String getLecturer_id() {
        return lecturer_id;
    }

    public void setLecturer_id(String lecturer_id) {
        this.lecturer_id = lecturer_id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
