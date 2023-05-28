
public class TestComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumber cnumb1 = new ComplexNumber(1,2);
		ComplexNumber cnumb2 = new ComplexNumber(5,6);
		cnumb1.print();
		cnumb2.print();
		
		// add complex numbers
		ComplexNumber res = ComplexNumber.add(cnumb1, cnumb2);
		res.print();
		
		//subtract complex numbs
		res = ComplexNumber.subtract(cnumb1, cnumb2);
		res.print();
	}

}
