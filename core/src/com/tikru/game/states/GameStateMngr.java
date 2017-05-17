package com.tikru.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;


public class GameStateMngr {

    //Luodaan stäkki gamestateille
    private Stack<State> states;

    public GameStateMngr(){
        states = new Stack<State>();
    }

    //Luodaan stäkin metodit
    public void push(State state){
        states.push(state);
    }

    public void pop(){
        states.pop().dispose();
    }

    public void set(State state){
        states.pop().dispose();
        states.push(state);
    }

    //Metodit päivitystä ja renderöintiä varten
    public void update(float dt){
        states.peek().update(dt);
    }

    //SpriteBatch käsittelemään renderöintiä
    public void render(SpriteBatch sb){
        states.peek().render(sb);
    }
}
