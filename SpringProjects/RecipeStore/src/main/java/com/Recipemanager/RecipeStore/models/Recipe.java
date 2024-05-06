package com.Recipemanager.RecipeStore.models;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "RecipeID")
    private int id;
    
    @Column(name = "Name")
    private String name;
    
    @Column(name = "Description", columnDefinition = "TEXT")
    private String description;
    
    @Column(name = "Category")
    private String category;
    
    @Column(name = "Ingredients", columnDefinition = "TEXT")
    private String ingredients;
    
    @Column(name = "Instructions", columnDefinition = "TEXT")
    private String instructions;
    
    @Column(name = "CreatedAt")
    private Date createdAt;
    
    @Column(name = "ImageFileName")
    private String imageFileName;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }
}
