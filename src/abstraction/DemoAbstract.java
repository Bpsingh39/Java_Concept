package abstraction;
//A class which have at least one abstract method
public abstract class DemoAbstract {
    //A method without body is called abstract method
    public abstract void display();
    public void display1(){
        System.out.println("This is a abstract class");
    }

    public static void main(String[] args) {
        //We can not create object of abstract class because  abstract method without body
        //DemoAbstract demoAbstract=new DemoAbstract();
    }
}
