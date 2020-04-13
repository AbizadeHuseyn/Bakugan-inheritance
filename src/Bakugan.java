public class Bakugan  {
    private String Name;

    public int HP = 1000;


    public Bakugan(String name) {
        this.Name = name;
    }

    public void attack (Bakugan other){
        System.out.println( getName() + " is attacking to "  +  other.getName());
        other.decreaseHP(50);
        System.out.println(other.getName() + "'s HP is " + other.getHP());
    }

    public void regen (){
        System.out.println(getName() + " is regenerating itslef" );
        if(HP >= 1000) System.out.println("Your health is maximum!");
        else{
            if(1000 - HP < 50){
                HP = 1000;
            }
            else{
                HP = HP + 50;
            }

        }
        System.out.println(getName() + "'s HP is " + getHP());
    }

    public void decreaseHP(int severance){
        HP = HP - severance;
    }

    public int getHP() {
        return HP;
    }
    public String getName() {
        return Name;
    }


}
