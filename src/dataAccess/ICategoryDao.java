package dataAccess;

import entities.Category;
import entities.Instructor;

import java.util.List;

public interface ICategoryDao {
    void add(Category category);
    List<Category> getCategories();
    void setCategories(List<Category> categories);
}
