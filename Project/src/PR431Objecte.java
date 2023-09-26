public class PR431Objecte {
    private String nom, cognom, edat;
    private static PR431Objecte instance;

    private PR431Objecte(String nom, String cognom,String edat) {
        
        this.nom = nom;
        this.cognom=cognom;
        this.edat=edat;
    }

    public static PR431Objecte getInstance(String nom,String cognom, String edat) {
        if (instance == null) {
            instance = new PR431Objecte(nom, cognom, edat);
        } 
        return instance;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + "\t\tcognom: " + cognom + "\t\tedat: " + edat;
    }
}
