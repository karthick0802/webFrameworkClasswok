package com.example.ex2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.ex2.model.Recipe;
import com.example.ex2.repository.RecipeRepo;



@Service
public class RecipeService {
    
    @Autowired
    public RecipeRepo recipeRepo;

    public Recipe saveRecipe(@RequestBody Recipe recipe)
    {
        return recipeRepo.save(recipe);
    }

    public Recipe getByRecipe(int id)
    {
        return recipeRepo.findById(id).orElse(null);
    }

    public List<Recipe> getAll(String a)
    {
        return recipeRepo.findByRecipeName(a);
    }
}
