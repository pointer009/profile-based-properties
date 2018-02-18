package com.mkyong;
import com.mkyong.config.ServerProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	private static Logger logger = LoggerFactory.getLogger(Application.class);

    @Autowired
    private ServerProperties serverProperties;

    @Override
    public void run(String... args) throws Exception {
        //System.out.println(serverProperties);
        System.out.println("Print Email:"+serverProperties.getEmail());
        System.out.println("Print Cluster:"+serverProperties.getCluster().get(0));
        System.out.println(" Cluster:"+serverProperties.getCluster().get(0));
        System.out.println(" Cluster:"+serverProperties.getCluster().get(1));
        System.out.println(" Cluster:"+serverProperties.getCluster().get(2));
       
      }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
        logger.info("Logging");
    }

}
