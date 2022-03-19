package static_final_keyword;
//if we create final class then no one can extend this class
public class DemoFinal {
    //if declare final variable then no one can change value of variable
    final String name="JITU";
    //if create final method then no one can override this method
    public final void display(){
        System.out.println("this is final method :");
    }
}
