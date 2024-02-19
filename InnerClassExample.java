/**
 * InnerClassExample
 */
public class InnerClassExample {
    String name="gaurav";
    static String companyName="numetry technologies";




    class Inner{
        String add="Pune";

    }

    public static void main(String[] args) {
        System.out.println("Inner Class Example");

        InnerClassExample outer=new InnerClassExample();
        InnerClassExample.Inner inner=outer.new Inner();
        System.out.println( outer.name); 
        System.out.println(outer.companyName);
        System.out.println(inner.add);
    }
}