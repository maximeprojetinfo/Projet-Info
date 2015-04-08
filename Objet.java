package projetinfo;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import java.io.File;

import javax.imageio.ImageIO;

public class Objet {
    public String proprietaire;
    public int x;
    public int y;
    public int h;
    public int l;
    public Image image;
    public Rectangle limites;
    public Rectangle limitesframe;
    public String nom_objet;
    
    
    public Objet(String aproprietaire ,int ax, int ay,String NomImage, Rectangle aframe, String nom) {
        proprietaire=aproprietaire;
        x=ax;
        y=ay;
        limitesframe=aframe;
        nom_objet=nom;
        
        try {
        image= ImageIO.read(new File(NomImage));
        }
        catch(Exception err) {
        System.out.println(NomImage+" introuvable !");
        System.out.println("Mettre les images dans le repertoire :"
        +getClass().getClassLoader().getResource(NomImage));
        System.exit(0);
        }
        // récupère une fois pour toute la hauteur et largeur de l'image
        h= image.getHeight(null);
        l= image.getWidth(null);
        // définir les limites de l'objet pour les collisions et les sorties
        limites = new Rectangle(ax,ay,l,h);
    }
    
    public void draw(long t, Graphics g){
        g.drawImage(image,x,y,null);
    }
        
    
    public boolean Collision(Objet O){
         return limites.intersects(O.limites);
     }
}
