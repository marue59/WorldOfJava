public class Programme {
    public static Personnage personnageFactory() {

        String nom = Tools.imputString("entrez nom");
        int pdv = Tools.randomInt(100)+1;
        int deg = Tools.randomInt(20)+5;

        // creer new pers
        Personnage p = new Personnage(nom, pdv, deg);

        //retrourner l'instance
        return p;
    }
}
