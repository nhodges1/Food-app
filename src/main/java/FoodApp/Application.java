package FoodApp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static Logger log = LogManager.getLogger();

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}
