class A{
    public A(){
        System.out.println("IN A");
    }
}

class B extends A{
    public B(){
        System.out.println("IN B");
    }
}

class C extends A{
    public C(){
        System.out.println("IN C");
    }
}

class Main{
    public static void main(String[] args) {
        B ob = new B();
        C ob1 = new C();
        System.out.println(ob instanceof A);
        System.out.println(ob1 instanceof A);
    }
}