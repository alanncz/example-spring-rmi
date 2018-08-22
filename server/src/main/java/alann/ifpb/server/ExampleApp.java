package alann.ifpb.server;

import alann.ifpb.shared.ObjectService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import java.net.UnknownHostException;

@Configuration
public class ExampleApp {

    @Bean
    public ObjectService orderService() {
        return new ObjectServiceImpl();
    }

    @Bean
    public RmiServiceExporter exporter() throws UnknownHostException {
        RmiServiceExporter rse = new RmiServiceExporter();
        rse.setServiceName("ObjectService");
        rse.setService(orderService());
        rse.setServiceInterface(ObjectService.class);
        rse.setRegistryPort(2099);
        return rse;
    }

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(ExampleApp.class);
    }

}
