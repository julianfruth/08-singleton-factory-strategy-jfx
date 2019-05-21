package ohm.softa.a08.filter;

import ohm.softa.a08.model.Meal;

public class NotesFilter extends BaseFilter {

	private String note;

	public NotesFilter(String note) {
		this.note = note;
	}

	@Override
	boolean include(Meal meal) {
		return !meal.getCategory().toLowerCase().contains(note);
	}
}
