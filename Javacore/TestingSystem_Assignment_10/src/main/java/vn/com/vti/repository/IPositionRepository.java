package vn.com.vti.repository;

import vn.com.vti.entity.Position;

import java.sql.SQLException;
import java.util.List;

public interface IPositionRepository {
    List<Position> getAllPosition() throws SQLException;

    int createPosition(String name) throws SQLException;

    int updatePosition(Integer id, String name) throws SQLException;

    int deletePosition(Integer id) throws SQLException;

    boolean checkId(Integer id) throws SQLException;
}
