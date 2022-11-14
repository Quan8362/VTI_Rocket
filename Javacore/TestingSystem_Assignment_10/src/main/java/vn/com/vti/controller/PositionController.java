package vn.com.vti.controller;

import vn.com.vti.entity.Position;
import vn.com.vti.service.IPositionService;
import vn.com.vti.service.PositionServiceImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionController {
    private final IPositionService positionService;

    public PositionController() {
        this.positionService = new PositionServiceImpl();
    }

    public List<Position> getAllPosition() throws SQLException {
        return positionService.getAllPosition();
    }

    public int createPosition(String name) throws SQLException {
        return positionService.createPosition(name);
    }

    public int updatePosition(Integer id, String name) throws SQLException {
        return positionService.updatePosition(id, name);
    }

    public int deletePosition(Integer id) throws SQLException {
        return positionService.deletePosition(id);
    }

    public boolean checkId(Integer id) throws SQLException {
        return positionService.checkId(id);
    }
}
