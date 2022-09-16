package aop;

//@Getter
public class aop_person {
	private String name;
	public String id;
	public int age;
	public int level;
	
	public aop_person(String name, String id, int age, int level) {
		this.name = name;
		this.id = id;
		this.age = age; 
		this.level = level;
	}
	
	public String getName() {
		return name;
	}

	
	public String getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getLevel() {
		return level;
	}
}
