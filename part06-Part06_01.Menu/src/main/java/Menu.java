
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
    boolean same = false;

    for (String food : meals) {
        if (food.equals(meal)) {
            same = true;
            break;
        }
    }

    if (!same) {
        meals.add(meal);
    }
}
public void printMeals(){
    for(String meal:meals){
        System.out.println(meal);
    }
}

public void clearMenu(){
    meals.clear();
}

    // implement the required methods here
}
