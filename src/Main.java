

public class Main {

    public static void main(String[] args) {

        MagicBox magicBox = new MagicBox(4);

        magicBox.add("Парось");
        magicBox.add(0.777);
        magicBox.add("Фрось");

        // Внизу раскомитить четвёртый метод add для того что бы продемонстрировать
        // полную коробку и вернуть случайный элемент

       magicBox.add(999);
       magicBox.add(234);

        System.out.println("Вы получаете - " + magicBox.pick());

    }

}
