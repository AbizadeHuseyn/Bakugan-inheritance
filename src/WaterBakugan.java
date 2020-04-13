public class WaterBakugan extends Bakugan {
    public WaterBakugan(String name) {
        super(name);
    }

    public void waterRegen (){
        System.out.println(getName() + " is regenerating itslef in special way" );
        if( HP >= 1000) System.out.println("Your health is maximum!");
        else{
            if(1000 - HP < 100){
                HP = 1000;
            }
            else{
                HP = HP + 100;
            }

        }
        System.out.println(getName() + "'s HP is " + getHP());
    }

    public void waterAttack (Bakugan other){
        System.out.println( getName() + " is attacking to "  +  other.getName() + " in special way");
        if(other instanceof FireBakugan){
            other.decreaseHP(150);
        }
        else {
            other.decreaseHP(75);

        }
        System.out.println(other.getName() + "'s HP is " + other.getHP());
    }
}

