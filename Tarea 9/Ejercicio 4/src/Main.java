public class Main {

    public static void main(String[] args) {

        Empleado[] empleados = {

                new EmpleadoPorHora("Carlos", 1, 40, 5),
                new EmpleadoPorHora("Luis", 2, 35, 6),

                new EmpleadoFijo("Ana", 3, 40, 800),
                new EmpleadoFijo("Maria", 4, 40, 900),

                new EmpleadoComision("Pedro", 5, 40, 500, 10, 2000),
                new EmpleadoComision("Jose", 6, 40, 600, 8, 3000)
        };

        for (Empleado e : empleados) {

            e.mostrarInfo();

            if (e instanceof Bonificable) {

                Bonificable b = (Bonificable) e;

                System.out.println("Bono: " + b.calcularBono());
            }

            System.out.println("----------------");
        }
    }
}

