package vn.com.vti.service;

import vn.com.vti.entity.Position;
import vn.com.vti.repository.PositionRepository;

import java.sql.SQLException;
import java.util.List;

public class PositionServiceImpl implements IPositionService {
    private final PositionRepository positionRepository;

    public PositionServiceImpl() {
        this.positionRepository = new PositionRepository();
    }

    @Override
    public List<Position> getAllPosition() throws SQLException {
        return positionRepository.getAllPosition();
    }

    @Override
    public int createPosition(String name) throws SQLException {
        int result = positionRepository.createPosition(name);
        return result;
    }

    @Override
    public int updatePosition(Integer id, String name) throws SQLException {
        return positionRepository.updatePosition(id, name);
    }

    @Override
    public int deletePosition(Integer id) throws SQLException {
        return positionRepository.deletePosition(id);
    }

    @Override
    public boolean checkId(Integer id) throws SQLException {
        return positionRepository.checkId(id);
    }
}
