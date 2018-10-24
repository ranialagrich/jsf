/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import beans.Filiere;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rania.lagrich
 */
@Stateless
public class FiliereFacade extends AbstractFacade<Filiere> {

    @PersistenceContext(unitName = "testwPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FiliereFacade() {
        super(Filiere.class);
    }
    
}
