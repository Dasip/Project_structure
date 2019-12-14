package Quest;

public class Quest implements Questable {
	private String quest;
	private String[] varies;
	private String reply;
	private int correct;
	private boolean active;
	
	Quest(String q, String[] a, String r, int c){
		this.quest = q;
		this.varies = a;
		this.reply = r;
		this.correct = c;
		this.active = true;
		
	}
	
	public String getQuest(){
		if (this.active) return this.quest;
		else return "";
	}
	
	public String[] getVaries(){
		if (this.active) return this.varies;
		else{
			String[] a = new String[0];
			return a;
		}
	}
	
	public String getReply(int a){
		if (a == this.correct+1){
			this.active = false;
			return this.reply;}
		else{
			return "Вы не сделали ничего полезного";
		}
		
	}
	
	private boolean getActive(){
		return this.active;
	}

}
