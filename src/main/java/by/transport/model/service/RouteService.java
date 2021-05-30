package by.transport.model.service;

import by.transport.model.dao.impl.RouteDao;
import by.transport.model.entity.Route;

import java.util.List;

public class RouteService {
    private final RouteDao routeDao;
    private static RouteService singleton;

    private RouteService() {
        routeDao = new RouteDao();
    }

    public static RouteService getInstance() {
        if (singleton == null) {
            singleton = new RouteService();
        }
        return singleton;
    }

    public void save(Route route) {
        routeDao.save(route);
    }

    public void update(Route route) {
        routeDao.update(route);
    }

    public void delete(Route route) {
        routeDao.delete(route);
    }

    public Route getById(int routeId) {
        return routeDao.getById(routeId);
    }

    public List<Route> getAll() {
        return routeDao.getAll();
    }

    public void deleteById(int routeId) {
        routeDao.deleteById(routeId);
    }
}
