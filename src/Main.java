
public class Main {
    public static void main(String[] args) {

        Bicicleta miBicicleta= new Bicicleta (11, 22, 33);
        Bicicleta tuBicicleta= new Bicicleta (20, 40, 50);

        System.out.println("Mi Bicicleta: "+ miBicicleta);
        System.out.println("Tu Bicicleta: "+ tuBicicleta);
        System.out.println("Mi Bicicleta accelerada: " + miBicicleta.accelerar());
        System.out.println("Tu Bicicleta frenada: " + tuBicicleta.frenar());
        System.out.println("Mi Bicicleta cambiando el plato: " + miBicicleta.cambiarPlato());
        System.out.println("Tu Bicicleta cambiando el piñon: " + tuBicicleta.cambiarPiñon());

    }

}