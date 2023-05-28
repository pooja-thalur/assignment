public class ComplexNumber {
	int real;
	int imaginary;
	
	//default constructor
	ComplexNumber(){
		
	}
	
	//parameterized
	ComplexNumber(int real, int imaginary){
		this.real =real;
		this.imaginary=imaginary;
	}
	
	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
		int real = c1.real+c2.real;
		int img = c1.imaginary+c2.imaginary;
		return new ComplexNumber(real, img);
	}
	
	public static ComplexNumber subtract(ComplexNumber c1, ComplexNumber c2) {
		int real = c1.real-c2.real;
		int img = c1.imaginary-c2.imaginary;
		return new ComplexNumber(real, img);
	}
	
	public void print(){
		System.out.println("Real : "+this.real+" Imaginary part : "+this.imaginary);
	}
}
