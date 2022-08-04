import javax.sound.midi.Soundbank;
import java.util.Random;

public class MagicBox<T> {
    private T[] items;
    Random random = new Random();


    public MagicBox(int capacity) {
        this.items = (T[]) new Object[capacity];
    }

    boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        System.out.println("Коробка полна! Не влезает: " + item);
        return false;
    }

    T pick() {
        int j = 0;
        int randomInt = random.nextInt(items.length);
        for (T item : items) {
            if (item == null) {
                j++;
                continue;
            }
        }
        if (j != 0) {
            throw new RuntimeException("Магическая коробка не полна! Ещё " + j + " мест");
        } else
            return items[randomInt];
    }

}

