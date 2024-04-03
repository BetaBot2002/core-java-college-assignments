class Counter {
    static int objectCount=0;
    static int result;

    static{
        result=10;
        System.out.println("Result Initialized as: "+result);
    }

    Counter(){
        objectCount++;
    }

    public static void addToResult(int val){
        result+=val;
    }
}

class Main{
    public static void main(String[] args) {
        Counter ob1 = new Counter();
        Counter ob2 = new Counter();
        Counter ob3 = new Counter();

        System.out.println("Total Objects: "+Counter.result);

        Counter.addToResult(10);
        System.out.println("Current Result: "+Counter.result);
        Counter.addToResult(21);
        System.out.println("Current Result: "+Counter.result);
    }
}
