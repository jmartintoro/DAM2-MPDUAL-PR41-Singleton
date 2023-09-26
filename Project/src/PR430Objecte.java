public class PR430Objecte {
    private String nom, cognom, edat;
    private static PR430Objecte instance;

    private PR430Objecte(String nom, String cognom,String edat) {
        
        this.nom = nom;
        this.cognom=cognom;
        this.edat=edat;
    }

    public static PR430Objecte getInstance(String nom,String cognom, String edat) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        if (instance == null) {
            instance = new PR430Objecte(nom, cognom, edat);
        } 
        return instance;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + "\t\tcognom: " + cognom + "\t\tedat: " + edat;
    }
}
