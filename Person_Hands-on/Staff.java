public class Staff extends Person{
    private String school;
    private double pay;

    public String getSchool() {
    	return school;
    	}
    public double getPay() { 
    	return pay;
    	}
    
    public void setSchool(String school) { 
    	this.school = school;
    	}
    public void setPay(double pay) { 
    	this.pay = pay;
    	}

    public String toString() { 
    	return "name= " + getName() + ", address= " + getAddress() + ", school= " + getSchool() + ", pay= " + getPay(); 
    	}
}