
public class Circle {

	public static void main(String[] args) {
		Circle c = new Circle(3);
		System.out.println("Area of circle with radius 3 is = " + c.getArea());
		Cylinder cy = new Cylinder(2);
		System.out.println("Volume of cylinder with radius 2 and height 2 is = " + cy.getVolume());
	}
	double radius;
	public Circle(double Radius) {
		if(Radius < 0 ) {
			this.radius = 0;
		}
		else
		this.radius = Radius;
		
	}
	public double getRadius() {
		return this.radius;
	}
	public double getArea() {
		double area = Math.PI * this.radius * this.radius;
		return area;
	}

}
