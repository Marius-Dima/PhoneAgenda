

public class Person {
	private String name="John";
	private String phone="054645634";
	private String email="John@gmail.com";
	
	public Person(){

	}
	public String getPhone(){
		return this.phone;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String[] listPerson() {
		System.out.println(name + "  " + "  " + phone+ "  " + email);
		return new String[] {name, phone, email};
	}
	

	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setEmail(String email){
		this.email = email;
	}


}

