package MainPackage.Directionpkg;

/**
 * Created by Mayday on 29.01.2017.
 */
public class Direction {
    private Long direction_id;
    private String direction_name;
    public Long getDirection_id() {
        return direction_id;
    }

    public void setDirection_id(Long direction_id) {
        this.direction_id = direction_id;
    }

    public String getDirection_name() {
        return direction_name;
    }

    public void setDirection_name(String direction_name) {
        this.direction_name = direction_name;
    }



    public Direction() {
        super();
    }
    public Direction(Long direction_id, String direction_name) {
        super();
        this.direction_id = direction_id;
        this.direction_name = direction_name;
    }


}
