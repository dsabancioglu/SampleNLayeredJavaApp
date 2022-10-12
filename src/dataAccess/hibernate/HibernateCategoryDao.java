package dataAccess.hibernate;

import dataAccess.ICategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class HibernateCategoryDao implements ICategoryDao {
    private List<Category> categories;

    public HibernateCategoryDao(){
        this.categories = new ArrayList<Category>();
    }
    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public void add(Category category) {
        this.categories.add(category);
        System.out.println("Kategoriler Hibernate ile db'e eklendi " + category.getName());
    }


}
