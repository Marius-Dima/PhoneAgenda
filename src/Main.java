import java.util.Scanner;

public class Main {
	public static String search = scan("Enter search parameter: ");
	public static Agenda agenda = new Agenda();


	public static void main(String[] args) {
		
		agenda.findIndex(search, agenda.names);
		agenda.findIndex(search, agenda.phones);
		agenda.findIndex(search, agenda.emails);

	

	}

	private static String scan (String text){
	     Scanner sc = new Scanner(System.in);
			System.out.println(text);
			String input = sc.next();
			sc.close();

		return input;
	}
	
}


