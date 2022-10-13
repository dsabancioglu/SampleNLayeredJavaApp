package entities;

import entities.base.BaseEntity;

public class Category extends BaseEntity {
    private String name;
    
    public Category(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
