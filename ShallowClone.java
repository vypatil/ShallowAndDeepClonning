package ShallowAndDeepClonning;

public class ShallowClone implements Cloneable {

	int id;		// primitive field. not object
	String name;

	public ShallowClone(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	@Override
	public String toString() {
		return "ShallowClone [id=" + id + ", name=" + name + "]";
	}
	
	
	
//	Steps---->
//	
//		1. implements cloneable to the class.
//		2. Override the clone method.
//		3. Throws cloneNotSupportedexception in test class main method.
//		4 . And type cast the second object.
	
//		Note= 
//			 clone() method make default shallow cloning.
	
	
	

}
