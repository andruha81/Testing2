package by.transport.model.service;

import by.transport.model.dao.impl.RouteLineDao;
import by.transport.model.entity.RouteLine;

import java.util.List;

public class RouteLineService {
    private final RouteLineDao routeLineDao;
    private static RouteLineService singleton;

    private RouteLineService() {
        routeLineDao = new RouteLineDao();
    }

    public static RouteLineService getInstance() {
        if (singleton == null) {
            singleton = new RouteLineService();
        }
        return singleton;
    }

    public void save(RouteLine routeLine) {
        routeLineDao.save(routeLine);
    }

    public void update(RouteLine routeLine) {
        routeLineDao.update(routeLine);
    }

    public void delete(RouteLine routeLine) {
        routeLineDao.delete(routeLine);
    }

    public RouteLine getById(int routeLineId) {
        return routeLineDao.getById(routeLineId);
    }

    public List<RouteLine> getAll() {
        return routeLineDao.getAll();
    }

    public void deleteById(int routeLineId) {
        routeLineDao.deleteById(routeLineId);
    }
}
