class Shape{
    final double PI=3.14;
    class Circle{
        double radius;
        public Circle(double radius){
            this.radius=radius;
        }
        public double area(){
            return PI*radius*radius;
        }
    }
}

class Main{
    public static void main(String[] args) {
        Shape s=new Shape();
        Shape.Circle c=s.new Circle(6);
        System.out.println(c.area());
    }
}
