package com.synisys.training.patterns.memento;


public class Test {

	public void test(){
		Game game = new Game();
		game.movePlayer1(new Game.Position('e', 1),new Game.Position('e', 2));
		game.movePlayer2(new Game.Position('e', 8), new Game.Position('e', 7));

		game.movePlayer1(new Game.Position('e', 2),new Game.Position('f', 3));
		game.movePlayer2(new Game.Position('e', 7), new Game.Position('h', 6));

		Game.State state = game.getState();


		game.movePlayer1(new Game.Position('f', 3),new Game.Position('f', 4));
		game.movePlayer2(new Game.Position('h', 6), new Game.Position('h', 5));

		game.restoreFromState(state);


	}
}
