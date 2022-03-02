//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class Rational implements Comparable<Rational> {
	// add two instance variables
	int num1;
	int den1;

	// write two constructors
	public Rational() {
		setRational(1, 1);
	}

	public Rational(int a, int b) {
		setRational(a, b);
	}
	// write a setRational method

	// write a set method for numerator and denominator
	public void setRational(int a, int b) {
		num1 = a;
		den1 = b;
	}

	public void add(Rational other) {
		// num1/den1 + num2/den2
		// new numerator = (num1 * den2 + num2 * den1)
		// new denominator = (den1 * den2)
		num1 = (num1*other.den1 + other.num1*den1);
		den1 = den1*other.den1;
		reduce();
	}

	private void reduce() {
int g = gcd(num1, den1);
num1 = num1/g;
den1=den1/g;
	}

	private int gcd(int numOne, int numTwo) {
		int big = 1;
		for(int i = 1; i<=numOne; i++) {
			if(numOne%i==0&&numTwo%i==0) {
				big = i;
			}
		}
		return big;
	}

	public Object clone() {
		
		return new Rational(num1, den1);
	}

	// ACCESSORS

	// write get methods for numerator and denominator
public int getNum() {
	return num1;
}
public int getDen() {
	return den1;
}
	public boolean equals(Object obj) {
		if(obj.getClass()== Rational.class) {
			if(parse(obj.toString())==parse(toString())) {
				return true;
			}
		}
		return false;
	}
public double parse(String ratio) {
	    if (ratio.contains("/")) {
	        String[] rat = ratio.split("/");
	        return Double.parseDouble(rat[0]) / Double.parseDouble(rat[1]);
	    } else {
	        return Double.parseDouble(ratio);
	    }
	}
	public int compareTo(Rational other) {

		return toString().compareTo(other.toString());
	}

	// write toString() method
	public String toString() {
		return num1 + "/"+den1;
	}

}