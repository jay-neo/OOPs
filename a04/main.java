class Account{
    protected long Acc_No;
    protected String C_Name;
    private long Contact_No;
    Account(long acc,String name,long num){
        this.Acc_No = acc;
        this.C_Name = name;
        this.Contact_No = num;
    }
    public void show(){
        System.out.println("Customer Name : " + C_Name);
        System.out.println("Account Number : " + Acc_No);
        System.out.println("Contact Number : " + Contact_No);
    }
}
class Saving_Ac extends Account{
    private double ROI;
    private double Acc_Balance;
    Saving_Ac(long acc,String name,long num,double roi,double balance){
        super(acc,name,num);
        this.ROI = roi;
        this.Acc_Balance = balance;
    }
    public void compute(){
        this.Acc_Balance = Acc_Balance + (Acc_Balance * ROI) / 100.0;
    }
    public void showdata(){
        super.show();
        System.out.println("Account Balance : " + Acc_Balance);
        System.out.println("Return on Investment : " + ROI);
    }
}
class Current_Ac extends Account{
    private double Acc_Balance;
    private double Min_Balance;
    Current_Ac(long acc,String name,long num,double accBal,double minBal){
        super(acc,name,num);
        this.Acc_Balance = accBal;
        this.Min_Balance = minBal;
    }
    public void showdata(){
        super.show();
        System.out.println("Account Balance = " + Acc_Balance);
        System.out.println("Minimum Balance = " + Min_Balance);
    }
}
class TD_Ac extends Account{
    private double Principal;
    private double Term;
    private double ROI;
    private double Maturity_Balance;
    TD_Ac(long acc,String name,long num, double p,double t,double roi,double mBal){
        super(acc,name,num);
        this.Principal = p;
        this.Term = t;
        this.ROI = roi;
        this.Maturity_Balance = mBal;
    }
    public void compute(){
        this.Maturity_Balance = Principal * Math.pow(1 + ROI/100, Term);
    }
    public void showdata(){
        super.show();
        System.out.println("Principal : " + Principal);
        System.out.println("Term : " + Term);
        System.out.println("Return of Investment : " + ROI);
        System.out.println("Maturity Balance : " + Maturity_Balance);
    }
}
class Main{
    public static void main(String[] args){
        Account Ac1 = new Account(1000000055L, "Jagadish Sau", 9711223344L);
        Saving_Ac Ac2 = new Saving_Ac(1000000054L, "Soumyajit Nath", 9722334455L, 12, 500);
        Current_Ac Ac3 = new Current_Ac(1000000042L, "Subarna Mandal", 9733445566L, 100, 400);
        TD_Ac Ac4 = new TD_Ac(1000000062L, "Apurba Maity", 9744556677L, 10, 12, 13, 500);
        Ac2.compute();
        Ac4.compute();
        Ac1.show(); System.out.println("*".repeat(30));
        Ac2.showdata(); System.out.println("*".repeat(30));
        Ac3.showdata(); System.out.println("*".repeat(30));
        Ac4.showdata(); System.out.println("*".repeat(30));
    }
}