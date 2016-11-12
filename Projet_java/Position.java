package wargame;

import java.awt.Color;
public class Position implements IConfig {
	private int x, y;
	Color couleur;
	Position [][] positionOccuper;
	public Position(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }
	public boolean estValide() {
		if (x<0 || x>=LARGEUR_CARTE || y<0 || y>=HAUTEUR_CARTE) return false; else return true;
	}
	public String toString() { return "("+x+","+y+")"; }
	public boolean estVoisine(Position pos) {
		return ((Math.abs(x-pos.x)<=1) && (Math.abs(y-pos.y)<=1));
	}
	
	public boolean positionVide(int i, int j){	
		if(couleur==Color.gray) return false;			
		return true;
	}
}