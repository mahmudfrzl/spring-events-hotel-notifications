package kalemyazilimhome.az.springeventshotelnotifications.business.manager;

import kalemyazilimhome.az.springeventshotelnotifications.business.service.ReservationService;
import kalemyazilimhome.az.springeventshotelnotifications.entities.concretes.HotelBookRequest;
import kalemyazilimhome.az.springeventshotelnotifications.events.ReservationCreateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ReservationManager implements ReservationService {



    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;


    @Async
    @Override
    public void publishReservationEvent(HotelBookRequest hotelBookRequest) {
        applicationEventPublisher.publishEvent(new ReservationCreateEvent(hotelBookRequest));
    }
}
