/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alann.ifpb.client;

import alann.ifpb.shared.ObjectService;
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
        objectService.placeObject(" Computador de Mesa", 2);
        objectService.placeObject("Notbok", 3);
    }
    
    public void listObeject(){
        List listObject = objectService.list();
        listObject.forEach((o) -> {
            System.out.println(o);
        });
    }

}
