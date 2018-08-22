/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alann.ifpb.shared;

import java.util.List;

/**
 *
 * @author alann
 */
public interface ObjectService {

    void placeOrder(String item, int quantity);

    List<Object> getObjectList();

}
