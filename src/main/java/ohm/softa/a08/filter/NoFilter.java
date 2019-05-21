package ohm.softa.a08.filter;

import ohm.softa.a08.model.Meal;

import java.util.List;

public class NoFilter implements MealFilter {
	@Override
	public List<Meal> filter(List<Meal> listToFilter) {
		return listToFilter;
	}
}
