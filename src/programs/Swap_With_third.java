package programs;

import java.util.Scanner;

public class Swap_With_third {
    public static void main(String[] args) {
        int t,x,y;
        //Swap x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value  of x and y :");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Before swap x and y :"+x +" "+y);
        t=x;
        x=y;
        y=t;
        System.out.println("After swap x and y :"+x+ " "+y);

    }
}
