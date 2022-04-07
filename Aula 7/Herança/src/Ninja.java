package Herança.src;

public class Ninja {
    protected String name;
    protected String family;
    protected String[] jutsus;

    public Ninja(String name, String family, String[] jutsus) {
        this.name = name;
        this.family = family;
        this.jutsus = jutsus;
    }

    public String train(){
        return String.format("%s está treinando", name);
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String[] getJutsus() {
        return jutsus;
    }
}
