package programmingPatterns.compositeiterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {

    ArrayList components = new ArrayList();
    Iterator iterator = null;
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }


    @Override
    public void add(MenuComponent component) {
        components.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        components.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) components.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("-------------------------------");

        Iterator iterator = components.iterator();
        while (iterator.hasNext()){
            MenuComponent component = (MenuComponent) iterator.next();
            component.print();
        }

    }

    @Override
    Iterator createIterator() {
        if (iterator == null){
            iterator = new CompositeIterator(components.iterator());
        }
        return iterator;
    }
}
