package com.Recipemanager.RecipeStore.controllers;

import org.springframework.web.multipart.MultipartFile;
import com.Recipemanager.RecipeStore.models.Recipe;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class RecipeDto {
    @NotEmpty(message = "The name is required")
    private String name;

    @NotEmpty(message = "The category is required")
    private String category;

    @Size(min = 10, message = "The description should be at least 10 characters")
    @Size(max = 2000, message = "The description cannot exceed 2000 characters")
    private String description;

    private MultipartFile imageFile;

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }

    // Method to update RecipeDto from Recipe entity
    public void updateRecipe(Recipe recipe) {
        if (recipe != null) {
            this.name = recipe.getName();
            this.category = recipe.getCategory();
            this.description = recipe.getDescription();
            // You can update other fields here
        }
    }

    // Method to map Recipe entity to RecipeDto
    public static RecipeDto mapFromRecipe(Recipe recipe) {
        if (recipe != null) {
            RecipeDto recipeDto = new RecipeDto();
            recipeDto.setName(recipe.getName());
            recipeDto.setCategory(recipe.getCategory());
            recipeDto.setDescription(recipe.getDescription());
            // You can map other fields here
            return recipeDto;
        }
        return null;
    }
}
