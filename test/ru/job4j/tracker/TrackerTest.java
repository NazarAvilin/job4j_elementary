package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TrackerTest {
    @Test
    public void whenAddNewItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("element");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenfindAll() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("element1");
        Item item2 = new Item("element2");
        Item item3 = new Item("element3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] expect = {item1, item2, item3};
        assertThat(tracker.findAll(), is(expect));
    }

    @Test
    public void whenfindByName() {
        Tracker tracker = new Tracker();
        String value = "element2";
        Item item1 = new Item("element1");
        Item item2 = new Item("element2");
        Item item3 = new Item("element3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] expect = {item2};
        assertThat(tracker.findByName(value), is(expect));
    }

    @Test
    public void whenfindByID() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("element1");
        Item item2 = new Item("element2");
        Item item3 = new Item("element3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        String value = item2.getId();
        Item expect = item2;
        assertThat(tracker.findById(value), is(expect));
    }

}