package by.transport.model.dao.impl;

import by.transport.model.dao.ITransportTypeDao;
import by.transport.model.entity.TransportType;

public class TransportTypeDao extends GenericDao<TransportType> implements ITransportTypeDao {
    public TransportTypeDao() {
        super(TransportType.class);
    }
}
