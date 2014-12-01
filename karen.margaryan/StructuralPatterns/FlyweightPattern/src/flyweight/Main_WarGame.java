package flyweight;

import flyweight.figure.FigureType;

/**
 * Main method shows how the FlyWeight Design Pattern should be used
 * @author Karen
 *
 */
public class Main_WarGame {
	public static void main(String[] args) {
		FigureClient[] figures = {
				new FigureClient(FigureType.TANK),
				new FigureClient(FigureType.TANK),
				new FigureClient(FigureType.TANK),
				new FigureClient(FigureType.SOLDIER),
				new FigureClient(FigureType.SOLDIER)
		};
		
		for (int i=0; i < figures.length; ++i) {
			figures[i].move(i*10, i*5);
		}
		
		
	}
}
