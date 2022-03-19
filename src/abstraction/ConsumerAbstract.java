package abstraction;

public class ConsumerAbstract extends DemoAbstract {

    @Override
    public void display() {
        System.out.println("override abstract display method ");
    }

    public static void main(String[] args) {
        ConsumerAbstract obj=new ConsumerAbstract();
        obj.display();
        obj.display1();
    }
}
