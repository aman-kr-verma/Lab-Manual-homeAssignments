package ShapeandSubclasses;

public class Rectangle extends Shape{
	public double width=1.0;
	public double length=1.0;
	
	public Rectangle() {
		
	}
	public Rectangle(double width, double length) {
		this.width=width;
		this.length=length;
	}
	public Rectangle(double width, double length, String color, boolean filled) {
		this.width=width;
		this.length=length;
		this.color=color;
		this.filled=filled;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		return length*width;
	}
	public double getPerimeter() {
		return 2*(length+width);
	}
	public String toString() {
		return "Rectangle[Shape[color="+ this.getColor() + ",filled=" + this.isFilled() + ",width=" + this.getWidth() + ",length=" + this.getLength() + "]";
	}
	
	
	

}
