
	/**
	 * This class contains methods to interact with the Person class
	 */
public class Agenda {
	
	public static Person p1 = new Person("John", 7878978, "john@gmail.com");
	public static Person[] agenda = new Person[]{p1};
	public static int l = agenda.length;



	public Agenda(){
	}
	
	/**
	 * The addPerson method will add another Person to the Agenda person array
	 * @param p
	 * 
	 */
	public void addPerson(Person p){
		Person[] agenda2 = new Person[l+1];
		for (int i=0; i<l; i++){
			agenda2[i]=agenda[i];
		}
			agenda2[l]=p;
			agenda=agenda2;
			l++;
	}
	
	/**
	 * This method will display the persons from the agenda array
	 */
	public void listAgenda(){
		System.out.println("Name:" + "\t\t" + "Phone:" + "\t\t" + "Email:");
    	for (Person p : agenda) {
    		if ((p != null) && (p.getName() != null))
			System.out.println(p.toString());
    	}
    	System.out.println("Contacts total: " + l);
	}
	
	/**
	 * This method will perform a search in the agenda array based on a string 
	 * that can correspond to either the person's name or email 
	 * @param searched
	 */
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
	
	/**
	 * This method will perform a search in the agenda array based on an integer
	 * representing the person's phone number.
	 * @param phone
	 */
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
	
	/**
	 * This method will search for a person's name that is stored in the agenda array
	 * and use the second int parameter to update his phone number
	 * @param name
	 * @param updatePhone
	 */
	public void editPerson(String name, int updatePhone){
		Person found = null;
		for (Person p : agenda) {
			if ((p != null) && (p.getName().equalsIgnoreCase(name))){
				p.setPhone(updatePhone);
				found = p;
			}
		}
		if (found != null)
			System.out.println("Person \"" + name + "\" phone number has been updated to " + "\"" + updatePhone + "\"");
		else
    		System.out.println("Person \"" + name + "\" was not found in this Agenda!");
	}
	
	/**
	 * This method will search for a Contact's name that is stored in the agenda array
	 * and use the second String parameter to update his name.
	 * @param name
	 * @param updateName
	 */
	public void editPerson(String name, String updateName){
		Person found = null;
		for (Person p : agenda) {
			if ((p != null) && (p.getName().equalsIgnoreCase(name))){
				p.setName(updateName);
				found = p;
			}
		}
		if (found != null)
			System.out.println("Person \"" + name + "\" has been updated to " + "\"" + updateName + "\"");
		else
    		System.out.println("Person \"" + name + "\" was not found in this Agenda!");
	}
	
	/**
	 * This method will delete a person from the agenda based on the person's name 
	 * @param  name
	 */
	public void deletePerson(String name){
		Person found = null;
		for (Person p : agenda) {
			if ((p != null) && (p.getName() != null) && (p.getName().equalsIgnoreCase(name))){
				found = p;
				p.setName(null);
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
		else
			System.out.println("Contacts total: " + l);
	}
}
	



