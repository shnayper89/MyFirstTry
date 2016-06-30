package AllTech;

/**
 * Created by spirit on 6/22/16.
 */
public class AllTech {
    public String name;
    public float weight, speed, qReal;

    public void consumption(int space){
        float consumpt = this.speed * this.weight / 10000;
        float qActual = consumpt * space / 100;
        this.qReal = this.qReal - qActual;
        if (this.qReal >= 0) {
            System.out.println(this.name + " ostalos  -   " + this.qReal + " litrov");
        }
        else
            System.out.println(this.name + " nehvatilo  -   " + -this.qReal + " litrov ");

    }

}
