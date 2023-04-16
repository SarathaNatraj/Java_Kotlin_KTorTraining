package day7;

public interface Walkable {
	public void walk();
	
	//default keyword - which allows you to have method bodies inside interface
	default public void testDefault() {
		System.out.println(" Isnd");
	}
//	public void sleep();

}
