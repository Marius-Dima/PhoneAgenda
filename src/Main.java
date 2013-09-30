import java.util.Scanner;

public class Main {
//	public static String search = scan("Enter search parameter: ");
	public static Agenda agenda = new Agenda();


	public static void main(String[] args) {
		agenda.addElement("Mike", "676767", "mike@gmail.com");
		agenda.addElement("imba2", "345345", "imbae@gmail.com");
	//	agenda.listAgenda();

//		agenda.searchElement(search, agenda.names);
//		agenda.searchElement(search, agenda.phones);
//		agenda.searchElement(search, agenda.emails);

	
		//agenda.deleteElement("mike");
		//agenda.listAgenda();
		//agenda.updateElement("mike", agenda.names, "peter");
		agenda.deleteElement("mike");
		//agenda.listAgenda();

	}

	private static String scan (String text){
	     Scanner sc = new Scanner(System.in);
			System.out.println(text);
			String input = sc.next();
			sc.close();

		return input;
	}
	
}


