
public class Agenda {
	
	public static Person p1 = new Person("John", 7878978, "john@gmail.com");
	Person p2 = new Person("Mike", 1231232, "mike@gmail.com");

	public static Person[] agenda = new Person[]{p1};
	public static int l = agenda.length;


	public Agenda(){
	}
	
	public void addPerson(Person p){
		Person[] agenda2 = new Person[l+1];
		for (int i=0; i<l; i++){
			agenda2[i]=agenda[i];
		}
			agenda2[l]=p;
			agenda=agenda2;
			l++;
	}
	
	public void listAgenda(){
		System.out.println("Name:" + "\t\t" + "Phone:" + "\t\t" + "Email:");
    	for (Person p : agenda) {
    		if (p != null)
			System.out.println(p.toString());
	   		else
			l--;
    	}
    	System.out.println("Contacts total: " + l);
	}
	
	public void findPerson(String searched){
    	Person found = null;
    	for (Person p : agenda) {
    		if (p != null) 
    			if ((p.getName().equalsIgnoreCase(searched)) || ((p.getEmail().equalsIgnoreCase(searched))))
    				found = p;
    		}
    	if (found != null)
    		System.out.println(found.toString());
    	else
    		System.out.println("Person \"" + searched + "\" was not found in this Agenda!");
	}
	
	public void findPerson(int phone){
    	Person found = null;
    	for (Person p : agenda) {
    		if ((p != null) && ((p.getPhone() == phone)))
    			found = p;
    		}
    	if (found != null)
    		System.out.println(found.toString());
    	else
    		System.out.println("Number \"" + phone + "\" was not found in this Agenda!");
	}
	
	public void editPerson(String name, int updatePhone){
		Person found = null;
		for (Person p : agenda) {
			if ((p != null) && (p.getName().equalsIgnoreCase(name))){
				p.setPhone(updatePhone);
				found = p;
			}
		}
		if (found != null)
			agenda.toString();    	
		else
    		System.out.println("Person \"" + name + "\" was not found in this Agenda!");
	}
	
	public void editPerson(String name, String updateName){
		Person found = null;
		for (Person p : agenda) {
			if ((p != null) && (p.getName().equalsIgnoreCase(name))){
				p.setName(updateName);
				found = p;
			}
		}
		if (found != null)
			p1.toString();    	
		else
    		System.out.println("Person \"" + name + "\" was not found in this Agenda!");
	}
	
	public void deletePerson(String name){
		Person found = null;
		for (Person p : agenda) {
			if ((p != null) && (p.getName().equalsIgnoreCase(name))){
				found = p;
//				p.setName(null);
//				p.setPhone(0);
//				p.setEmail(null);
				p = null;
				l--;
			}
			if (p != null)
				System.out.println(p.toString());
		}
		if (found == null)
			System.out.println("The person to delete: \"" + name + "\" was not found!");
			System.out.println("Contacts total: " + l);
	}
		
}
	



