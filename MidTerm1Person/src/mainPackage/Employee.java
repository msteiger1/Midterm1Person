package mainPackage;

//import java.util.Date;

public class Employee extends Person {

	public String office;
	public double salary;
	private MyDate dateHired;

	public Employee(String name, String address, String phone, String email, String office, double salary, MyDate dateHired) {
		super(name, address, phone, email);
		this.office=office;
		this.salary=salary;
		this.dateHired=dateHired;
	}
	public void setOffice(String office){
        this.office = office;
    }

    public String getOffice(){
        return this.office;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public double getSalary(){
        return this.salary;
    }

    public void setHire(MyDate dateHired){
        this.dateHired = dateHired;
    }

    public MyDate getDateHired(){
        return this.dateHired;
    }
    @Override
    public String toString(){
    	return "Empolyee: " + super.getName();
    }

}

