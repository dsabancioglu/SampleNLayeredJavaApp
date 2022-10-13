package business;

import core.logging.ILogger;
import dataAccess.ICategoryDao;
import entities.Category;

import java.util.List;

public class CategoryManager {
    public ICategoryDao categoryDao;
    public List<ILogger> loggers;
    public List<Category> categories;

    public CategoryManager(ICategoryDao categoryDao, List<Category> categories, List<ILogger> loggers){
        this.categories = categories;
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }
    //Requirment1-- Kategori ismi tekrar edemez
    public void add(Category category) throws Exception{

        for (Category category1 : this.categories){
            if(category1 == category){
                throw new Exception("Bu kategori zaten sistemde kayıtlıdır.");
            }
        }
        this.categoryDao.add(category);
        for(ILogger logger : loggers){
            logger.log("Yeni kategori eklendi: " + category.getName());
        }
    }
}
