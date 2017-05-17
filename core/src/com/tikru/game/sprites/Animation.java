package com.tikru.game.sprites;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

/**
 * Created by mikup on 4/25/2017.
 */

public class Animation {
    private Array<TextureRegion> frames;
    private float maxFrameTime;
    private float currentFrameTIme;
    private int frameCount;
    private int frame;

    //Animaatio saadaan aikaan liikkumalla läpi kuvan, jossa lintu on eri asennoissa
    public Animation(TextureRegion reg, int frameCount, float cycleTime){
        frames = new Array<TextureRegion>();
        int frameWidth = reg.getRegionWidth() / frameCount;

        for(int i = 0; i < frameCount; i++){
            frames.add(new TextureRegion(reg, i * frameWidth, 0, frameWidth, reg.getRegionHeight()));
        }
        this.frameCount = frameCount;
        maxFrameTime = cycleTime / frameCount;
        frame = 0;
    }

    public void update(float dt){
        currentFrameTIme += dt;
        if(currentFrameTIme > maxFrameTime){
            frame++;
            currentFrameTIme = 0;
        }
        if(frame >= frameCount)
            frame = 0;
    }

    public TextureRegion getFrame(){
        return frames.get(frame);
    }
}
