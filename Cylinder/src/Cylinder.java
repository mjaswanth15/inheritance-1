
public class Cylinder extends Circle {
	double height;
	public Cylinder(double height) {
		super(3);
		if(height < 0) {
			this.height = 0;
		}
		else
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	public double getVolume() {
		double Volume = getArea() * height;
		return Volume;
	}

}

