public class 

public class Circle {
	double radius;

	public Circle(int r) {
		this.radius = r;
	}

	public Circle() {
		radius = 1;
	}

	double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area(int radius) {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle[*" + radius + "*]";
	}

	public static void main(String[] args) {
		Circle c1 = new Circle(2);
		double area1 = c1.area(3);
		System.out.println(area1);

	}

}
