package MainPackage.Directionpkg;

import Database.dbconnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mayday on 29.01.2017.
 */
public class DirectionDAO {
    public List<Direction> list() throws SQLException {

        List<Direction> directions = new ArrayList<>();
        Connection connection=dbconnect.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT direction_id, direction_name from direction");
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Direction direction = new Direction();
            direction.setDirection_id(resultSet.getLong("direction_id"));
            direction.setDirection_name(resultSet.getString("direction_name"));
            directions.add(direction);
        }
        connection.close();
           return directions;
    }
    public static long addNewDirection(Direction direction) throws SQLException {
        Connection connection=dbconnect.getConnection();
        PreparedStatement statement = connection.prepareStatement("insert into direction (direction_id, direction_name) values(?,?)");
        statement.setLong(1, direction.getDirection_id());
        statement.setString(2, direction.getDirection_name());
        int result= statement.executeUpdate();
        connection.close();
        connection=dbconnect.getConnection();
        statement = connection.prepareStatement("SELECT direction_id FROM direction where direction_id='"+direction.getDirection_id()+"'");
        ResultSet resultSet = statement.executeQuery();
        resultSet.next();
        long id=resultSet.getLong("direction_id");
        connection.close();
        return id;
    }

    public static long getDirectionID(String Direction) throws SQLException {
        long direction_id = 0;
        Connection connection = dbconnect.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT direction_id FROM direction where direction_id='" + Direction + "'");
        ResultSet resultSet = statement.executeQuery();
        resultSet.next();
        direction_id = resultSet.getLong("direction_id");
        connection.close();
        return direction_id;
    }
}
