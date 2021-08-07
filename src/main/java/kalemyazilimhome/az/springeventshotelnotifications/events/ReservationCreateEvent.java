package kalemyazilimhome.az.springeventshotelnotifications.events;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Bean;


public class ReservationCreateEvent extends ApplicationEvent {

    public ReservationCreateEvent(Object source) {
        super(source);
    }
}
