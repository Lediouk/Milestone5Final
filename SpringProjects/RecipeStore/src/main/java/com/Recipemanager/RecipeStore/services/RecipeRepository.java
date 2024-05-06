package com.Recipemanager.RecipeStore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Recipemanager.RecipeStore.models.Recipe;

// Spring JPA will implement it
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {  // To user the RecipeRepository Interface to write the product

}
