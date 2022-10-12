package business;

import dataAccess.ICategoryDao;
import dataAccess.jdbc.JdbcCategoryDao;
import entities.Category;

import java.util.List;

public class CategoryManager {
    public ICategoryDao categoryDao;
    public List<Category> categories;
    public CategoryManager(ICategoryDao categoryDao, List<Category> categories){
        this.categories = categories;
        this.categoryDao = categoryDao;
    }
    //-- Kategori ismi tekrar edemez
    public void add(Category category) throws Exception{

        for (Category category1 : this.categories){
            if(category1 == category){
                throw new Exception("Bu kategori zaten sistemde kayıtlıdır.");
            }
        }
        this.categoryDao.add(category);
    }
}
