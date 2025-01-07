// 4. Menu Class
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> menuItems;

    public Menu() {
        this.menuItems = new ArrayList<>();
    }
public static void main(String[] args) {
        Menu menu = new Menu();
        MenuItem item1 = new MenuItem("Cheeseburger", 5.99);
        MenuItem item2 = new MenuItem("Fries", 2.99);
        MenuItem item3 = new MenuItem("Soda", 1.99);
        MenuItem item4 = new MenuItem("Salad", 4.99);
        MenuItem item5 = new MenuItem("Pizza", 7.99);
        menu.addMenuItem(item1);
        menu.addMenuItem(item2);
        menu.addMenuItem(item3);
        menu.addMenuItem(item4);
        menu.addMenuItem(item5);
        menu.removeMenuItem(item3);
        menu.removeMenuItem(item5);
        System.out.println("Menu items: ");
        for (MenuItem item : menu.getMenuItems()) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
}
    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
}
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
        System.out.println("Menu item added: " + item.getName());
    }

    public void removeMenuItem(MenuItem item) {
        menuItems.remove(item);
        System.out.println("Menu item removed: " + item.getName());
    }

    public List<MenuItem> getMenuItems() {
        return new ArrayList<>(menuItems);
    }
}

class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

