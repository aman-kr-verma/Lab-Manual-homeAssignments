package ShapeandSubclasses;

public class Shape {
	public String color="red";
    public boolean filled=true;
    
    public Shape() {
    	
    }
    public Shape(String color,boolean filled) {
    	this.color=color;
    	this.filled=filled;
    }
    public String getColor() {
    	return color;
    	}
    public boolean isFilled() {
    	return filled; 
    	}

    public void setColor(String color) {
    	this.color = color;
    	}
    public void setName(boolean filled) {
    	this.filled = filled;
    	}

    public String toString() {
        return "Shape[color= " + this.getColor() + ", filled= " + this.isFilled() +"]";
    }

}
