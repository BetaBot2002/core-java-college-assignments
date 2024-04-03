class Bike {
    int price;
    String model;

    public Bike() {
        this.price = 100000;
        this.model = "Avengers";
    }

    public Bike(int price, String model) {
        this.price = price;
        this.model = model;
    }

    public Bike(String model) {
        this.price = 400000;
        this.model = model;
    }

    public Bike(Bike bike) {
        this.price = bike.price;
        this.model = bike.model;
    }

}

class Main {
    public static void main(String[] args) {
        Bike ob = new Bike();
        Bike ob1 = new Bike(20000, "Pulsar");
        Bike ob2 = new Bike("Himalayan");
        Bike ob3 = new Bike(ob2);

        System.out.println("Price - " + ob.price + ", Model - " + ob.model);
        System.out.println("Price - " + ob1.price + ", Model - " + ob1.model);
        System.out.println("Price - " + ob2.price + ", Model - " + ob2.model);
        System.out.println("Price - " + ob3.price + ", Model - " + ob3.model);
    }
}