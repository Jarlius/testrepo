
public class Dummy {
	
	public static void main(String[] args) {
		System.out.println(StaticTest.whatDoesBagoolSay());
		new Dummy();
	}
	
	public Dummy() {
		ClassTest testclass = new ClassTest();
		ClassTest test = testclass.getCopy();
		if(test == null)
			System.out.println("fail, lul");
	}
	
}
