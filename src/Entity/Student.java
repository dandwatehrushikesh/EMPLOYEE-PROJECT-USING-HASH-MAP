package Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	public static void main(String[] args) {
		Map<String, List<String>> Moviesdb = new HashMap<String, List<String>>();

		List<String> CastingStree2 = new ArrayList<String>();
		CastingStree2.add(" Rajkumar rao");
		CastingStree2.add(" Shraddh kapoor");
		CastingStree2.add(" Pankaj tripathi");

		Moviesdb.put("Stree2", CastingStree2);

		System.out.println(Moviesdb);

		List<String> CastingSairat = new ArrayList<String>();
		CastingSairat.add(" archi");
		CastingSairat.add(" parsha");
		CastingSairat.add(" patil");

		Moviesdb.put("Sairat", CastingSairat);
		System.out.println(Moviesdb);

		List<String> arr = Moviesdb.get(" Sairat");
		System.out.println(arr);
		System.out.println("*********************");

		Set<String> names = Moviesdb.keySet();
		for (String string : names) {
			// System.out.println(string + "----->" + Moviesdb.get(names));
			System.out.println(string);
			for (String an : Moviesdb.get(string)) {
				System.out.println(an);
				for (int i = 0; i < an.length(); i++) {
					System.out.println(an.charAt(i));
				}
				System.out.println("*******************");

			}
			System.out.println("******************");
		}
		System.out.println(names);
	}

}
