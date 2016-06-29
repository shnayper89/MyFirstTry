package AllTech;

/**
 * Created by spirit on 6/22/16.
 */
public class AllTech {
    public String name;
    public int weight, speed;

    public void consumption(int space, int qReal){
        int consumpt = this.speed * this.weight / 10000;
        int qActual = consumpt * space / 100;
        int raznic = qReal - qActual;
        if (raznic >= 0) {
            System.out.println(this.name + " ostalos  -   " + raznic + " litrov ");
        }
        else
            System.out.println(this.name + " nehvatilo  -   " + -raznic + " litrov ");
    }

}
