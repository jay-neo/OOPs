import java.util.Scanner;
abstract class Shape{
    int a;
    int b;
    void get(){ }
    void cal_area(){ }
}
class Square extends Shape{
    void get(){
        System.out.println("Side of the square: " + a);
    }
    void put(){
        Scanner sc  = new Scanner(System.in); 
        System.out.print("Enter the side of square: "); 
        this.a = sc.nextInt(); 
        while(this.a<=0){ 
            System.out.print("Invalid Input!!!\nEnter the side value again: "); 
            this.a = sc.nextInt(); 
        } 
    }
    void cal_area(){
        System.out.println("Area of the square: " + Math.round(a*b*100.0)/100.0);
    }
}
class Rectangle extends Shape{
    void get(){ 
        System.out.println("For the rectangle length: " + a + " and width: "+b+"\n"); 
    }
    void put(){ 
        Scanner sc  = new Scanner(System.in); 
        System.out.print("Enter the length of rectangle : "); 
        this.a = sc.nextInt(); 
        while(this.a<=0){ 
            System.out.print("Invalid Input!!!\nEnter the length value again : "); 
            this.a = sc.nextInt(); 
        } 
        System.out.print("Enter the width of the rectangle : "); 
        this.b = sc.nextInt(); 
        while(this.b<=0){ 
            System.out.print("Invalid Input!!!\nEnter the width value again : "); 
            this.b = sc.nextInt(); 
        } 
    } 
    void cal_area(){ 
        System.out.println("Area of the rectangle: " + a*b); 
    }
}
class Triangle extends Shape{
    void get(){
        System.out.println("For the triangle base: " + a + " and height: " + b);
    }
    void put(){
        Scanner sc  = new Scanner(System.in); 
        System.out.print("Enter the base of triangle : "); 
        this.a = sc.nextInt(); 
        while(a<=0){ 
            System.out.print("Invalid Input!!!\nEnter the base value again : "); 
            this.a = sc.nextInt(); 
        } 
        System.out.print("Enter the height of triangle : "); 
        this.b = sc.nextInt(); 
        while(b<=0){ 
            System.out.print("Invalid Input!!!\nEnter the height value again : "); 
            this.b = sc.nextInt(); 
        } 
    } 
    void cal_area(){
        System.out.println("Area of the square: " + 0.5*a*b); 
    }
}
class Main{
    public static void main(String[] args){
        Square s1 = new Square(); 
        s1.put(); 
        s1.cal_area(); 
        s1.get();
        Triangle t1 = new Triangle(); 
        t1.put(); 
        t1.cal_area(); 
        t1.get(); 
        Rectangle r1 = new Rectangle(); 
        r1.put(); 
        r1.cal_area(); 
        r1.get(); 
    }
}