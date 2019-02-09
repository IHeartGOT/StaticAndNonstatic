package MyLife;

public class TestMyLife {

	public static void main(String[] args) {
	
	MyLife name = new MyLife();
	name.setname("My name is Prodip Bhowmik");
	name.displayname();
	
	MyLife age = new MyLife("I am " + 38 + " years old");
	
	MyLife address = new MyLife("I live in Woodhaven, New York.");
}
}
