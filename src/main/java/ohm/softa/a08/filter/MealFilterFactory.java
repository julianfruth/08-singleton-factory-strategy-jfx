package ohm.softa.a08.filter;

import java.util.HashMap;
import java.util.Map;

public class MealFilterFactory {

	private static Map<String, MealFilter> filterMap = null;

	private static void initIfNeeded(){
		if(filterMap==null){
			filterMap = new HashMap<>();
			filterMap.put("All", new NoFilter());
			filterMap.put("No pork", new CategoryFilter(false, "schwein"));
			filterMap.put("No soy", new NotesFilter("mit soja"));
			filterMap.put("Vegetarian", new CategoryFilter(true, "vegetarisch", "vegan"));
		}
	}

	public static MealFilter getStartegy(String key){
		initIfNeeded();
		if(key==null){
			return new NoFilter();
		}
		return filterMap.get(key);
	}
}
