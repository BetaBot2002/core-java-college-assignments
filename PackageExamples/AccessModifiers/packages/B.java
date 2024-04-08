package PackageExamples.AccessModifiers.packages;
//Errors are intentionaly kept
public class B{
    public static void main(String[] args) {
        A ob1= new A();

        System.out.println(ob1.A);
        System.out.println(ob1.B);
        System.out.println(ob1.C);
        System.out.println(ob1.D);
    }
}
