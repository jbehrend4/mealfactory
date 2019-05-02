package factory.meals;

import factory.meals.german.GermanMealFactory;

public class Driver {

    public static void main(String[] args) {
        GermanMealFactory mealFactory = new GermanMealFactory();
        Hotel hotel = new Hotel(mealFactory);
        hotel.serveMeals();
    }
}
