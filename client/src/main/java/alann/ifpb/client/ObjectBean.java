/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alann.ifpb.client;

import alann.ifpb.shared.ObjectService;
import alann.ifpb.shared.Object;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author alann
 */
public class ObjectBean {

    @Autowired
    private ObjectService objectService;

    public void placeObject() {
        objectService.placeOrder(" Computador de Mesa", 2);
        objectService.placeOrder("Notbok", 3);
    }

    public void listObject() {
        List<Object> objectList = objectService.getObjectList();
        objectList.forEach((object) -> {
            System.out.println(object);
        });
    }
}
