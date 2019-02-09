package staticandnonstatic;

public class TestMyLife {

	public static void main(String[] args) {
		
		MyLife prodip = new MyLife();
		prodip.setLifeLine("I Love my Life");
		String prodipLifeLineBefore = prodip.getLifeLine();
		System.out.println("Prodip says: " + prodipLifeLineBefore);
		
		
		MyLife Raju = new MyLife();
		Raju.setLifeLine("I love my family");
		String rajuLifeLine = Raju.getLifeLine();
		System.out.println("Raju says: " + rajuLifeLine);
		
		String prodipLifeLineAfter = prodip.getLifeLine();
		System.out.println("Prodip says: " + prodipLifeLineAfter + " too.");
		
		MyLife.MsgEveryone();

	}

}
