package de.example.demo.services;

import de.example.demo.models.Recipe;


public interface RecipeService {

    Recipe createRecipe(Recipe recipe);

    Recipe findRecipeById(Long id);
}
