package com.foragers.terchallange.score;

public interface IScoreManager {

	
	/**
	 * Call this when a shell has be pick to update the score.
	 * */
	void AddShellToScore();
	
	//Later maybe
	//void AddShellToScore(int shellPoint)
	
	/**
	 * The dive go up and can breathe, then
	 * the dioxygen level is reset.
	 * */
	void diveUp();
	
	/**
	 * Get the current Score.
	 * */
	int  getScore();
	
	
	/**
	 * Get the dioxygen level
	 * */
	int getDioxygenDelayRest(int deltaTime);
	
	
}
