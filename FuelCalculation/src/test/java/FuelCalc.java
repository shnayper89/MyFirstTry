import Technica.Car;
import Technica.Plane;

/**
 * Created by spirit on 6/22/16.
 */
public class FuelCalc {
    public static void main(String[] args){
        Car jiguli = new Car("Jiguli 2106", 1000, 85);
        Car volga = new Car("Volga", 1800, 85);
        Plane boeing747 = new Plane("Boeing747", 180000, 985);
        jiguli.consumption(12, 12);
        volga.consumption(12, 12);
        boeing747.consumption(8000, 180000);

    }
}
