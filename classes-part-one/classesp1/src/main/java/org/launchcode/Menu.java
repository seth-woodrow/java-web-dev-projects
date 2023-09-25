package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date update;

    public Menu(ArrayList<MenuItem>menuItems,Date update){
        this.menuItems=menuItems;
        this.update=update;
    }

}
