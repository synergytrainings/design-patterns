package flyweight;

import flyweight.figure.Figure;
import flyweight.figure.FigureType;

/**
 * Figure client class which will be used by client for creating new figure in the game
 * @author Karen
 *
 */
public class FigureClient {
	private Figure figure = null;
	
	int figureCurrentPositionX = 0;
	int figureCurrentPositionY = 0;
	
	public FigureClient(FigureType figureType) {
		figure = FigureFactory.get(figureType);
	}
	
	public void move(int newPositionX, int newPositionY) {
		figure.move(figureCurrentPositionX, figureCurrentPositionY, newPositionX, newPositionY);
	}
}
