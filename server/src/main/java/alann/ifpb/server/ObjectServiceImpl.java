/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alann.ifpb.server;

import alann.ifpb.shared.Object;
import alann.ifpb.shared.ObjectService;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author alann
 */
@Repository
@Transactional
public class ObjectServiceImpl implements ObjectService {

    @PersistenceContext
    private EntityManager entityManager;
    private List<Object> objects = new ArrayList<>();

    @Override
    public void placeObject(String item, int quantity) {
        Object object = new Object();
        object.setItem(item);
        object.setQty(quantity);
        object.setOrderDate(LocalDateTime.now());
        System.out.println(object);
        objects.add(object);
        entityManager.persist(object);
        
    }
    
     @Override
    public List<Object> list() {
        return entityManager.createNamedQuery("object.list", Object.class).getResultList();
    }

}
