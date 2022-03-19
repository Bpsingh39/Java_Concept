package abstraction;

public class ConsumerInterface implements DemoInterface{
    @Override
    public void display() {
        System.out.println("override abstract method display :");
    }

    @Override
    public void display1() {
        System.out.println("override abstract method display1 :");

    }

    @Override
    public void display2() {
        System.out.println("override abstract method display2 :");

    }

    public static void main(String[] args) {
        ConsumerInterface obj=new ConsumerInterface();
        obj.display();
        obj.display1();
        obj.display2();
    }
}
