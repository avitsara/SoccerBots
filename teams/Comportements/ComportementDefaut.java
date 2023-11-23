package Comportements;

import	EDU.gatech.cc.is.util.Vec2;
import	EDU.gatech.cc.is.abstractrobot.*;

public class ComportementDefaut extends Comportement {
        private ComportementDefaut next;
        /* Permet d'activer un comportement */
        @Override
        public boolean isActivated(){
                return true;
        }
        /*Action liée au comportement */
        @Override
        public void action(){
        if (!robot.hasBall()){
            Vec2 walkDir = new Vec2(0,1);
            robot.setTranslationalVelocity(walkDir.scale(robot.getMaxSpeed()));
          }
        }
        @Override 

        public void setNext(ComportementDefaut next){

            this.next = next;
        }

        @Override 

        public void handle(Request request){
          if(isActivated()){
                action();
          } else if (next!= null){
            next.handle(request);
        }
}