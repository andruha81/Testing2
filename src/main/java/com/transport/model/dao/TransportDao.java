package com.transport.model.dao;

import com.transport.model.entity.Transport;

public class TransportDao extends AbstractJpaDao<Transport>{
    private Class<Transport> clazz = Transport.class;
}
