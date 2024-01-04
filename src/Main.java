public class Main {
    public static void main(String[] args) {
        Player1 player = new Player1("Someone","Sword",100);
//        System.out.println(player.getName());
//        System.out.println(player.getHealth());
//        System.out.println(player.getWeapon());

        player.damageByGun1();
        player.damageByGun1();
        player.damageByGun1();
        player.damageByGun1();
        player.heal();


    }
}
