class A{
    static int val;
    
    static class Inner{
        public Inner(int val){
            A.val=val;
            System.out.println("Val initialized to "+A.val+" in the Static Inner Class.");
        }
    }
}

class Main{
    public static void main(String[] args) {
        A.Inner ob=new A.Inner(90);
    }
}