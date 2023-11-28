import java.util.Scanner;
import java.lang.Math;
class Math_operations {
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    } 
    double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius; 
    }
}
class Main{ 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        Math_operations obj = new Math_operations();

        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();
 
        System.out.println("Area of the circle: " + obj.calculateArea(r));
        System.out.println("Perimeter of the circle: " + obj.calculatePerimeter(r));

        sc.close();
    } 
}