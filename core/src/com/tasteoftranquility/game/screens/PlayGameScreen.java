package com.tasteoftranquility.game.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.tasteoftranquility.game.Main;
import com.tasteoftranquility.game.systems.MapR;

public class PlayGameScreen extends BaseScreen {

    MapR mapR;
    OrthographicCamera camera;
    Viewport viewport;
    SpriteBatch batch;
    Main main;
    public float unitScale;
    public PlayGameScreen(Game game) {
        super(game);
    }

    @Override
    public void show() {
        main = new Main();
        unitScale = main.unitScale;
        mapR = new MapR(unitScale);
        camera = new OrthographicCamera();
        viewport = new FitViewport(main.gameWidth, main.gameHeight, camera);
        batch = new SpriteBatch();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        update();
        draw();
    }

    @Override
    public void update() {
        camera.update();
    }

    @Override
    public void draw() {
        batch.begin();
        mapR.render(camera);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        mapR.dispose();
    }
}
