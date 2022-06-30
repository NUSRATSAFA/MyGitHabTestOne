package inhariTance;

public class ChildClass extends ParentClass {
	int j = 20;
	int k = 30;

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.justTest();
		obj.firstmethod();

	}
public void justTest(){
	int l= k-j;
	System.out.println("this is childclass" +l);	 	
}
}
