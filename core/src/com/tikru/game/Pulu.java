package com.tikru.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.tikru.game.states.GameStateMngr;
import com.tikru.game.states.MenuState;

public class Pulu extends ApplicationAdapter {

	//Määritetään pelikentän koko
	public static final int WIDTH = 480;
	public static final int HEIGHT = 800;

	public static final String TITLE = "PuluPeli";
	private GameStateMngr gsm;
	private SpriteBatch batch;

	//Luodaan pelikenttä uudelleen clearin ja Spriten avulla
	@Override
	public void create () {
		batch = new SpriteBatch();
		gsm = new GameStateMngr();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		gsm.push(new MenuState(gsm));

	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(batch);
	}

}
