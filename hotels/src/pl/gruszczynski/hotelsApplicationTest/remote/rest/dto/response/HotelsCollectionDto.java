package pl.gruszczynski.hotelsApplicationTest.remote.rest.dto.response;

import pl.gruszczynski.hotelsApplicationTest.domain.model.ReservationStatusType;
import pl.gruszczynski.hotelsApplicationTest.remote.rest.dto.request.PersonReservationDto;

import java.util.List;

public class HotelsCollectionDto {

    private List<HotelDto> hotel;

    public HotelsCollectionDto()
    {

    }

    public HotelsCollectionDto(List<HotelDto> hotel)
    {
        this.hotel = hotel;
    }

    public List<HotelDto> getHotel() {
        return hotel;
    }

    public void setHotel(List<HotelDto> hotel) {
        this.hotel = hotel;
    }
}