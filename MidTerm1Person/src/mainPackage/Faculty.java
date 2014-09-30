package mainPackage;

public class Faculty extends Employee {

	public String officeHours;
	public int rank;

	public void setofficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getOfficeHours() {
		return this.officeHours;
	}

	public void setrank(int rank) {
		this.rank = rank;
	}

	public int getRank() {
		return this.rank;
	}

	public Faculty(String name, String address, String phone, String email,
			String office, double salary, MyDate dateHired, String officeHours,
			int rank) {
		super(name, address, phone, email, office, salary, dateHired);

		this.officeHours=officeHours;
		this.rank = rank;

	}
	@Override
	public String toString(){
		return "Faculty Member:" +super.getName();
	}
}
