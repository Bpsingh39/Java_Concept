package static_final_keyword;

public class DemoStatic {
    static String name="JITU";
    String sur_name="SINGH";
    /*can we override static method
     yes but there is no use of verride static method because
     we can call static variable and static method by class reference.
    non-static data belongs to object, overriding is run time polymorphism but
    when we use static keyword compile time binding
     */
    public static void display(){
        System.out.println("NAME IS :"+name);
        //we can not use non-static data in static method because non-static data belongs to object.
       // System.out.println("sur_name :"+sur_name);
    }

}
