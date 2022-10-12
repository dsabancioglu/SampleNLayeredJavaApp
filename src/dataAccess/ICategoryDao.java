package dataAccess;

import entities.Category;
import entities.Instructor;

import java.util.List;

public interface ICategoryDao {
    void add(Category category);  //Ben bunu eklicem ama yarın öbür gün başka bir şekilde ekleme yapmak isteyebilirim, o yüzden intrface olarak yazıyorum.
    List<Category> getCategories();
    void setCategories(List<Category> categories);
}
