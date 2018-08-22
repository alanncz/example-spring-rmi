package alann.ifpb.server;

import alann.ifpb.shared.ObjectService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import java.net.UnknownHostException;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PersistenceConfig.class)
@ComponentScan(value = "alann.ifpb.server")
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
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ExampleApp.class);
    }

}
