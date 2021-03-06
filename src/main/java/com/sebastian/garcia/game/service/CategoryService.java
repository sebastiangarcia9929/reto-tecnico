package com.sebastian.garcia.game.service;

import java.util.List;
import com.sebastian.garcia.game.model.Category;
import com.sebastian.garcia.game.model.LEVEL;
import java.util.ArrayList;

public class CategoryService {

    public List<Category> getCategorys() {
        List<Category> categorys = new ArrayList<>();

        Category category1 = new Category();
        category1.setName("nivel 1");
        category1.setLevel(LEVEL.ONE.getValue());

        Category category2 = new Category();
        category2.setName("nivel 2");
        category2.setLevel(LEVEL.TWO.getValue());

        Category category3 = new Category();
        category3.setName("nivel 3");
        category3.setLevel(LEVEL.THREE.getValue());

        Category category4 = new Category();
        category4.setName("nivel 4");
        category4.setLevel(LEVEL.FOUR.getValue());

        Category category5 = new Category();
        category5.setName("nivel 5");
        category5.setLevel(LEVEL.FIVE.getValue());

        categorys.add(category1);
        categorys.add(category2);
        categorys.add(category3);
        categorys.add(category4);
        categorys.add(category5);

        return categorys;
    }
}
