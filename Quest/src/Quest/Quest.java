package Quest;

public class Quest implements Questable {
	private String quest;
	private String[] varies;
	private Quest[] replies;
	private Quest next;
	
	Quest(String q, String[] a, String[] r, Quest[] qr){
		this.quest = q;
		this.varies = a;
		this.replies = qr;
	}
	
	Quest(String q, String[] a){
		this.quest = q;
		this.varies = a;
	}
	
	public String getQuest(){
		return this.quest;
	}
	
	public void setReplies(Quest[] q) {
		this.replies = q;
	}
	
	public String[] getVaries(){
		return this.varies;
	}
	
	public Quest getReply(int a){
		return this.replies[a-1];
		
	}
	
	public int getVariesLen() {
		return varies.length;
	}

}
