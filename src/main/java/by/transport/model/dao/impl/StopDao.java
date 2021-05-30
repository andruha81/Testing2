package by.transport.model.dao.impl;

import by.transport.model.dao.IStopDao;
import by.transport.model.entity.Stop;

public class StopDao extends GenericDao<Stop> implements IStopDao {
    public StopDao() {
        super(Stop.class);
    }
}
