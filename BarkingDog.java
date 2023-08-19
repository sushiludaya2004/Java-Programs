//Write a method shouldWakeUp that has 2 parameters.
//
//1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
//
//2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
//
//We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true. In all other cases return false.
// If the hourOfDay parameter is less than 0 or greater than 23 return false.

import java.util.Scanner;

public class BarkingDog {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean bn = in.nextBoolean();
        int hour = in.nextInt();
        shouldWakeUp(bn, hour);
    }
    static void shouldWakeUp(boolean barking, int hourOfDay){
        while(barking){
            if((hourOfDay < 8 || hourOfDay >22) && (hourOfDay > 0 && hourOfDay < 24)){
                System.out.println(true);
                break;
            }
            else {
                System.out.println(false);
                break;
            }
        }

    }
}
