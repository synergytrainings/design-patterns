package flyweight;

import java.util.HashMap;
import java.util.Map;

import flyweight.figure.Figure;
import flyweight.figure.FigureType;
import flyweight.figure.Soldier;
import flyweight.figure.Tank;

/**
 * Factory class which creates figures in the game with sharing mechanism
 * @author Karen
 *
 */
public class FigureFactory {
	
	public static Map<FigureType, Figure> figures = new HashMap<FigureType, Figure>();
	
	public static Figure get(FigureType figureType) throws RuntimeException {
		Figure figure = figures.get(figureType);
		if (figure == null) {
			if (figureType == FigureType.TANK) {
				figure = new Tank();
			} else if (figureType == FigureType.SOLDIER) {
				figure = new Soldier();
			} else {
				throw new RuntimeException("Invalid type of figure in game");
			}
			
			figures.put(figureType, figure);
		}
		
		
		return figure;
	}
}
