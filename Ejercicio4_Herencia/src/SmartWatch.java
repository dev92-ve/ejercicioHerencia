public class SmartWatch extends SmartDevice{

    boolean healthTracker;
    boolean alarm;
    String typeWristBand;

    public SmartWatch(boolean screen, double weight, String material, String fabricante, boolean healthTracker, boolean alarm, String typeWristBand) {
        super(screen, weight, material, fabricante);
        this.healthTracker = healthTracker;
        this.alarm = alarm;
        this.typeWristBand = typeWristBand;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "healthTracker=" + healthTracker +
                ", alarm=" + alarm +
                ", typeWristBand='" + typeWristBand + '\'' +
                ", screen=" + screen +
                ", weight=" + weight +
                ", material='" + material + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
