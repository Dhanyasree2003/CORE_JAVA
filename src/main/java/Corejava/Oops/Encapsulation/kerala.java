package Corejava.Oops.Encapsulation;

public class kerala {
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
