
// Write your code here
import com.example.recipe;

public class Recipe {
    private int recipeId;
    private String recipeName;
    private String recipeType;
    private List<String> ingredients;

    public Recipe(int recipeId, String recipeName, String recipeType, List<String> ingredients) {
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.recipeType = recipeType;
        this.ingredients = ingredients;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId() {
        this.recipeId = recipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName() {
        this.recipeName = recipeName;
    }

    public String getRecipeType() {
        return recipeType;
    }

    public void setRecipeType() {
        this.recipeType = recipeType;
    }

    public List getIngredients() {
        return ingredients;
    }

    public void setIngredients() {
        this.ingredients = ingredients;
    }
}