package de.example.demo.controller.impl;

import de.example.demo.controller.RecipeControllerApi;
import de.example.demo.models.Recipe;
import de.example.demo.services.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RecipeController implements RecipeControllerApi {

    private final RecipeService recipeService;

    @Override
    public Recipe createRecipe(Recipe recipe) {
        return recipeService.createRecipe(recipe);
    }

    @Override
    public Recipe findRecipeById(Long id) {
        return recipeService.findRecipeById(id);
    }
}
