interface Area { 
    float pi = 3.14F; 
    void cal_area(int dim1,int dim2); 
} 
class Circle implements Area { 
    public void cal_area(int dim1, int dim2){ 
        System.out.println("The area of the circle is : " + 2*pi*dim1); 
    } 
} 
class Rectangle implements Area{ 
    public void cal_area(int dim1, int dim2){ 
        System.out.println("The area of the rectangle is : " + dim1*dim2); 
    } 
}
class Main { 
    public static void main(String[] args) { 
        Circle c1 = new Circle(); 
        c1.cal_area(2, 0);
        Rectangle r1 = new Rectangle(); 
        r1.cal_area(3, 6); 
    } 
}