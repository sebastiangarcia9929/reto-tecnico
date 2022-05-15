/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebastian.garcia.game.service;

import java.util.List;
import com.sebastian.garcia.game.model.Category;
import com.sebastian.garcia.game.model.LEVEL;
import java.util.ArrayList;
/**
 *
 * @author Hewlett Packard
 */
public class CategoryService {

    public List<Category> getCategorys() {
            List<Category> categorys = new ArrayList<>();

            Category category1 = new Category();
            category1.setName("animales");
            category1.setLevel(LEVEL.ONE.getValue());

            Category category2 = new Category();
            category2.setName("aviones");
            category2.setLevel(LEVEL.TWO.getValue());

            Category category3 = new Category();
            category3.setName("casas");
            category3.setLevel(LEVEL.THREE.getValue());

            Category category4 = new Category();
            category4.setName("castillos");
            category4.setLevel(LEVEL.FOUR.getValue());

            Category category5 = new Category();
            category5.setName("barcos");
            category5.setLevel(LEVEL.FIVE.getValue());

            categorys.add(category1);
            categorys.add(category2);
            categorys.add(category3);
            categorys.add(category4);
            categorys.add(category5);

            return categorys;
    }
}
