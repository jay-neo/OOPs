class Complex{
	private int a;
	private int b;
	Complex(int aa,int bb){
		this.a = aa;
		this.b = bb;
	}
	public Complex add(Complex CC){
		Complex C = new Complex(0,0);
		C.a = this.a + CC.a;
		C.b = this.b + CC.b;
		return C;
	}
	public Complex sub(Complex CC){
		Complex C = new Complex(0,0);
		C.a = this.a - CC.a;
		C.b = this.b - CC.b;
		return C;
	}
	public void display(){
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	public static void main(String[] args){
		Complex C1 = new Complex(1,2);
		Complex C2 = new Complex(3,4);
		Complex C3 = C1.add(C2);
		Complex C4 = C2.sub(C3);
		C1.display();
		C2.display();
		C3.display();
		C4.display();
	}
}