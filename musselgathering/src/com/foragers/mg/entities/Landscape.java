package com.foragers.mg.entities;

import java.util.Random;

public class Landscape {

	private int width;
	private int height;
	private Box[][] boxes;

	public Landscape(int width, int height) {
		this.width = width;
		this.height = height;
		boxes = generate();
	}

	private Box[][] generate() {
		int boxesPerLine = width / Box.WIDTH;
		int boxesPerColumn = width / Box.HEIGHT;
		Box[][] boxes = new Box[boxesPerLine][boxesPerColumn];

		for (int i = 0; i < boxesPerLine; i++) {
			boolean generated = false;

			for (int j = 0; j < boxesPerColumn && !generated; j++) {
				boxes[i][j] = new Box();

				if (generated = new Random().nextBoolean()) {
					boxes[i][j].addMussel();
				}
			}

		}

		return boxes;
	}

}
