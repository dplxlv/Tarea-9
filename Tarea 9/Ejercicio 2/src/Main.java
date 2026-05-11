public class Main {

    public static void main(String[] args) {

        Vehiculo[] vehiculos = {
                new Auto("Tesla"),
                new Moto("Yamaha"),
                new Camion("Volvo")
        };

        for (Vehiculo v : vehiculos) {

            v.arrancar();

            if (v instanceof Electrico) {

                Electrico e = (Electrico) v;
                e.cargarBateria();
            }

            System.out.println("----------------");
        }
    }
}

