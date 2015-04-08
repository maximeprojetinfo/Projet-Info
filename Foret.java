package projetinfo;

import java.awt.Rectangle;

public class Foret extends Batiment{
    public static String NomImage="Foret.png";
        
     public Foret(String aproprietaire ,int ax, int ay,String NomImage, Rectangle aframe, String nom, int aprodpartour, int acoutpierre, int acoutbois, int acoutnourriture) {
         super(aproprietaire, ax, ay, NomImage, aframe, nom, 75, 30, 100, 200);
        
      }
        
      public void production (){
            
        }
}
