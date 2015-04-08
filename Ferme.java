package projetinfo;

import java.awt.Rectangle;

public class Ferme extends Batiment {
    
    public static String NomImage="Ferme.png";
        
     public Ferme(String aproprietaire ,int ax, int ay,String NomImage, Rectangle aframe, String nom, int aprodpartour, int acoutpierre, int acoutbois, int acoutnourriture) {
         super(aproprietaire, ax, ay, NomImage, aframe, nom, 100, 50, 250, 100);
        
      }
        
      public void production (){
            
      }  
      
 }
    

