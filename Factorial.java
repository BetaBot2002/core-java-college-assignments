public class Factorial {
    public static void main(String[] args) {
        int value=Integer.parseInt(args[0]);
        int fact=1;
        for (int i = value; i >1; i--) {
            fact=fact*i;
        }
        System.out.println("The factorial of "+value+" is: "+fact);
    }
}
