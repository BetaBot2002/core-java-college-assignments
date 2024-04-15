class A{
    void f1(){
        class B{
            void f2(){
                System.out.println("In B");
            }
        }
        new B().f2(); 
    }

    public static void main(String[] args) {
        new A().f1();
    }
}
