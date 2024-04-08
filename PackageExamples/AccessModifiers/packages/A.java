package PackageExamples.AccessModifiers.packages;

public class A {
    private int A=10;
    protected int B=10;
    public int C=10;
    int D=10;

    public static void main(String[] args) {
        A ob1= new A();

        System.out.println(ob1.A);
        System.out.println(ob1.B);
        System.out.println(ob1.C);
        System.out.println(ob1.D);
    }
}
