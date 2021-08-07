package kalemyazilimhome.az.springeventshotelnotifications.api;

import kalemyazilimhome.az.springeventshotelnotifications.business.service.ReservationService;
import kalemyazilimhome.az.springeventshotelnotifications.entities.concretes.HotelBookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book/")
public class BookingController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping("hotel")
    public void bookingHotel(@RequestBody HotelBookRequest hotelBookRequest){
        reservationService.publishReservationEvent(hotelBookRequest);
        System.out.println("Istifadeci isleme basladi " + hotelBookRequest);
    }


}
