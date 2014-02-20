package com.foragers.terchallange.logic;

public class Score{

	private int score = 0;	
	
	public void AddShellfishToScore() {
		this.score += 10;
	}
	
	public int getScore() {
		return this.score;
	}

}
