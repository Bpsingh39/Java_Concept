package programs;

import java.util.Scanner;

public class Swap_Two_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of X and y :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Before Swap x and y :");
        //*Swaping
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Swaping x and y: "+x +" "+y);
    }
}
