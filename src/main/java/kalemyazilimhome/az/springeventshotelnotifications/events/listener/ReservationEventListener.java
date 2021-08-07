package kalemyazilimhome.az.springeventshotelnotifications.events.listener;

import kalemyazilimhome.az.springeventshotelnotifications.events.ReservationCreateEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ReservationEventListener {
        @EventListener
        public void reservationEventHandler(ReservationCreateEvent createEvent) throws  InterruptedException{
            Thread.sleep(5000L);
            System.out.println("EventListener-> " + createEvent.getSource().toString());
        }
}
