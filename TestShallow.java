package ShallowAndDeepClonning;

public class TestShallow {

	public static void main(String[] args) throws CloneNotSupportedException {


		ShallowClone obj1 = new ShallowClone(100 , "vaibhav");
		
		System.out.println(obj1);
		
		ShallowClone obj2=(ShallowClone) obj1.clone();
		obj2.id=500;
		obj2.name="tush";
		System.out.println(obj2);
		
		System.out.println(obj1 == obj2 );
		
		
		
	}
}
