package pl.gruszczynski.hotelsApplicationTest.remote.rest.dto.request;
public class RoomReservationDto {
    private Integer id;
    private Integer roomId;
    private Integer days;
    public RoomReservationDto() {
    }

    public RoomReservationDto(Integer id, Integer roomId, Integer count) {
        this.id = id;
        this.roomId = roomId;
        this.days = days;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer sizeId) {
        this.roomId = sizeId;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer count) {
        this.days = days;
    }
}
