class Human{
    Human(){
        this(25);
        System.out.println("Name: Sinchan");
    }

    Human(int age){
        System.out.println("Age: "+age);
    }
}

class Main{
    public static void main(String[] args) {
        Human h=new Human();
    }
}
