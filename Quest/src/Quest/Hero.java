package Quest;

public class Hero {
	private Quest_giver place;
	
	Hero(Quest_giver q){
		this.place = q;
	}
	
	public String getQuest() {
		return place.getQuestText();
	}
	
	public String answer(int a) {
		return place.getReply(a);
	}

}
