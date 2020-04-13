public class FireBakugan extends Bakugan {
    public FireBakugan(String name) {
        super(name);
    }

    public void fireAttack(Bakugan other){
        System.out.println( getName() + " is attacking to "  +  other.getName()  + "in a special way");
        if(other instanceof WaterBakugan){
            other.decreaseHP(200);
        }
        else {
            other.decreaseHP(100);
            System.out.println(other.getName() + "'s HP is " + other.getHP());
        }
        System.out.println(other.getName() + " " + other.getHP());
    }


}
