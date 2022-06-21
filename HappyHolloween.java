public class HappyHolloween {
    public static void main(String [] args) {
        TrickOrTreater umar = new TrickOrTreater();
        TrickOrTreater usman = new TrickOrTreater();
        Ghost bilal = new Ghost("bilal", "New York", 10, 10);
        Ghost leena = new Ghost(bilal);
        BlackCat mommy = new BlackCat("jean", true);
        BlackCat daddy = new BlackCat("bobby", false);
        Witch saleema = new Witch("saleema", "patronas charm", mommy);
        Witch maliha = new Witch("maliha", "avada kadavra", daddy);







    }
}
