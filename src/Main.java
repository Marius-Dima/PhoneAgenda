
public class Main {
	
	public static Agenda agenda = new Agenda();

	public static void main(String[] args) {

		Person p2 = new Person("Mike", 3343333, "mike@gmail.com");

		agenda.addPerson(p2);
		agenda.addPerson(new Person("Peter", 1212121, "Peter@gmail.com"));
		agenda.listAgenda();
		
		System.out.println();
		System.out.println("\t Testing the findPerson() method");
		
		agenda.findPerson("mike");
		agenda.findPerson(1231233);
		agenda.findPerson("john@gmail.com");
		
		System.out.println();
		System.out.println("\t Testing the editPerson() method");
		
		agenda.editPerson("mike", 5555555);
		agenda.editPerson("mike", "mike2");
		agenda.listAgenda();
		
		System.out.println();
		System.out.println("\t Testing the detelePerson() method");
		
		agenda.deletePerson("mike2");
//		agenda.deletePerson("other");

		System.out.println();
		System.out.println("Final listing: ");
		agenda.listAgenda();

	}


	}
	


