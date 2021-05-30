package by.transport.model.dao.impl;

import by.transport.model.dao.ITransportDao;
import by.transport.model.entity.Route;
import by.transport.model.entity.Transport;
import by.transport.util.HibernateUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class TransportDao extends GenericDao<Transport> implements ITransportDao {
    public TransportDao() {
        super(Transport.class);
    }

    @Override
    public List<Transport> getByRoute(Route route) {
        EntityManager em = HibernateUtil.getEntityManager();
        em.getTransaction().begin();
        List<Transport> entities = em.createQuery("SELECT t FROM Transport t WHERE t.route = :routeName ")
                .setParameter("routeName", route).getResultList();
        em.getTransaction().commit();
        em.close();
        return entities;
    }

    @Override
    public void changeRoute(int transportId, Route route) {
        Transport transport = getById(transportId);
        transport.setRoute(route);
        update(transport);
    }
}
