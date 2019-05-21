package ohm.softa.a08.controller;

import java.util.HashMap;
import java.util.Map;

public class MealFilterFactory {

	private static Map<String, MealFilter> filterMap = null;

	private static void initIfNeeded(){
		if(filterMap==null){
			filterMap = new HashMap<>();
			filterMap.put("All", new NoFilter());
			filterMap.put("No pork", new CategoryFilter(false, "Schwein"));
			filterMap.put("No soy", new NotesFilter("mit Soja"));
			filterMap.put("Vegetarian", new CategoryFilter(true, "vegetarisch", "vegan"));
		}
	}

	public static MealFilter getStartegy(String key){
		initIfNeeded();
		return filterMap.get(key);
	}
}
