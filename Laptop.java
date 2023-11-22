public class Laptop {
    private String name;
    private String volumeFD;
    private String os;
    private String color;
    private String price;

    public Laptop(String name, String volumeFD, String os, String color, String price) {
        this.name = name;
        this.volumeFD = volumeFD;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getVolumeFD() {
        return volumeFD;
    }

    public String getOS() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String result = "Имя: " + name + "\n" +
                "Объем ЖД: " + volumeFD + "\n" +
                "Операционная система: " + os + "\n" +
                "Цвет: " + color + "\n" + 
                "Цена: " + price;
        return result;
    }
}
