package ShallowAndDeepClonning;

public class DeepClone implements Cloneable {

	String name;
	int id;
	Address object;
	
	public DeepClone(String name, int id, Address object) {
		super();
		this.name = name;
		this.id = id;
		this.object = object;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getObject() {
		return object;
	}


	public void setObject(Address object) {
		this.object = object;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		DeepClone dumyobject = (DeepClone) super.clone();
		Address temp = (Address) dumyobject.getObject().clone();
		
		dumyobject.setObject(temp);
		
		return dumyobject;
	}

	@Override
	public String toString() {
		return "DeepClone [name=" + name + ", id=" + id + ", object=" + object + "]";
	}


	
	
	
	
	
	
		
	}
	
	

	


