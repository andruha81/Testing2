package by.transport.model.dao;

import by.transport.model.entity.Route;
import by.transport.model.entity.Transport;

import java.util.List;

public interface ITransportDao {
    List<Transport> getByRoute(Route route);
    void changeRoute(int transportId, Route route);
}
