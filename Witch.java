public class Witch extends TrickOrTreater {
    private String signatureSpell;
    private BlackCat companion;
    public Witch( Witch other) {
        this(new String(other.getName()),
                new String(other.getNeighborhood()),
                other.getNumCandy(),
                new String(other.getSignatureSpell()),
                new BlackCat(other.getCompanion().getName(),
                        other.getCompanion().getFamiliar()));
    }
    public Witch( String name, String signatureSpell, BlackCat companion) {
        super(name, "Godric's Hollow", 13);
        this.signatureSpell = signatureSpell;
        this.companion = companion;
    }
    public Witch( String name,
                  String neighborhood,
                  int numCandy,
                  String signatureSpell,
                  BlackCat companion) {
        super(name, neighborhood, numCandy);
        this.signatureSpell = signatureSpell;
        this.companion = companion;
    }
    public void castSpell() {
        int newCandy = this.getNumCandy() * 2;
        this.setNumCandy(newCandy);
        System.out.println(this.getName() + " casts " + this.getSignatureSpell() + "!");
    }
    public String getSignatureSpell() {
        return this.signatureSpell;
    }
    public void setSignatureSpell(String signatureSpell) {
        this.signatureSpell = signatureSpell;
    }
    public BlackCat getCompanion() {
        return this.companion;
    }
    public void setCompanion(BlackCat companion) {
        this.companion = companion;
    }
}