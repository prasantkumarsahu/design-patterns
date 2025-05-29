package builderPattern;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());

		Meal chickenMeal = mealBuilder.prepareChickenMeal();
		System.out.println("\n\nNon-veg Meal");
		chickenMeal.showItems();
		System.out.println("Total Cost: " + chickenMeal.getCost());
	}
}
