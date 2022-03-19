package concepts;

import java.util.Scanner;

public class Calcy {
            //add
        public void add(int a, int b) {
            int result = a + b;
            System.out.println("ADDITION OF YOUR TWO NUMBERS IS  "  + "=  "+result);
        }

        //subtraction
        public void sub(int a, int b) {
            int result = a - b;
            System.out.println("SUBTRACTION OF YOUR TWO NUMBERS IS  "  + "=  "+result);
        }

        //multi
        public void multi(int a, int b) {
            int result = a * b;
            System.out.println("MULTIPLICATION OF YOUR TWO NUMBERS IS  "  + "=  "+result);
        }

        //divide
        public void divide(int a, int b) {
            int result = a / b;
            System.out.println("REMAINDER OF YOUR TWO NUMBERS IS  "  + "=  " +result);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Calcy obj = new Calcy();
            int i=0;
            do {
                int choice = 0;
                System.out.print("PLEASE ENTER YOUR FIRST NUMBER :");
                int a = sc.nextInt();
                System.out.print("PLEASE ENTER YOUR SECOND NUMBER :");
                int b = sc.nextInt();
                System.out.println("SELECT YOUR CHOICE (1) FOR ADDITION,(2) FOR SUBTRACTION,(3) FOR MULTIPLY and (4) FOR DIVIDE");
                choice = sc.nextInt();
                if (choice == 1) {
                    obj.add(a, b);
                } else if (choice == 2) {
                    obj.sub(a, b);
                } else if (choice == 3) {
                    obj.multi(a, b);
                } else if (choice == 4)
                    obj.divide(a, b);
                else {
                    System.out.println("YOU HAVE ENTERED A WRONG CHOICE");
                }
                System.out.println("PRESS 0 TO CONTINUE OR ANY NUMBER TO EXIT");
                i= sc.nextInt();
            }while (i==0);


        }
    }
