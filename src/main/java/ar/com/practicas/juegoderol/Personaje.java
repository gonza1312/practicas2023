package ar.com.practicas.juegoderol;
import javax.swing.*;
import java.awt.*;

public class Personaje {
    private int vida = 100;

    public void realizarAtaque(int golpe){
        vida-=golpe;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
