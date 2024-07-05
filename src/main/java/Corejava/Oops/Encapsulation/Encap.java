package Corejava.Oops.Encapsulation;
class keralaplace
{
    public  String tourist_place;
    public  int tourist_cost;

    public  String modeoftravels;
    public String duration;


    public String getTourist_place() {
        return tourist_place;
    }

    public void setTourist_place(String tourist_place) {
        this.tourist_place = tourist_place;
    }

    public int getTourist_cost() {
        return tourist_cost;
    }

    public void setTourist_cost(int tourist_cost) {
        this.tourist_cost = tourist_cost;
    }

    public String getModeoftravels() {
        return modeoftravels;
    }

    public void setModeoftravels(String modeoftravels) {
        this.modeoftravels = modeoftravels;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

}
public class Encap {
    public static void main(String[] args) {
        keralaplace kk=new keralaplace();
        kk.setTourist_place("vagamon");
        kk.setModeoftravels("Bus");
        kk.setDuration("one week");
        kk.setTourist_cost(30000);
        System.out.println("KERALA PLACE:"+kk.getTourist_place());
        System.out.println(kk.getModeoftravels());
        System.out.println(kk.getDuration());
        System.out.println(kk.getTourist_cost());
    }

}
