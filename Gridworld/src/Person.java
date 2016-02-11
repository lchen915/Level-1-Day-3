
public class Person {
	String name;
	String superpower;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSuperpower() {
		return superpower;
	}
	public void setSuperpower(String superpower) {
		this.superpower = superpower;
	}
	public String toString() {
		String x = name + " has no " + superpower + " skills";
		return x;
	}
}
