public class BlackCat {
    private String name;
    private boolean familiar;

    public BlackCat(String name, boolean familiar) {
        this.name = name;
        this.familiar = familiar;
    }
    public void meow() {
        if (this.getFamiliar()) {
            System.out.println(this.getName() + " is a familiar");
        }
        else {
            System.out.println(this.getName() + " is not a familiar");
        }
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean getFamiliar() {
        return this.familiar;
    }
    public void setFamiliar(boolean familiar) {
        this.familiar = familiar;
    }
}