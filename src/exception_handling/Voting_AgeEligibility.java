package exception_handling;

import java.util.Scanner;

public class Voting_AgeEligibility {
    public void vote()throws VotingException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your AGE ");
        int age=sc.nextInt();
        if(age<18){
            System.out.println("you are not eligible fo vote :");
            throw new VotingException("you are not eligibility for vote :");
        }
        else {
            System.out.println("welcome to vote...");
        }
    }
    public static void main(String[] args) {
        Voting_AgeEligibility ve=new Voting_AgeEligibility();
        try {
            ve.vote();
        }
        catch (VotingException e){
            e.printStackTrace();

        }

    }
}
