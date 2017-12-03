package com.hfad.starbuzz;

/**
 * Created by krist on 30.11.2017..
 */

public class FoodMacros {

    private int protein;
    private int carbohydrate;
    private foodFats fat;
    private int sodium;
    private int cholesterol;
    private int fiber;

    public static FoodMacros dummy=new FoodMacros(0,0,foodFats.lean,0,0,0);

    public FoodMacros(int protein, int carbohydrate, foodFats fat, int sodium, int cholesterol, int fiber) {
        this.protein = protein;
        this.carbohydrate = carbohydrate;
        this.fat = fat;
        this.sodium = sodium;
        this.cholesterol = cholesterol;
        this.fiber = fiber;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public foodFats getFat() {
        return fat;
    }

    public void setFat(foodFats fat) {
        this.fat = fat;
    }

    public int getSodium() {
        return sodium;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public int getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(int cholesterol) {
        cholesterol = cholesterol;
    }

    public int getFiber() {
        return fiber;
    }

    public void setFiber(int fiber) {
        fiber = fiber;
    }

    @Override
    public String toString() {
        return "FoodMacros{" +
                "protein=" + protein +
                ", carbohydrate=" + carbohydrate +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", cholesterol=" + cholesterol +
                ", fiber=" + fiber +
                '}';
    }
}
