package ohm.softa.a08.controller;

import ohm.softa.a08.model.Meal;

import java.util.HashSet;
import java.util.Set;

public class CategoryFilter extends BaseFilter {

	private boolean include;
	private String[] categoryName;

	public CategoryFilter(boolean include, String... categoryName) {
		this.include = include;
		this.categoryName = categoryName;
	}

	@Override
	boolean include(Meal meal) {
			for(String name : categoryName){
				if(include){

				}
				return meal.getCategory().contains(name);
			}

	}
}
