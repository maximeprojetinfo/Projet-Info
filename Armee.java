package projetinfo;

import java.awt.Rectangle;

public class Armee extends Objet {
    public boolean activite;
    public static String NomImage="Armee.png";
    public static int deplacementmax=3;
    public int puissance;
    public int defense;
    
    public Armee(String aproprietaire ,int ax, int ay,String NomImage, Rectangle aframe, String nom,int apuissance, int adefense) {
        super(aproprietaire, ax, ay, NomImage, aframe, nom);
        activite=true;
        puissance=apuissance;
        defense=adefense;
        
    }
    
    public void move(long t){
        
    }
}
