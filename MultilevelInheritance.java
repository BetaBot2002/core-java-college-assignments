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

class C extends B{
    public C(){
        System.out.println("IN C");
    }
}

class Main{
    public static void main(String[] args) {
        C ob = new C();
        System.out.println(ob instanceof A);
        System.out.println(ob instanceof B);
        System.out.println(ob instanceof C);
    }
}