package wargame;

public class Heros extends Soldat {
	
	public Heros(){
		TypesH heros;
		int x = 1+((int)Math.random()*7-1);
		int y = 1+((int)Math.random()*7-1);
		int type = 1+((int)Math.random()*4-1);
		switch(type){
		case 1:
			heros = TypesH.HUMAIN;
		break;
		case 2:
			heros = TypesH.NAIN;
			break;
		case 3:
			heros = TypesH.ELF;
			break;
		case 4:
			heros = TypesH.HOBBIT;
			break;
		}
	}
	
	
	
}
