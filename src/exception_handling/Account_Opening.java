package exception_handling;

import java.util.Scanner;

public class Account_Opening {

    public void accont() throws Minimun_AmountException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("WELCOME TO BANK FOR ACCOUNT OPENING ");
        System.out.println("please enter your amount for open Account :");
        int amount=scanner.nextInt();
        if(amount<5000){
            throw new Minimun_AmountException("sorry insufficient amount for opening Account");
        }
        else {
            System.out.println("Procced Account opening....");
        }
    }

    public static void main(String[] args) {
        Account_Opening account_obj=new Account_Opening();
        try {
            account_obj.accont();
        } catch (Minimun_AmountException e) {
            e.printStackTrace();
        }
    }
}
