

public class Person {
	private String name;
	private int phone;
	private String email;
	
	public Person(String name, int phone, String email){
		this.name = name;
		this.phone = phone;
		this.email = email;
				
	}
	public int getPhone(){
		return this.phone;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getEmail(){
		return email;
	}

	@Override
	public String toString() {
	return name + "\t\t" + phone + "\t\t" + email;
	}

	public void setPhone(int phone){
		this.phone = phone;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setEmail(String email){
		this.email = email;
	}


}

