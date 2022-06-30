package inhariTance;

public class ParentClass {
	int A= 35;
	int B= 45;

	public static void main(String[] args) {
		ParentClass efd = new ParentClass();
		efd.firstmethod();

	}
public void firstmethod() {
	int c=A+B;
	System.out.println("this is parentclass" +c);
}
}
