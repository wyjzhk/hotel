package hotel_manage_system;

import java.util.Objects;

public class Room {
    private int RoomNo;
    private String RoomType;
    private boolean Roomstutas;

    public Room() {
    }

    public Room(int roomNo, String roomType, boolean roomstutas) {
        RoomNo = roomNo;
        RoomType = roomType;
        Roomstutas = roomstutas;
    }

    public int getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(int roomNo) {
        RoomNo = roomNo;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public boolean isRoomstutas() {
        return Roomstutas;
    }

    public void setRoomstutas(boolean roomstutas) {
        Roomstutas = roomstutas;
    }

    @Override
    public String toString() {
        return "Room{" +
                "RoomNo=" + RoomNo +
                ", RoomType='" + RoomType + '\'' +
                ", Roomstutas=" +(Roomstutas?"空闲":"占用") +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return RoomNo == room.RoomNo ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(RoomNo, RoomType, Roomstutas);
    }
}
