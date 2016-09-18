package fifaDemo.stadiums;

public class Wimbeldon implements IStadium {

	@Override
	public String getName() {
		return "Wimbeldon";
	}

	@Override
	public String playStartAnimation() {
		return "Sayadati sadi mar7aban fi "+getName()+" Sda3";
	}

}
