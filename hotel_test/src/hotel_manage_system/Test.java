/*
* @author:xofever(wyjzhk)
*
* */
package hotel_manage_system;



import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Hotel hotel = new Hotel();
        System.out.println("欢迎使用"+hotel.getHotelname()+"管理系统！");
        hotel.hotel();
        while (true){
            System.out.println("功能包括：[1]打印所有房间信息,[2]订房,[3]退房[0]推出系统");
            int s1 = s.nextInt();
            if (s1 == 1)
                hotel.print();
            else if (s1==2){
                System.out.println("输入你要预定的房间号！");
                int bookNo = s.nextInt();
                hotel.book(bookNo);
            }
            else if (s1==3){
                System.out.println("输入你要退房1的房间号！");
                int exitNo = s.nextInt();
                hotel.exit(exitNo);
            }
            else if(s1==0)
            {
                System.out.println("欢迎下次使用！");
                return;
            }
            else{
                System.out.println("选择功能出错，请重新输入！");
            }

        }
    }
}
