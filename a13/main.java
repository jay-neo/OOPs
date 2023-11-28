import Student_Package.Student;
import CCA_Score_Package.CCA_Score;

class Test_marks extends Student{
    double Marks1;
    double Marks2;
    void put_data(String name, int roll, double m1, double m2){
        super.put_data(name, roll);
        this.Marks1 = m1;
        this.Marks2 = m2;
    }
    public void get_data(){
        super.get_data();
        System.out.println("Marks1 = " + Marks1);
        System.out.println("Marks2 = " + Marks2);
    }
}

class Sem_Result extends Test_marks implements CCA_Score{
    void put_data(String name, int roll, double m1, double m2){
        super.put_data(name, roll, m1, m2);
    }
    public void get_data(){
        super.get_data();
        show_cca_cred();
    }
    public void show_cca_cred(){
        System.out.println("CCA_credit is : " + CCA_credit);
    }
}
class Main {
    public static void main(String[] args) {
        Sem_Result s1 = new Sem_Result();
        s1.put_data("Jagadish Sau", 55, 70, 8.55);
        s1.get_data();
    }
}
