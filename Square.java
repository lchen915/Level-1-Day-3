
public class Square {
	int length;
	int area() {
		return (length*length);
	}
	int perimeter() {
		return (4*length);
	}
	Square(int length) {
		this.length = length;
		System.out.println("The length of the square is " + length);
	}
	public static void main(String[] args) {
		Square square1 = new Square(100);
		System.out.println(square1.area());
		Square square2 = new Square(10);
		System.out.println(square2.area());
		System.out.println(square2.perimeter());
	}
}
