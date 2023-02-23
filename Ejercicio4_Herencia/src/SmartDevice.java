public class SmartDevice {

    boolean screen;
    double weight;
    String material;
    String fabricante;
    public SmartDevice() {
    }

    public SmartDevice(boolean screen, double weight, String material, String fabricante) {
        this.screen = screen;
        this.weight = weight;
        this.material = material;
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "screen=" + screen +
                ", weight=" + weight +
                ", material='" + material + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}

