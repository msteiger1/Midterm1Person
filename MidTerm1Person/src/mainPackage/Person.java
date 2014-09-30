package mainPackage;

public class Person {
	
	private String name, address, phone, email;
	
	public Person(String name, String address, String phone, String email){
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.email=email;
	}
	
	//accessors
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String getPhone(){
		return phone;
	}
	public String getEmail(){
		return email;
	}

	//mutators 
	public void setName(String name){
		this.name=name;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public void setEmail(String email){
		this.email=email;
	}
	
	@Override
	public String toString(){
		return "Person:" + this.getName();
	}
}
