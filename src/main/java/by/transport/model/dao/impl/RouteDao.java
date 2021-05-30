package by.transport.model.dao.impl;

import by.transport.model.dao.IRouteDao;
import by.transport.model.entity.Route;

public class RouteDao extends GenericDao<Route> implements IRouteDao {
    public RouteDao() {
        super(Route.class);
    }
}
