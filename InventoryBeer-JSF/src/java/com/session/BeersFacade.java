/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session;

import com.entity.Beers;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author STEINACOZ-PC
 */
@Stateless
public class BeersFacade extends AbstractFacade<Beers> {

    @PersistenceContext(unitName = "InventoryBeer-JSFPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BeersFacade() {
        super(Beers.class);
    }
    
}
