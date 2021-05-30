package by.transport.model.service;

import by.transport.model.dao.impl.TransportDao;
import by.transport.model.entity.Route;
import by.transport.model.entity.Transport;

import java.util.List;

public class TransportService {
    private final TransportDao transportDao;
    private static TransportService singleton;

    private TransportService() {
        transportDao = new TransportDao();
    }

    public static TransportService getInstance() {
        if (singleton == null) {
            singleton = new TransportService();
        }
        return singleton;
    }

    public void save(Transport transport) {
        transportDao.save(transport);
    }

    public void update(Transport transport) {
        transportDao.update(transport);
    }

    public void delete(Transport transport) {
        transportDao.delete(transport);
    }

    public Transport getById(int transportId) {
        return transportDao.getById(transportId);
    }

    public List<Transport> getAll() {
        return transportDao.getAll();
    }

    public void deleteById(int transportId) {
        transportDao.deleteById(transportId);
    }

    public List<Transport> getByRoute(Route route) {
        return transportDao.getByRoute(route);
    }

    public void changeRoute(int transportId, Route route) {
        transportDao.changeRoute(transportId, route);
    }
}
