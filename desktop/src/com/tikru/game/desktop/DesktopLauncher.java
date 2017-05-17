package com.tikru.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.tikru.game.Pulu;

public class DesktopLauncher {
	public static void main (String[] arg) {

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		//Asetetaan pelikentälle koko ja luodaan se
		config.width = Pulu.WIDTH;
		config.height = Pulu.HEIGHT;
		config.title = Pulu.TITLE;
		new LwjglApplication(new Pulu(), config);
	}
}
