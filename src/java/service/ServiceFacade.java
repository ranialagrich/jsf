/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import beans.Service;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rania.lagrich
 */
@Stateless
public class ServiceFacade extends AbstractFacade<Service> {

    @PersistenceContext(unitName = "testwPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ServiceFacade() {
        super(Service.class);
    }
    
}
