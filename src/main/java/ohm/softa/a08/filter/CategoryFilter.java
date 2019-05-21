package ohm.softa.a08.filter;

import ohm.softa.a08.model.Meal;

import java.util.Arrays;

public class CategoryFilter extends BaseFilter {

	private boolean include;
	private String[] categoryNames;

	public CategoryFilter(boolean include, String... categoryName) {
		this.include = include;
		this.categoryNames = categoryName;
	}

	@Override
	boolean include(Meal meal) {
		if (include)
			return Arrays.stream(categoryNames)
				.anyMatch(s -> s.equals(meal.getCategory().toLowerCase()));
		else
			return Arrays.stream(categoryNames)
				.noneMatch(s -> s.equals(meal.getCategory().toLowerCase()));

	}
}
