package Student_Package;

public class Student{
    String Name;
    int Roll_No;
    public void put_data(String name, int roll){
        this.Name = name;
        this.Roll_No = roll;
    }
    public void get_data(){
        System.out.println("Student Name: " + Name);
        System.out.println("Roll Number : " + Roll_No);
    }
}
