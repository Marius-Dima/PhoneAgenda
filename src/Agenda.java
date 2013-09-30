
public class Agenda {
	
	Person p = new Person();
	public String[] names = new String[]{p.getName()};
	public String[] phones = new String[]{p.getPhone()};
	public String[] emails = new String[]{p.getEmail()};
	public static int entryNumber = 1;
	

	public Agenda(){
		//findIndex("nameless", names);
		//addElement("Mike", "345345", "mike@gmail.com");
	}
	
	public void listAgenda(){
		System.out.println("Name:" + "\t\t" + "Phone:" + "\t\t" + "Email:");

		for (int i=0; i<entryNumber; i++){
	    	System.out.println(names[i] + "\t\t" + phones[i] + "\t\t" + emails[i]);
		}
}
		
	public void addElement(String new_name, String new_phone, String new_email){
		//int lenght = names.length;
		String[] addname = new String[entryNumber+1];
		String[] addphone = new String[entryNumber+1];
		String[] addemail = new String[entryNumber+1];
		
		for (int i=0; i<entryNumber; i++){
			addname[i]=names[i];
			addphone[i]=phones[i];
			addemail[i]=emails[i];
		}
			addname[entryNumber]=new_name;
			addphone[entryNumber]=new_phone;
			addemail[entryNumber]=new_email;
			names=addname;
			phones=addphone;
			emails=addemail;
			entryNumber++;
	}
	
	
	public String searchNumber(String num){
    	String found=null;
    	for(int i=0; i<phones.length;i++){
                if(phones[i] != null){
                    if(phones[i].equals(num)){
                    	found=phones[i];
                    }
                }
            }
            return found;
            
        }
	
	public void searchElement(String search, String[] array){
		
	int index = -1;

    for (int i = 0; (i < array.length) && (index == -1); i++) {
        if (array[i].equalsIgnoreCase(search)) {
            index = i;
        }
    }
    if (index != -1){
    	System.out.println("Name:" + "\t\t" + "Phone:" + "\t\t" + "Email:");
    	System.out.println(names[index] + "\t\t" + phones[index] + "\t\t" + emails[index]);
    }
    else{
    	System.out.println(search + " was not found!");}
    
	}
	

	public void updateElement(String search, String[] array, String update){
		
	int index = -1;

    for (int i = 0; (i < array.length) && (index == -1); i++) {
        if (array[i].equalsIgnoreCase(search)) {
            index = i;
        }
    }
    if (index != -1){
    	array[index]=update;
    }
    else{
    	System.out.println(search + " was not found!");}
    
	}
	
	
	public void deleteElement(String removed){
        String[] del = new String[entryNumber-1];
        System.out.println("Name:" + "\t\t" + "Phone:" + "\t\t" + "Email:");

		for (int i = 0; i < entryNumber-1; i++) {
	        if (names[i].equalsIgnoreCase(removed) || phones[i].equalsIgnoreCase(removed) || emails[i].equalsIgnoreCase(removed) ) {
	        	i++;
	        }
	        else{
	        	System.out.println("Term to remove was not found!");
	        }
	    	System.out.println(names[i] + "\t\t" + phones[i] + "\t\t" + emails[i]);

		}
		entryNumber--;
	}
	
	
	public void addName(String added) {
		int lenght = names.length;
		String[] new_name = new String[lenght+1];
		
		for (int i=0; i < lenght;i++){
			new_name[i]=names[i];
		}
		new_name[lenght]=added;
		names = new_name;
	}
}


