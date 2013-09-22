
public class Agenda {
	String[] asddf = new String[5];

	Person p = new Person();
	public String[] names = new String[]{p.getName()};
	public String[] phones = new String[]{p.getPhone()};
	public String[] emails = new String[]{p.getEmail()};

	

	public Agenda(){
		//findIndex("nameless", names);
		
//		addElement("dtgd");
//		System.out.println(phones.length + "agenda");
//		String pi = p.getPhone();
//		for (String string : pi) {
//			System.out.println(string);	}
//	}
//	
//	public void addElement(String element){
//		int lenght = p.getPhone().length();
//		String[] new_phone = new String[lenght+1];
//		
//		for (int i=0; i<lenght; i++){
//			new_phone[i]=phones[i];
//		}
//			new_phone[lenght]=element;
//			phone=new_phone;
//			p.setPhone(new_phone);
//	}
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
	
	public void findIndex(String search, String[] array){
		
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
	
	public void editElement(String element_old, String update){
    	for(int i=0; i<phones.length;i++){
            if(phones[i] != null){
                if(phones[i].equals(element_old)){
                	phones[i]=update;
                	p.setPhone(phones[i]);
               
                }
            }
        }
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


