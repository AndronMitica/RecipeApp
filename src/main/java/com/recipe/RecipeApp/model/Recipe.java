package com.recipe.RecipeApp.model;
import lombok.Data;

@Data
public class Recipe {
    private String recipeTitle;
    private String ingredients;
    private String description;
    private String preparationSteps;
    private int cookingTime;
}