package wargame;

public class Soldat extends Position implements ISoldat{

Heros[] heros;
	public Soldat(){
		
		heros= new Heros[7];
	}
public int getPoints() { return this.getPoints(); }
public int getPortee() { return this.getPortee(); }

public	int getTour(){return 0;} 

public void joueTour(int tour){}
public void combat(Soldat soldat){
	
}
public void seDeplace(Position newPos){
	
}
}