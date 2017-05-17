package com.tikru.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.tikru.game.Pulu;


public class MenuState extends State {

    private Texture background;
    private Texture playButton;

    public MenuState(GameStateMngr gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playButton = new Texture("playbtn.png");
    }

    @Override
    public void handleInput() {
        if(Gdx.input.justTouched()){
            gsm.set(new PlayState(gsm));
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    //Piirretään kenttä, background alkamaan alakulmasta ja peli-nappi keskelle ruutua
    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background,0,0, Pulu.WIDTH, Pulu.HEIGHT);
        sb.draw(playButton, (Pulu.WIDTH / 2) - (playButton.getWidth() / 2), Pulu.HEIGHT / 2);
        sb.end();

    }

    //Hävitetään turha tieto
    public void dispose(){
        background.dispose();
        playButton.dispose();
        System.out.println("Disposed");
    }
}
