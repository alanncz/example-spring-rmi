/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alann.ifpb.client;

import alann.ifpb.shared.ObjectService;
import java.net.Inet4Address;
import java.rmi.UnknownHostException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

/**
 *
 * @author alann
 */
@Configuration
public class ExampleClient {

    @Bean
    public ObjectBean orderBean() {
        return new ObjectBean();
    }

    @Bean
    public RmiProxyFactoryBean exporter() throws UnknownHostException, java.net.UnknownHostException {
        RmiProxyFactoryBean rpfb = new RmiProxyFactoryBean();
        rpfb.setServiceInterface(ObjectService.class);
        String hostAddress = Inet4Address.getLocalHost().getHostAddress();
        rpfb.setServiceUrl(String.format("rmi://%s:2099/ObjectService", hostAddress));
        return rpfb;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ExampleClient.class);
        ObjectBean bean = context.getBean(ObjectBean.class);
        bean.placeObject();
        bean.listObeject();
    }

}
