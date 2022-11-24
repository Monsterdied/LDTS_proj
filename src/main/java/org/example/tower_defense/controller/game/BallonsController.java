package org.example.tower_defense.controller.game;

import org.example.Game;
import org.example.tower_defense.GUI.GUI;
import org.example.tower_defense.controller.Controller;
import org.example.tower_defense.model.Element.Ballon;
import org.example.tower_defense.model.Element.BallonMovement;
import org.example.tower_defense.model.battlefield.BattleField;

import java.io.IOException;


public class BallonsController extends GameController{
    private long lastMovement;

    public BallonsController(BattleField battlefield) {
        super(battlefield);
        this.lastMovement = 0;
    }
    private void moveBallon(Ballon ballon){
        System.out.println("check\n\n\n\n\n");
        if(ballon.getDirection()==BallonMovement.RIGHT){

            if(getModel().isEmpty_to_move_ballon( ballon.getPosition().getRight()  )  ){

                moveBallonRight(ballon);
            }else{
                moveVertical(ballon);
            }
        }else if(ballon.getDirection()==BallonMovement.LEFT){
                if(getModel().isEmpty_to_move_ballon( ballon.getPosition().getLeft()  )  ){
                    moveBallonLeft(ballon);
                }else {
                    moveVertical(ballon);
                }
        }else if(ballon.getDirection()==BallonMovement.DOWN){
            if(getModel().isEmpty_to_move_ballon( ballon.getPosition().getDown()  )  ){
                moveBallonDown(ballon);
            }else{
                moveHorizontal(ballon);
            }
        }else if(ballon.getDirection()==BallonMovement.UP){
            if(getModel().isEmpty_to_move_ballon(ballon.getPosition().getUp())){
                moveBallonUp(ballon);
            }else{
                moveHorizontal(ballon);
            }
        }
    }
    public void moveBallonUp(Ballon ballon){
        ballon.setPosition(ballon.getPosition().getUp());
        ballon.setDirection(BallonMovement.UP);
    }
    public void moveBallonDown(Ballon ballon){
        ballon.setPosition(ballon.getPosition().getDown());
        ballon.setDirection(BallonMovement.DOWN);
    }
    public void moveBallonRight(Ballon ballon){
        ballon.setPosition(ballon.getPosition().getRight());
        ballon.setDirection(BallonMovement.RIGHT);
    }
    public void moveBallonLeft(Ballon ballon){
        ballon.setPosition(ballon.getPosition().getLeft());
        ballon.setDirection(BallonMovement.LEFT);
    }
    public void moveHorizontal(Ballon ballon){
        if(getModel().isEmpty_to_move_ballon( ballon.getPosition().getRight()  )  ){
            moveBallonRight(ballon);
        }else{
            moveBallonLeft(ballon);
        }
    }
    public void moveVertical(Ballon ballon){
        if(getModel().isEmpty_to_move_ballon( ballon.getPosition().getDown()  )  ){
            moveBallonDown(ballon);
        }else{
            moveBallonUp(ballon);
        }
    }
    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (time - lastMovement > 500) {
            if (getModel().getBallons()!=null){
            for (Ballon ballon : getModel().getBallons()){
                moveBallon(ballon);
            }
            this.lastMovement = time;
        }}
    }
}
