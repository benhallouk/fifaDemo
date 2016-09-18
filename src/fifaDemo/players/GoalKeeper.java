package fifaDemo.players;

public class GoalKeeper extends Player {

	private String glovesSize; 
	
	public GoalKeeper(int id, int number, String name, String post,String golvesSize) {
		super(id, number, name, post);
		this.glovesSize = golvesSize;
	}

	@Override
	public void Run(int speed){
		System.out.println("Slow running goal keeper with speed "+speed);
	}
	
}
