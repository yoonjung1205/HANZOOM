package com.cdp.hanzoom.db.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Recipe {
    @Id
    @Column(name = "recipe_no")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long recipeNo;

    @Column(name = "reference_no")
    Long referenceNo;

    @Column(name = "image_path", length = 300)
    String imagePath;

    @Column(name = "recipe_name", length = 500)
    String recipeName;

    @Column(name = "ingredients")
    @Lob
    String ingredients;

    @Column(name = "recipe")
    @Lob
    String recipe;
}
