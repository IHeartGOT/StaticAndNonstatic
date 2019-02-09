package MyLife;

public class MyLife {
	public String name;
	public String address;
	public int num;

		//constructor 1 
		public MyLife() {}
		
		//constructor 2
		public MyLife (String name) {
			this.name = name;
			System.out.println(name);	
		}

		public MyLife(int age) {
			this.num = age;
			System.out.println(age);
			
		}
		public void setname(String name) {
			this.name = name;
			
		}
		public void displayname() {
			System.out.println(this.name);	
		}
		
		public void displayaddress() {
			System.out.println(this.address);
		}
}
