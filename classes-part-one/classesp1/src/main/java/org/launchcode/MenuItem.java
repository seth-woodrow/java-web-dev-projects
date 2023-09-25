package org.launchcode;

public class MenuItem {
    private String name;
    private  double price;
    private String description;
    private String category;
    private boolean newItem;


    public MenuItem(String name, double price, String description, String category, boolean newItem){
        this.name =name;
        this.price=price;
        this.description=description;
        this.category = category;
        this.newItem=newItem;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNewItem() {
        return newItem;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public void setPrice(double aPrice) {
        this.price = aPrice;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public void setNewItem(boolean aNewItem) {
        this.newItem = aNewItem;
    }
}
