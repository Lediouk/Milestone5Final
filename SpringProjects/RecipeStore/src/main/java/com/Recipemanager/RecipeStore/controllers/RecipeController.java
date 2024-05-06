package com.Recipemanager.RecipeStore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Recipemanager.RecipeStore.models.Recipe;
import com.Recipemanager.RecipeStore.services.RecipeRepository;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    private RecipeRepository repo;
    
    @GetMapping({"", "/"})
    public String showRecipeList(Model model) {
        List<Recipe> recipes = repo.findAll(Sort.by(Sort.Direction.DESC, "id"));
        model.addAttribute("recipes", recipes);
        return "recipes/index";
    }
    
    
    @GetMapping("/create")
    public String showCreatePage(Model model) {
        RecipeDto recipeDto = new RecipeDto();
        model.addAttribute("recipeDto", recipeDto);
        return "recipes/CreateRecipe";
    }
    
    
    @PostMapping("/create")
    public String createRecipe(
            @Valid @ModelAttribute RecipeDto recipeDto,
            BindingResult result
            ) {
        if (result.hasErrors()) {
            return "recipes/CreateRecipe";
        }
        
        // Your create recipe logic goes here
        
        return "redirect:/recipes";
    }
    
    
    @GetMapping("/edit")
    public String showEditPage(
            Model model,
            @RequestParam int id
            ) {
        // Fetch the recipe from the repository based on the ID
        Recipe recipe = repo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid recipe id: " + id));
        RecipeDto recipeDto = new RecipeDto();
        // Map the recipe data to the DTO
        // This depends on how you want to implement the mapping logic
        // For simplicity, let's assume there's a method in RecipeDto to map from Recipe
        RecipeDto.mapFromRecipe(recipe);
        model.addAttribute("recipeDto", recipeDto);
        return "recipes/EditRecipe";
    }
    
    
    @PostMapping("/edit")
    public String updateRecipe(
            @RequestParam int id,
            @Valid @ModelAttribute RecipeDto recipeDto,
            BindingResult result
            ) {
        if (result.hasErrors()) {
            return "recipes/EditRecipe";
        }
        
        // Fetch the recipe from the repository based on the ID
        Recipe recipe = repo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid recipe id: " + id));
        // Update the recipe data from the DTO
        recipeDto.updateRecipe(recipe);
        // Save the updated recipe
        repo.save(recipe);
        
        return "redirect:/recipes";
    }
    
    
    @GetMapping("/delete")
    public String deleteRecipe(
            @RequestParam int id
            ) {
        
        // Delete the recipe from the repository based on the ID
        repo.deleteById(id);
        
        return "redirect:/recipes";
    }

}
