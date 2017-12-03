package com.hfad.starbuzz;

/**
 * Created by krist on 30.11.2017..
 */

public class Food {

    final private static int RECOMMENDED_DAILY_CALORIES=2000;
    private String name;
    private int calories;
    private String description;
    private FoodMacros macros;
    private int imageResourceId;

    public int getImageResourceId() {
        return imageResourceId;
    }

    public static Food []foods={
        new Food("Hamburger",500,"Meaty heaven",FoodMacros.dummy,R.drawable.hamburger),
        new Food("Cheeseburger",400,"Would you like cheese with your heaven?",FoodMacros.dummy,R.drawable.cheeseburger),
        new Food("Sarma",623,"Wrapped heaven*\n (Potato not included)",FoodMacros.dummy,R.drawable.sarma)
    };

    public Food(String name, int calories, String description, FoodMacros macros,int imageResourceId) {
        this.name = name;
        this.calories = calories;
        this.description = description;
        this.macros = macros;
        this.imageResourceId=imageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FoodMacros getMacros() {
        return macros;
    }

    public void setMacros(FoodMacros macros) {
        this.macros = macros;
    }
    public int getDailyValuePercent()
    {
        return (calories/RECOMMENDED_DAILY_CALORIES)*100;
    }

    @Override
    public String toString() {
        return name;
    }
}
