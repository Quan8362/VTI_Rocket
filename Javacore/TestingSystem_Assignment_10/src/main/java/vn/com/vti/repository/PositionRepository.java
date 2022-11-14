package vn.com.vti.repository;

import vn.com.vti.entity.Position;
import vn.com.vti.entity.PositionName;
import vn.com.vti.utils.DatabaseUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PositionRepository implements IPositionRepository{
    private Connection connection = DatabaseUtils.getDatabaseConnection();
    @Override
    public List<Position> getAllPosition() throws SQLException {
        List<Position> positions = new ArrayList<>();
        String sql = "SELECT * FROM POSITION";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            int id = rs.getInt("PositionID");
            String name = rs.getString("PositionName");
            PositionName positionName = null;
            switch (name) {
                case "Dev":
                    positionName = PositionName.DEV;
                    break;
                case "Test":
                    positionName = PositionName.TEST;
                    break;
                case "Scrum Master":
                    positionName = PositionName.SCRUM_MASTER;
                    break;
                case "PM":
                    positionName = PositionName.PM;
                    break;
            }
            Position position = new Position(id, positionName);
            positions.add(position);
        }
        return positions;
    }
    @Override
    public int createPosition(String name) throws SQLException {
        String sqlInsert = "insert into `position`(PositionName) VALUE (?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
        preparedStatement.setString(1, name);
        int rowInsertAffect = preparedStatement.executeUpdate();
        connection.commit();
        return rowInsertAffect;
    }
    @Override
    public int updatePosition(Integer id, String name) throws SQLException {
        String sqlInsert = "UPDATE `testingsystem`.`position` SET `PositionName` = ? WHERE (`PositionID` = ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, id);
        int rowUpdateAffect = preparedStatement.executeUpdate();
        connection.commit();
        return rowUpdateAffect;
    }
    @Override
    public int deletePosition(Integer id) throws SQLException {
        String sqlInsert = "DELETE FROM `testingsystem`.`position` WHERE (`PositionID` = ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
        preparedStatement.setInt(1, id);
        int rowDeleteAffect = preparedStatement.executeUpdate();
        connection.commit();
        return rowDeleteAffect;
    }
    @Override
    public boolean checkId(Integer id) throws SQLException {
        String sqlInsert = "SELECT * FROM POSITION where PositionID= ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
        preparedStatement.setInt(1, id);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            return true;
        } else {
            return false;
        }
    }
}
