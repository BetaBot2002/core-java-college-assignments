// class Entity{
//     final void STATE(){

//     }
// }

// final class Shape extends Entity{
//     void STATE(){

//     }
// }

class Circle /* extends Shape */{
    final double PI=3.14;
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return PI*radius*radius;
    }

    // public void changePI(){
    //     PI=4;
    // }

    public static void main(String[] args) {
        Circle c=new Circle(5);
        System.out.println(c.area());
    }
}