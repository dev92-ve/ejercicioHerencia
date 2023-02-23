public class SmartPhone extends SmartDevice{

    Integer gbRam;
    Integer gbRom;
    boolean fastCharge;

    public SmartPhone(boolean screen, double weight, String material, String fabricante, Integer gbRam, Integer gbRom, boolean fastCharge) {
        super(screen, weight, material, fabricante);
        this.gbRam = gbRam;
        this.gbRom = gbRom;
        this.fastCharge = fastCharge;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "gbRam=" + gbRam +
                ", gbRom=" + gbRom +
                ", fastCharge=" + fastCharge +
                ", screen=" + screen +
                ", weight=" + weight +
                ", material='" + material + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}



