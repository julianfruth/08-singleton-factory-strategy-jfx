package ohm.softa.a08.controller;

import ohm.softa.a08.model.Meal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class BaseFilter implements MealFilter {
	@Override
	public List<Meal> filter(List<Meal> listToFilter) {
		return listToFilter.stream().filter(this::include).collect(Collectors.toCollection(ArrayList::new));
	}

	abstract boolean include(Meal meal);
}
