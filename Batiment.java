package projetinfo;

import java.awt.Rectangle;

public class Batiment extends Objet {
    
    public int prodpartour;
    public int coutpierre;
    public int coutbois;
    public int coutnourriture;
    
    public Batiment(String aproprietaire ,int ax, int ay,String NomImage, Rectangle aframe, String nom, int aprodpartour, int acoutpierre, int acoutbois, int acoutnourriture) {
        super(aproprietaire, ax, ay, NomImage, aframe, nom);
        prodpartour=aprodpartour;
        coutpierre=acoutpierre;
        coutbois=acoutbois;
        coutnourriture=acoutnourriture;
    
    }
    
    public abstract void production();
    
    }

