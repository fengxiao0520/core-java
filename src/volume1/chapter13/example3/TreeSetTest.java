package volume1.chapter13.example3;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Toms", 123));
        parts.add(new Item("Widget", 222));
        parts.add(new Item("Modem", 2334));
        System.out.println(parts);

        SortedSet<Item> sortByDescription = new TreeSet<>(new Comparator<Item>() {

            @Override
            public int compare(Item o1, Item o2) {
                String descriptionA = o1.getDescription();
                String descriptionB = o2.getDescription();
                return descriptionA.compareTo(descriptionB);
            }
        });
        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }
}

class Item implements Comparable<Item> {

    private String description;

    private int partNumber;

    public Item(String aDescription, int aPartNumber) {
        description = aDescription;
        partNumber = aPartNumber;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "[description=" + description + ",partNumber=" + partNumber + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Item item = (Item) obj;
        return description.equals(item.getDescription()) && partNumber == item.partNumber;
    }

    @Override
    public int hashCode() {
        return 13 * description.hashCode() + 17 * partNumber;
    }

    @Override
    public int compareTo(Item o) {
        return partNumber - o.partNumber;
    }

}
