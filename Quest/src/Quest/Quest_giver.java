package Quest;

public class Quest_giver implements Questable{
	private Quest quest;
	
	Quest_giver (Quest q){
		this.quest = q;
	}
	
	public String getQuest(){
		return this.quest.getQuest();
	}
	
	public int getReplyLen() {
		return this.quest.getVariesLen();
	}
	
	public String getReply(int a){
		if (a <= this.quest.getVariesLen()) {
			this.quest = this.quest.getReply(a);
			return this.getQuestText();
		}
		else {
			return "Неправильный ввод ответа. \n" + this.getQuestText();
		}
		
	}
	
	public String getAllVaries(){
		String a = "";
		String[] b = this.quest.getVaries();
		for (int i=0; i<b.length; i++){
			a += Integer.toString(i+1) + " " + b[i] + "\n";
		}
		return a;
	}
	
	public String getQuestText() {
		String a = this.getQuest();
		String b = this.getAllVaries();
		return a + "\n" + b;
	}
	
}
