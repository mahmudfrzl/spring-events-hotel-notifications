package kalemyazilimhome.az.springeventshotelnotifications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringEventsHotelNotificationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEventsHotelNotificationsApplication.class, args);

    }

}
