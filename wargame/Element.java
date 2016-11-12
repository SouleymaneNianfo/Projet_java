package wargame;
import java.awt.Graphics;
public class Element {
	Position pos;
	static int nbElement=0;
	final int NUM_ELEMENT;
	public Element(){
		
		NUM_ELEMENT=++nbElement;
	}

}
