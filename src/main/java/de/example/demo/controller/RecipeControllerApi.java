package de.example.demo.controller;

import de.example.demo.models.Recipe;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipes")
public interface RecipeControllerApi {

    @Operation(summary = "Anlegen eines Rezepts", tags = "rezept:rezept")
    @ApiResponse(responseCode = "200", description = "Rezept wurde erfolgreich angelegt")
    @PostMapping()
    Recipe createRecipe(@RequestBody final Recipe recipe);

    @Operation(summary = "Rezept mit einer ID: abfangen", tags = "rezept:rezept")
    @ApiResponse(responseCode = "200", description = "Gibt das Rezept mit der gegebenen ID zurück")
    @GetMapping("/{id}")
    Recipe findRecipeById(@PathVariable final Long id);
}
