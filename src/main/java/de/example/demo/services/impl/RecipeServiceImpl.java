package de.example.demo.services.impl;

import de.example.demo.exceptions.RecipeNotFoundException;
import de.example.demo.models.Recipe;
import de.example.demo.repositoires.RecipeRepository;
import de.example.demo.services.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    @Override
    public Recipe createRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    @Override
    public Recipe findRecipeById(Long id) {
        return recipeRepository.findById(id).orElseThrow(() -> new RecipeNotFoundException(id));
    }
}
