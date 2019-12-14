package Quest;

public class Main {

	public static void main(String[] args) {
		String[] a = new String[2];
		a[0] = "Ударить кулаком";
		a[1] = "Крикнуть заклинание";
		Quest find_Armory = new Quest("Перед вами стена", a, "Стена зашаталась и открылась", 1);
		Location Primm = new Location(find_Armory);
		System.out.println(Primm.getQuest());
		System.out.println(Primm.getAllVaries());

	}

}
