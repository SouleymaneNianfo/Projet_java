package wargame;
import java.awt.Graphics;
import java.awt.Color;
public class Carte implements ICarte{
	Position[][] carte;
	
	public Carte(){
		int i, j;
		for(i=1;i<=15;i++){
			for(j=1;j<=15;j++){
				carte[i][j] = new Position(i,j);
			}
		}
	}
	//ATTENTION!!!!!!!!!! c'est pas les vraies definition des ces methodes. 
	//cest juste des suppositions pour eviter des messages d'erreur.
	public Element getElement(Position pos){
		Element e = new Element();
		return e;
	}
	// Ajoute
	
	public Position trouvePositionVide(){
		int i,j;
		for(i=1;i<=15;i++){
			for(j=1;j<=15;j++){
				
				if(carte[i][j].positionVide(i,j)){
					return carte[i][j];
					
				}
			}
		}
		return new Position(0,0);
	}
	public Position trouvePositionVide(Position pos){
		int i,j;
		for(i=pos.getX()-4;i<pos.getX()+4;i++){
			for(j=pos.getX();j<pos.getX();j++){
				
				if(carte[i][j].positionVide(i,j)){
					return carte[i][j];
					
				}
			}
		}
		return new Position(0,0); // Trouve une position vide choisie
	}// al�atoirement parmi les 8 positions adjacentes de pos
								// al�atoirement parmi les 8 positions adjacentes de pos
	public Heros trouveHeros(){
		Heros H= new Heros();// Trouve al�atoirement un h�ros sur la carte
		return H;
	}
	public Heros trouveHeros(Position pos){
		Heros H= new Heros();
		return H;// Trouve un h�ros choisi al�atoirement
	}
									 // parmi les 8 positions adjacentes de pos
	public boolean deplaceSoldat(Position pos, Soldat soldat){
		return true;
	}
	public void mort(Soldat perso){}
	public boolean actionHeros(Position pos, Position pos2){
		return true;
	}
	//void jouerSoldats(PanneauJeu pj);
	public void toutDessiner(Graphics g){}

}
