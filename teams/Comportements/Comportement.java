package Comportements;

import	EDU.gatech.cc.is.util.Vec2;
import	EDU.gatech.cc.is.abstractrobot.*;


/**
 *  On met en place la chaîne de Responsabilité 
 * dans le code 
 */
public abstract class Comportement {
    private Comportement next;
    /* Permet d'activer un comportement */
    public abstract boolean isActivated();
    /*Action liée au comportement */
    public abstract void action();

    public abstract void setNext(Comportement comportement);
    public abstract void handle(request);

}