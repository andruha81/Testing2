package by.transport.model.service;

import by.transport.model.dao.impl.TransportTypeDao;
import by.transport.model.entity.TransportType;

import java.util.List;

public class TransportTypeService {

    private final TransportTypeDao transportTypeDao;
    private static TransportTypeService singleton;

    private TransportTypeService() {
        transportTypeDao = new TransportTypeDao();
    }

    public static TransportTypeService getInstance() {
        if (singleton == null) {
            singleton = new TransportTypeService();
        }
        return singleton;
    }

    public void save(TransportType transportType) {
        transportTypeDao.save(transportType);
    }

    public void update(TransportType transportType) {
        transportTypeDao.update(transportType);
    }

    public void delete(TransportType transportType) {
        transportTypeDao.delete(transportType);
    }

    public TransportType getById(int transportTypeId) {
        return transportTypeDao.getById(transportTypeId);
    }

    public List<TransportType> getAll() {
        return transportTypeDao.getAll();
    }

    public void deleteById(int transportTypeId) {
        transportTypeDao.deleteById(transportTypeId);
    }
}
