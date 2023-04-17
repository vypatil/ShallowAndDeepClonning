package ShallowAndDeepClonning;

public class TestDeep {

	public static void main(String[] args) throws CloneNotSupportedException  {
		
		Address a1 = new Address("kop", 416205);
		
		DeepClone d1 = new DeepClone("ram", 200, a1);
		
		System.out.println(d1);
		
		DeepClone d2 = (DeepClone) d1.clone();
		
		System.out.println(d2);
		
		System.out.println(d1 == d2);
		
		d2.getObject().setCity("dubai");
		d2.getObject().setPincode(88888);
		
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println(d1 == d2);

		
	}

}
