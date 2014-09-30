package mainPackage;

public class Staff extends Employee {
	public String title;

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public Staff(String name, String address, String phone, String email,
			String office, double salary, MyDate dateHired, String hours,
			int rank, String title) {
		super(name, address, phone, email, office, salary, dateHired);

		this.title = title;

	}
	@Override
	public String toString(){
		return "Staff member: " + super.getName();
	}
}