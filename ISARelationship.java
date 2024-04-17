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

class Main{
    public static void main(String[] args) {
        B ob = new B();
        System.out.println(ob instanceof A);
    }
}