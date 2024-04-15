package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private final ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    public Menu() {
        this.menuItems = new ArrayList<>();
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void addItem(MenuItem item) {
        if (!hasDuplicate(item)) {
            menuItems.add(item);
            lastUpdated = new Date();
        } else {
            System.out.println("Duplicate item found. This item already exists in the menu.");
        }
    }

    public void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = new Date();
    }

    public void printMenuItem(MenuItem item) {
        System.out.println("Name: " + item.getName());
        System.out.println("Description: " + item.getDescription());
        System.out.println("Price: " + item.getPrice());
        System.out.println("Category: " + item.getCategory());
        System.out.println("Is New: " + (item.isNew() ? "Yes" : "No"));
    }

    public void printMenu() {
        if (menuItems.isEmpty()) {
            System.out.println("The menu is empty.");
        } else {
            System.out.println("Menu:");
            for (MenuItem item : menuItems) {
                printMenuItem(item);
                System.out.println();
            }
        }
    }

    private boolean hasDuplicate(MenuItem newItem) {
        for (MenuItem item : menuItems) {
            if (item.equals(newItem)) {
                return true;
            }
        }
        return false;
    }
}
