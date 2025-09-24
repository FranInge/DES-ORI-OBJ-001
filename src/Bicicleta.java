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

    public int accelerar(){
        //doblar la velocidad actual x2
        int accelerado = velocidadActual *2;
        return accelerado;
    }
    public int frenar(){
        int frenar = velocidadActual /2;
        return frenar;
    }

    //Ajustar el plato y piñon dependiendo de los datos recibidos

    public int cambiarPlato(){
        int ajustarPlato = platoActual %4;
        return ajustarPlato;
    }
    public int cambiarPiñon(){
        int ajustarPiñon = piñonActual %4;
        return ajustarPiñon;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "velocidadActual=" + velocidadActual +
                ", platoActual=" + platoActual +
                ", piñonActual=" + piñonActual +
                '}';
    }
}
