public class Main {

    public static void main(String[] args) {

        FireBakugan fireBakugan = new FireBakugan("Drago");
        WaterBakugan waterBakugan = new WaterBakugan("Aqua");
        Bakugan bakugan = new Bakugan("Leo");

        fireBakugan.attack(waterBakugan);
        waterBakugan.attack(fireBakugan);
        fireBakugan.fireAttack(waterBakugan);
        fireBakugan.fireAttack(waterBakugan);
        fireBakugan.regen();
        waterBakugan.waterRegen();
        waterBakugan.waterAttack(fireBakugan);

        System.out.println();




    }
}
