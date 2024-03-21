import java.util.Scanner;

class IntegerCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public double div(int a, int b) {
        return a / b;
    }
}

class DoubleCalculator extends IntegerCalculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }
}

class StringCalculator extends DoubleCalculator {
    public String add(String a, String b) {
        return a + b;
    }

    public String sub(String a, String b) {
        return a.replace(b, "");
    }
}

class Main {

    public static String getType(String value) {
        try {
            Integer.parseInt(value);
            return "Integer";
        } catch (NumberFormatException e1) {
            try {
                Double.parseDouble(value);
                return "Double";
            } catch (NumberFormatException e2) {
                return "String";
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean isContinued=true;
        String n1, n2;
        String type1, type2;
        StringCalculator calculator = new StringCalculator();

        do {
            System.out.println("Enter the first operand: ");
            n1 = scanner.next();
            System.out.println("Enter the second operand: ");
            n2 = scanner.next();
            type1 = getType(n1);
            type2 = getType(n2);
            boolean isInteger = type1.equals("Integer") && type2.equals("Integer");
            boolean isDouble = type1.equals("Double") || type2.equals("Double");
            boolean isString = !(isInteger || isDouble);
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            if (!isString) {
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
            }
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (isInteger) {
                        System.out.println("Result: " + calculator.add(Integer.parseInt(n1), Integer.parseInt(n2)));
                    } else if (isDouble) {
                        System.out.println("Result: " + calculator.add(Double.parseDouble(n1), Double.parseDouble(n2)));
                    } else {
                        System.out.println("Result: " + calculator.add(n1, n2));
                    }
                    break;
                case 2:
                    if (isInteger) {
                        System.out.println("Result: " + calculator.sub(Integer.parseInt(n1), Integer.parseInt(n2)));
                    } else if (isDouble) {
                        System.out.println("Result: " + calculator.sub(Double.parseDouble(n1), Double.parseDouble(n2)));
                    } else {
                        System.out.println("Result: " + calculator.sub(n1, n2));
                    }
                    break;
                case 3:
                    if (isInteger) {
                        System.out.println("Result: " + calculator.mul(Integer.parseInt(n1), Integer.parseInt(n2)));
                    } else if (isDouble) {
                        System.out.println("Result: " + calculator.mul(Double.parseDouble(n1), Double.parseDouble(n2)));
                    } else {
                        System.out.println("Multiplication is not possible for Strings");
                    }
                    break;
                case 4:
                    if (n2.equals("0")) {
                        System.out.println("Zero division is not possible.");
                        break;
                    }
                    if (isInteger) {
                        System.out.println("Result: " + calculator.add(Integer.parseInt(n1), Integer.parseInt(n2)));
                    } else if (isDouble) {
                        System.out.println("Result: " + calculator.add(Double.parseDouble(n1), Double.parseDouble(n2)));
                    } else {
                        System.out.println("Division is not possible for Strings");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4. Or 0 for exit.");
            }
            System.out.print("Do you want to continue? (yes/no): ");
            isContinued = scanner.next().equalsIgnoreCase("Yes");
        } while (choice != 0 && isContinued);

        scanner.close();
    }
}