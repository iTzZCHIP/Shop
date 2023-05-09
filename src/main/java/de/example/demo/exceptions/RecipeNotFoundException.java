package de.example.demo.exceptions;

public class RecipeNotFoundException extends RuntimeException {

    private static final String RECIPE_NOT_FOUND_EXCEPTION_MESSAGE = "Rezept mit der ID: %d konnte nicht gefunden";

    public RecipeNotFoundException(Long id) {
        super(String.format(RECIPE_NOT_FOUND_EXCEPTION_MESSAGE, id));
    }
}
