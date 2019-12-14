package Quest;

public class Location implements Questable{
	private Quest quest;
	private String intro;
	
	Location (Quest q){
		this.quest = q;
	}
	
	private String getIntro(){
		return this.intro;
	}
	
	public String getQuest(){
		return this.quest.getQuest();
	}
	
	public String[] getVaries(){
		return this.quest.getVaries();
	}
	
	public String getReply(int a){
		return this.quest.getReply(a);
	}
	
	public String getAllVaries(){
		String a = "";
		String[] b = this.getVaries();
		for (int i=0; i<b.length; i++){
			a += Integer.toString(i) + " " + b[i] + "\n";
		}
		return a;
	}
}
