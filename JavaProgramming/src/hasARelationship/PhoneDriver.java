package hasARelationship;

public class PhoneDriver {
	public static void main(String[] args) {
		Phone p1=new Phone();
		System.out.println(p1);
		System.out.println(p1.s);
		p1.insertSim(1234567890);
		System.out.println(p1.s);
		System.out.println(p1.s.number);
	}
}
