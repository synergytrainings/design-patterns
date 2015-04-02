package com.synisys.training.patterns.memento;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Game {
	private List<Position> player1 = new LinkedList<>();
	private List<Position> player2 = new LinkedList<>();


	public Game() {
		//init positions
	}

	public State getState() {
		return new State(new ArrayList<>(player1), new ArrayList<>(player1));
	}

	public void restoreFromState(State state) {
		this.player1 = new ArrayList<>(state.player1);
		this.player2 = new ArrayList<>(state.player2);
	}

	public void movePlayer1(Position from, Position to) {
		doMove(from, to, player1);
	}

	public void movePlayer2(Position from, Position to) {
		doMove(from, to, player2);
	}

	private void doMove(Position from, Position to, List<Position> currentPositions) {
		if (!isMoveLegal(currentPositions, from, to)) {
			throw new IllegalArgumentException();
		}
		int index = currentPositions.indexOf(from);
		if (index >= 0) {
			currentPositions.set(index, to);
		} else {
			throw new IllegalArgumentException();
		}
	}

	private boolean isMoveLegal( List<Position> currentPositions, Position from, Position to) {
		throw new UnsupportedOperationException("Not implemented!");
	}

	static class State {
		private List<Position> player1;
		private List<Position> player2;

		public State(List<Position> player1, List<Position> player2) {
			this.player1 = player1;
			this.player2 = player2;
		}
	}

	public static class Position {
		private char c;
		private int digit;

		public Position(char c, int digit) {
			this.c = c;
			this.digit = digit;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;

			Position position = (Position) o;

			if (c != position.c) return false;
			return digit == position.digit;

		}

		@Override
		public int hashCode() {
			int result = (int) c;
			result = 31 * result + digit;
			return result;
		}
	}
}
