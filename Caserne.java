package projetinfo;

import java.awt.Rectangle;

public class Caserne extends Objet {
    
    public boolean activite;
    public static String NomImage="Caserne.png";
    public static int coutpierre=200;
    public static int coutbois=100;
    public static int coutnourriture=100;
    
    public Caserne(String aproprietaire ,int ax, int ay,String NomImage, Rectangle aframe, String nom) {
        super(aproprietaire, ax, ay, NomImage, aframe, nom);
        activite=true;
        
    }
    
    public void productionarmee (){
        
    }
}
