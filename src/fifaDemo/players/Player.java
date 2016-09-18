package fifaDemo.players;

public class Player {
	private int id;
	public int getId(){
		return id;
	}	
	
	private int number;	
	public int getNumber(){
		return number;
	}
	public void setNumber(int newNumber){		
		number = newNumber;
	}
	
	private String name;
	public String getName(){
		return name;
	}
	
	
	private String post;
	public String getPost(){
		return post;
	}
	public void setPost(String newPost){
		//check contract for condition
		post = newPost;
	}
	
	private int positionX;
	public int getPositionX(){
		return positionX;
	}
	
	public Player(int id, int number, String name, String post){
		this.id = id;
		this.number = number;
		this.name = name;
		this.post = post;
	}
	
	//Run
	public void Run(int speed){
		positionX= positionX + positionX * speed;
		
		System.out.println("Running with speed "+speed);
	}
	
	//Shoot
	public void Shoot(int horizontalDegree, int verticalDegree){
		System.out.println("Shoot on target h:"+horizontalDegree+", v:"+verticalDegree);
	}
	
	//Pass
	public String Pass(Player targetPlayer, int horizontalDegree){
		//if(horizontalDegree == positionX)
			return "Good";
		//else
			//return "Bad";
	} 
	
	//LongPass
	public String LongPass(Player targetPlayer, int horizontalDegree, int verticalDegree){
		return "Good";
	}
	
	//Tackle	
	public String Tackle(Player targetPlayer){
		return "Good";
	}
}
