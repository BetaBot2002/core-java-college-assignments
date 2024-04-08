package PackageExamples.AccessModifiers;
import PackageExamples.AccessModifiers.packages.A;
import PackageExamples.AccessModifiers.packages.B;
//Errors are intentionaly kept
public class C extends A{
    public static void main(String[] args) {
        C ob1= new C();

        System.out.println(ob1.A);
        System.out.println(ob1.B);
        System.out.println(ob1.C);
        System.out.println(ob1.D);
    }
}
