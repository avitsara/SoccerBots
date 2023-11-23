package Comportements;

import	EDU.gatech.cc.is.util.Vec2;
import	EDU.gatech.cc.is.abstractrobot.*;

public class ComportementAttaquant extends Comportement {
        private SoccerBot robot;

        public ComportementAttaquant(SoccerBot robot){
                this.robot = robot;
        }
        /* Permet d'activer un comportement */
        @Override
        public boolean isActivated(){
        return true;
        }


        @Override
        public void Action() {
          // Get ball position
          Vec2 ballPos = robot.getBall().getPosition();
          
          // Get direction to move towards ball
          Vec2 moveDir = ballPos.sub(robot.getPosition()).normalize();
      
          // Move towards ball
          robot.setTranslationalVelocity(moveDir.scale(robot.getMaxSpeed()));
          
          // Kick if close enough
          if(robot.getBall().getDistance() < 0.5) {
            robot.kick(1.0); 
          }
        }
       

}