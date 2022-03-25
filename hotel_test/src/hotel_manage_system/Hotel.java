package hotel_manage_system;

import java.util.Arrays;
import java.util.Objects;

public class Hotel {
    private String Hotelname;
    private Room[][] Rooms = new Room[3][6];

    public Hotel() {
        this.Hotelname = "如家酒店";
    }

    public Hotel(String hotelname, Room[][] romms) {
        Hotelname = hotelname;
        Rooms = romms;
    }

    public String getHotelname() {
        return Hotelname;
    }

    public void setHotelname(String hotelname) {
        Hotelname = hotelname;
    }

    public Room[][] getRomms() {
        return Rooms;
    }

    public void setRomms(Room[][] romms) {
        Rooms = romms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "Hotelname='" + Hotelname + '\'' +
                ", Romms=" + Arrays.toString(Rooms) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(Hotelname, hotel.Hotelname) &&
                Arrays.equals(Rooms, hotel.Rooms);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(Hotelname);
        result = 31 * result + Arrays.hashCode(Rooms);
        return result;
    }
    public void hotel(){
        Rooms = new Room[3][6];
        for (int i = 0;i<Rooms.length;i++)
        {
            for (int j = 0;j<Rooms[i].length;j++)
            {
                if(i==0)
                    Rooms[i][j] = new Room((i+1)*100+j+1,"标准间",true);
                else if (i==1)
                    Rooms[i][j] = new Room((i+1)*100+j+1,"豪华间",true);
                else if(i==2)
                    Rooms[i][j] = new Room((i+1)*100+j+1,"总统套房",true);
            }
        }

    }

    public  void book(int RoomNo){

        Room room = Rooms[RoomNo/100 - 1][RoomNo%100 -1];
        room.setRoomstutas(false);
        System.out.println(RoomNo+"已经预定");
    }
    public  void exit(int RoomNo){

        Room room = Rooms[RoomNo/100 - 1][RoomNo%100 -1];
        room.setRoomstutas(true);
        System.out.println(RoomNo+"已经退房");
    }

    public void print(){
        for(int i = 0;i<Rooms.length;i++)
        {
            for (int j = 0;j<Rooms[i].length;j++)
            {

                System.out.print(Rooms[i][j]);
            }
            System.out.println();
        }

    }

    /*public static void main(String[] args) {

        Hotel hotel = new Hotel();
        hotel.hotel();
        hotel.print();
        hotel.book(301);
        hotel.print();
        hotel.exit(301);
        hotel.print();
    }*/


}
