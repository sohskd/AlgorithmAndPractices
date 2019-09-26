package DesignPattern.IteratorPattern;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator {

    MenuItems[] items;
    int position = 0;

    public DinnerMenuIterator(MenuItems[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        MenuItems menuItem = items[position];
        position += 1;
        return menuItem;
    }
}
