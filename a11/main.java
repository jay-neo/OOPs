class Student{ 
    String Name; 
    int Roll_No; 
    void put_data(String name, int roll){ 
        this.Name = name; 
        this.Roll_No = roll; 
    } 
    void get_data(){ 
        System.out.println("Student : " + Name); 
        System.out.println("Roll no : " + Roll_No); 
    } 
} 
class Test_marks extends Student{ 
    double Marks1;
    double Marks2; 
    void put_data(String na, int roll, double m1, double m2){ 
        super.put_data(na, roll); 
        this.Marks1 = m1; 
        this.Marks2 = m2; 
    } 
    void get_data(){ 
        super.get_data(); 
        System.out.println("Marks1 = " + Marks1); 
        System.out.println("Marks2 = " + Marks2); 
    } 
} 
interface CCA_Score{ 
    int CCA_credit = 5; 
    void show_cca_cred(); 
}
class Sem_Result extends Test_marks implements CCA_Score { 
    void put_data(String name, int roll, double m1, double m2){ 
        super.put_data(name, roll, m1, m2); 
    } 
    void get_data(){ 
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
        s1.put_data("Jagadish Sau", 55, 100, 99); 
        s1.get_data();
    } 
} 