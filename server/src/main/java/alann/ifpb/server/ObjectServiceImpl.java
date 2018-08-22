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

/**
 *
 * @author alann
 */
public class ObjectServiceImpl implements ObjectService {
    
    private List<Object> objects = new ArrayList<>();

    @Override
    public void placeOrder(String item, int quantity) {
        Object object = new Object();
        object.setItem(item);
        object.setQty(quantity);
        object.setOrderDate(LocalDateTime.now());
        System.out.println(object);
        objects.add(object);
    }

    @Override
    public List<Object> getObjectList() {
        return objects;
    }



}
