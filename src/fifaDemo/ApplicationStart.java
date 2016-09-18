package fifaDemo;

import fifaDemo.players.*;
import fifaDemo.stadiums.*;

public class ApplicationStart {

	
	public static void main(String[] args) {
		
		Wimbeldon stadium = new Wimbeldon();
		System.out.println(stadium.playStartAnimation());
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		GoalKeeper valdes = new GoalKeeper(4,1,"Valdes","GoalKeeper","A");
		
		valdes.Run(1);
		
		
		Player  messi =  new Player(1,10,"MESSI","Hojoum");
		
		
		System.out.println(valdes.LongPass(messi, 180, 0)+" Long pass from "+valdes.getName());
		
		
		System.out.println("Player name is :"+messi.getName());
		
		System.out.println("The Player post is :"+messi.getPost());
		
		messi.setPost("Difa3");
		
		System.out.println("Player new Post is :"+messi.getPost());
		
		messi.Run(2);
		
		messi.Shoot(120,0);
		
		Player neymar = new Player(2,11,"Neymar","Hojoum");
		messi.Pass(neymar,120);
		
	   System.out.println(messi.LongPass(neymar,120,30)+ " Pass");
		
		Player christiano = new Player(3,7,"Christiano","Hojoum");
		System.out.println(messi.Tackle(christiano)+" Tackle");
		
	}
}
