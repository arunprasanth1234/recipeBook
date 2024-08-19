// Write your code here 
package com.example.recipe;

import java.util.ArrayList;
import com.example.recipe.Recipe;

public interface RecipeRepository {
    ArrayList<Recipe> getRecipes();

    Recipe addRecipe(Recipe recipe);

    Recipe getRecipeById(int recipeId);

    Recipe updateRecipe(int recipeId, Recipe recipe);

    void deletRecipe(int recipeId);

}