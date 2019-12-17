package Quest;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		
		String[] a = new String[2];
		a[0] = "Ударить по своей голове";
		a[1] = "Попытаться осмотреться";
		
		String[] b = new String[2];
		b[0] = "Взять факел и пойти по коридору направо";
		b[1] = "Войти в дверь слева";
		
		Quest First = new Quest("Вы просыпаетесь от жуткой головной боли.  будете делать потом?", a);
		Quest Second = new Quest("Вы ударили слишком сильно и ваш мозг расшатался слишком сильно. По всей видимости,"
				+ "вы попали в параллельный мир, где у вас все хорошо.", new String[0]);
		Quest Third = new Quest("Вы открыли глаза и постепенно заметили факел на стене напротив. Вы поняли, что вы"
				+ "в какой-то пещере. Справа от вас в даль уходит коридор, а слева дверь в никуда. Что вы выберете?", b);
		Quest Fourth = new Quest("Вы вошли в дверь и провалились в бездну. Теперь вы обречены вечно падать во тьму.", new String[0]);
		Quest Fifth = new Quest("Вы пошли по коридору и выбрались из пещеры.", new String[0]);
		
		
		Quest[] f_replies = new Quest[2];
		f_replies[0] = Second;
		f_replies[1] = Third;
		
		Quest[] t_replies = new Quest[2];
		t_replies[0] = Fifth;
		t_replies[1] = Fourth;
		
		First.setReplies(f_replies);
		Third.setReplies(t_replies);
		
		Quest_giver Primm = new Quest_giver(First);
		Hero me = new Hero(Primm);
		
		System.out.println(me.getQuest());
		while (Primm.getReplyLen() > 0){
			int c = scan.nextInt();
			System.out.println(me.answer(c));
		}
	}

}
