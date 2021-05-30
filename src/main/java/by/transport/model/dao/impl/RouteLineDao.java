package by.transport.model.dao.impl;

import by.transport.model.dao.IRouteLineDao;
import by.transport.model.entity.RouteLine;

public class RouteLineDao extends GenericDao<RouteLine> implements IRouteLineDao {
    public RouteLineDao() {
        super(RouteLine.class);
    }
}
