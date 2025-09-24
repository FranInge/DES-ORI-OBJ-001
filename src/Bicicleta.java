//Realizado por Francisco
import java.util.Scanner;
public class Bicicleta {

    private int velocidadActual;
    private int platoActual;
    private int piñonActual;

    public Bicicleta(int velocidadActual, int platoActual, int piñonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.piñonActual = piñonActual;
    }

    public int accelerar(int velocidadActual){
        //doblar la velocidad actual x2
        int accelerado = velocidadActual *2;
        return accelerado;
    }
    public int frenar(int velocidadActual){
        int frenar = velocidadActual /2;
        return frenar;
    }

    //Ajustar el plato y piñon dependiendo de los datos recibidos

    public void cambiarPlato(int plato){
        int ajustarPlato = plato %2;

    }
    public void cambiarPiñon(int piñon){
        int ajustarPiñon = piñonActual %2;
    }
}
