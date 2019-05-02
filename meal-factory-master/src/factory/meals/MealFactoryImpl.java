
package factory.meals;

import factory.meals.german.*;

public class MealFactoryImpl implements MealFactory {

    Breakfast breakfest = new Breakfast();
    Lunch lunch = new Lunch();
    Supper supper = new Supper();
    
    @Override
    public Meal getMeal(String mealName) {
        switch (mealName){
            case "breakfast":
                return new Breakfast();
            case "lunch":
                return new Lunch();
            case "supper":
                return new Supper();                
        }
        
        return null;
    }
}
