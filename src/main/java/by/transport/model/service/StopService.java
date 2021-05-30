package by.transport.model.service;

import by.transport.model.dao.impl.StopDao;
import by.transport.model.entity.Stop;

import java.util.List;

public class StopService {
    private final StopDao stopDao;
    private static StopService singleton;

    private StopService() {
        stopDao = new StopDao();
    }

    public static StopService getInstance() {
        if (singleton == null) {
            singleton = new StopService();
        }
        return singleton;
    }

    public void save(Stop stop) {
        stopDao.save(stop);
    }

    public void update(Stop stop) {
        stopDao.update(stop);
    }

    public void delete(Stop stop) {
        stopDao.delete(stop);
    }

    public Stop getById(int stopId) {
        return stopDao.getById(stopId);
    }

    public List<Stop> getAll() {
        return stopDao.getAll();
    }

    public void deleteById(int stopId) {
        stopDao.deleteById(stopId);
    }
}
