public class Main {
    public static void main(String[] args) {
       SmartPhone xiaomi= new SmartPhone(true, 158.25, "Plastic", "Xiaomi", 8, 128, false);
       SmartPhone samsung= new SmartPhone(true, 200.10, "Plastic", "Samsung", 12, 256, true);
        System.out.println(xiaomi);
        System.out.println(samsung);

        SmartWatch miBand = new SmartWatch(true, 85.00, "Plastic", "Xiaomi", true, true, "Plastic");
        SmartWatch apple = new SmartWatch(true, 110.00, "Compose", "Apple", true, true, "Plastic");
        System.out.println(miBand);
        System.out.println(apple);
    }
}