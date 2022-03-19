package exception_handling;

import java.util.Scanner;

public class DemoCUSTOException {
public void vote() throws AgeException {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Welcome to voting application: Enter your age :");
            int age=scanner.nextInt();
            if(age<18)
                 throw new AgeException("you are not eligible for vote");
            else {
                System.out.println("Welcome to vote :");
            }
}

    public static void main(String[] args) {
        DemoCUSTOException obj=new DemoCUSTOException();
        try {
            obj.vote();
        } catch (AgeException e) {
e.printStackTrace();
        }
    }
}
