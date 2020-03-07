import java.util.Scanner;

public class Yes {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String days;
     //   double day;
        System.out.println("Enter a number: ");
       int day = input.nextInt();

        System.out.println(getDayName(day));

    }

    public static String getDayName(int day) {
        String dayName = "";
        switch (day){
            case 1 : dayName = "Monday";break;
             case 2 : dayName = "Tuesday";break;
            case 3 : dayName = "Wednesday";break;
            case 4 : dayName = "Thrusday";break;
            case 5 : dayName = "Friday";break;
            case 6 : dayName = "Saturday";break;
            case 7 : dayName = "Sunday";break;

        }

       return dayName;
    }
}
