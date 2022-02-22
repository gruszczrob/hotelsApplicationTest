package pl.gruszczynski.hotelsApplicationTest.remote.rest.dto.request;

import pl.gruszczynski.hotelsApplicationTest.domain.model.ReservationStatusType;

import java.util.List;
public class UpdateReservationDto {
    private ReservationStatusType status;
    private List<RoomReservationDto> rooms;
    private List<PersonReservationDto> persons;
    public UpdateReservationDto(){
    }

    public UpdateReservationDto(ReservationStatusType status, List<RoomReservationDto> rooms, List<PersonReservationDto> persons){
        this.status = status;
        this.rooms = rooms;
        this.persons = persons;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
    }

    public List<RoomReservationDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomReservationDto> rooms) {
        this.rooms = rooms;
    }

    public List<PersonReservationDto> getPersons() {
        return persons;
    }

    public void setPersons(List<PersonReservationDto> persons) {
        this.persons = persons;
    }
}