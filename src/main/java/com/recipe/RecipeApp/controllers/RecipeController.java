package com.recipe.RecipeApp.controllers;

import com.recipe.RecipeApp.model.Recipe;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;
@Controller
public class RecipeController {

    private List<Recipe> recipesList = new ArrayList<>();

    @GetMapping("/recipe.add")
    public String addRecipe(Model model) {
        model.addAttribute("recipes", new Recipe());
        return "recipes";
    }

    @GetMapping("/recipe/list")
    public String listRecipes(Model model) {
        model.addAttribute("recipes", recipesList);
        return "recipes";
    }
    public String addRecipe(@ModelAttribute Recipe recipe) {
        recipesList.add(recipe);
        return "redirect:/recipes";
    }
}