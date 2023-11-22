import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Shop {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("ASUS", "8", "Windows 11", "Black", "55000");
        Laptop laptop2 = new Laptop("LG", "8", "Windows 10", "White", "53000");
        Laptop laptop3 = new Laptop("Lenovo", "6", "Windows 7", "Grey", "48000");
        Laptop laptop4 = new Laptop("ASUS", "10", "Windows 10", "Black", "60000");
        Laptop laptop5 = new Laptop("ASUS", "10", "Windows 11", "Black", "60000");
        Laptop laptop6 = new Laptop("ASUS", "8", "Windows 11", "Black", "66000");
        Laptop laptop7 = new Laptop("Samsung", "12", "Windows 11", "Black", "75000");

        Set<Laptop> set = new HashSet<>();
        set.add(laptop1);
        set.add(laptop2);
        set.add(laptop3);
        set.add(laptop4);
        set.add(laptop5);
        set.add(laptop6);
        set.add(laptop7);

        System.out.println("Хотети просмотреть ноутбуки отвечающие одному параметру? Нажмите 1 - да и 2 - нет.");
        try (Scanner console = new Scanner(System.in)) {
            int item = console.nextInt();

            if (item == 1) {
                searchLaptop(set);
            } else {
                searchLaptopsParameters(set);
            }
        }
    }

    private static void searchLaptopsParameters(Set<Laptop> set) {
        Map<Integer, String> db = new HashMap<>();
        db.put(1, null);
        db.put(2, null);
        db.put(3, null);
        db.put(4, null);
        db.put(5, null);

        try (Scanner console = new Scanner(System.in)) {
            System.out.println("1 - Имя");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            System.out.println("5 - Цена");
            System.out.println();
            System.out.println("Из списка выбирете 3 критерия для поиска идеального нотбука.");
            int count = 1;

            while (count < 4) {
                System.out.print("Введите один из критериев, по которым вы хотите искать ноутбук: ");
                int item = console.nextInt();
                console.nextLine();
                if (db.containsKey(item)) {
                    if (item == 1) {
                        System.out.print("Введите модель ноутбука: ");
                        String nameLaptop = console.nextLine();
                        db.put(1, nameLaptop);
                        count++;
                    }
                    if (item == 2) {
                        System.out.print("Введите желаемый объем железного диска: ");
                        String volumeFD = console.nextLine();
                        db.put(2, volumeFD);
                        count++;
                    }
                    if (item == 3) {
                        System.out.print("Введите желаемую операционную систему: ");
                        String os = console.nextLine();
                        db.put(3, os);
                        count++;
                    }
                    if (item == 4) {
                        System.out.print("Введите желаемый цвет: ");
                        String color = console.nextLine();
                        db.put(4, color);
                        count++;
                    }
                    if (item == 5) {
                        System.out.print("Введите желаемую стоимость: ");
                        String price = console.nextLine();
                        db.put(5, price);
                        count++;
                    }
                }
            }
            System.out.println();

            for (Laptop laptop : set) {
                if ((db.get(1) == null || laptop.getName().equals(db.get(1))
                        && (db.get(2) == null || laptop.getVolumeFD().equals(db.get(2)))
                        && (db.get(3) == null || laptop.getOS().equals(db.get(3)))
                        && (db.get(4) == null || laptop.getColor().equals(db.get(4)))
                        && (db.get(5) == null || laptop.getPrice().equals(db.get(5))))) {
                    System.out.println(laptop);
                    System.out.println();
                }
            }
        }
    }

    public static void searchLaptop(Set<Laptop> set) {
        Set<Integer> db = new HashSet<>();
        db.add(1);
        db.add(2);
        db.add(3);
        db.add(4);
        db.add(5);

        try (Scanner console = new Scanner(System.in)) {
            System.out.println("1 - Имя");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            System.out.println("5 - Цена");
            System.out.print("Введите критерий, по которому вы хотите искать ноутбуки: ");
            int item = console.nextInt();
            console.nextLine();

            if (db.contains(item)) {
                if (item == 1) {
                    System.out.print("Введите модель ноутбука: ");
                    String nameLaptop = console.nextLine();
                    System.out.println();
                    for (Laptop laptop : set) {
                        if (laptop.getName().equals(nameLaptop)) {
                            System.out.println(laptop);
                            System.out.println();
                        }
                    }
                }
                if (item == 2) {
                    System.out.print("Введите желаемый объем железного диска: ");
                    String volumeFD = console.nextLine();
                    System.out.println();
                    for (Laptop laptop : set) {
                        if (laptop.getVolumeFD().equals(volumeFD)) {
                            System.out.println(laptop);
                            System.out.println();
                        }
                    }
                }
                if (item == 3) {
                    System.out.print("Введите желаемую операционную систему: ");
                    String os = console.nextLine();
                    System.out.println();
                    for (Laptop laptop : set) {
                        if (laptop.getOS().equals(os)) {
                            System.out.println(laptop);
                            System.out.println();
                        }
                    }
                }
                if (item == 4) {
                    System.out.print("Введите желаемый цвет: ");
                    String color = console.nextLine();
                    System.out.println();
                    for (Laptop laptop : set) {
                        if (laptop.getColor().equals(color)) {
                            System.out.println(laptop);
                            System.out.println();
                        }
                    }
                }
                if (item == 5) {
                    System.out.print("Введите желаемую стоимость: ");
                    String price = console.nextLine();
                    System.out.println();
                    for (Laptop laptop : set) {
                        if (laptop.getPrice().equals(price)) {
                            System.out.println(laptop);
                            System.out.println();
                        }
                    }
                }

            } else {
                System.out.println("Таких параметров не существует.");
            }

        }
    }

}
