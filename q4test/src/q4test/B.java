package q4test;

public class B extends A{
public String message(int x) {
	return "B" + x;
}
public static void main(String[] args) {
	A obj1 = new B();
	B obj2 = new B();
	System.out.println(obj1.message(3));
}
}
