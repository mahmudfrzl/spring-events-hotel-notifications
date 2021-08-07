package kalemyazilimhome.az.springeventshotelnotifications.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelBookRequest {
    private String userId;
    private String hotelId;

    @Override
    public String toString() {
        return "HotelBoolRequest{" +
                "userId='" + userId + '\'' +
                ", hotelId='" + hotelId + '\'' +
                '}';
    }
}
