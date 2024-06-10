package hasARelationship;

public class Phone {
	Sim s;
	
	public void insertSim(int number) {
		this.s=new Sim(number);
	}
}

class Sim {
	int number;

	Sim(int number) {
		this.number = number;
	}
}