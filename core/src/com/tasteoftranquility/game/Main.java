package com.tasteoftranquility.game;

import com.badlogic.gdx.Game;
import com.tasteoftranquility.game.screens.PlayGameScreen;

public class Main extends Game {

	public float unitScale = 1/32;
	public float gameWidth = unitScale * 6;
	public float gameHeight = unitScale * 3;

	@Override
	public void create () {
		setScreen(new PlayGameScreen(this));
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}

	@Override
	public void dispose() {
		super.dispose();
	}
}