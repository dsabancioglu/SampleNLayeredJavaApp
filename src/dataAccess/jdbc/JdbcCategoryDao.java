package dataAccess.jdbc;

import dataAccess.ICategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class JdbcCategoryDao implements ICategoryDao {
    private List<Category> categories;

    public JdbcCategoryDao(){
        this.categories = new ArrayList<Category>();
    }
    @Override
    public void add(Category category) {  //SQL
        this.categories.add(category);
        System.out.println("Kategoriler Jdbc ile db'e eklendi "+ category.getName());
    }
    public List<Category> getCategories() {
        return categories;
    }
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
