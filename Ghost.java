public class Ghost extends TrickOrTreater {
    private int transparency;
    public Ghost(int transparency) {
        super();
        this.transparency = transparency;
    }
    public Ghost(Ghost other) {
        this(new String(other.getName()),
                new String(other.getNeighborhood()),
                other.getNumCandy(),
                other.getTransparency());
    }
    public Ghost(String name, String neighborhood, int numCandy, int transparency) {
        super(name, neighborhood, numCandy);
        this.transparency = transparency;
    }
    public void spook() {
        if (transparency >= 10) {
            System.out.println("Very spooky");
        }
        else if ( transparency >= 3) {
            System.out.println("Boo!");
        }
        else if (transparency <= 2) {
            System.out.println("Not very spooky");
        }
    }
    public int getTransparency() {
        return this.transparency;
    }
    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }
}
