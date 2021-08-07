package kalemyazilimhome.az.springeventshotelnotifications.business.service;

import kalemyazilimhome.az.springeventshotelnotifications.entities.concretes.HotelBookRequest;

public interface ReservationService {
    public void publishReservationEvent(HotelBookRequest hotelBookRequest);
}
