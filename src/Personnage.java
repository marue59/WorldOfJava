public class Personnage {
     private String nom;
     private int pointDevie;
     private int degat;

     // getter setter
    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPointDevie() {
        return this.pointDevie;
    }

    public void setPointDevie(int pointDevie) throws IllegalArgumentException {
        if(pointDevie < 0 )
        throw new IllegalArgumentException( "point de vie doit etre positive");
    }

    public int getDegat() {
        return this.degat;
    }

    public void setDegat(int degat) {
        this.degat = degat;
    }

    //Constructeur

    public Personnage(String nom, int pointDevie, int degat) {
        super();
        this.setNom(nom);
        this.setPointDevie(pointDevie);
        this.setDegat(degat);
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", pointDevie=" + pointDevie +
                ", degat=" + degat +
                '}';
    }
}
