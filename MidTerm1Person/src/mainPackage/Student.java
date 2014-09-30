package mainPackage;

public class Student extends Person {

	private String classStatus;
	
	public String getclassStatus(){
		return this.classStatus;
	}
	public void setclassStatus(String classStatus){
		this.classStatus=classStatus;
	}
	

	public Student(String name, String address, String phone, String email,
			String classStatus) {
		super(name, address, phone, email);
		this.classStatus = classStatus;
	}
	@Override
	public String toString(){
		return "Student:" + super.getName();
	}
}
