abstract class Inner{
    abstract void f();
}

class Outer{
    Inner in;
    public Outer(){
        this.in=new Inner() {
            void f(){
                System.out.println("Anonymous");
            }
        };
    }
}

class Main{
    public static void main(String[] args) {
        Outer out=new Outer();
        out.in.f();
    }
}
