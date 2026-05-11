public class Main {

    public static void main(String[] args) {

        Figura[] figuras = {
                new Circulo("Rojo", 5),
                new Rectangulo("Azul", 4, 6),
                new Triangulo("Verde", 3, 4)
        };

        for (Figura f : figuras) {

            f.mostrarColor();

            System.out.println("Area: " + f.area());

            System.out.println("Perimetro: " + f.perimetro());

            System.out.println("----------------");
        }
    }
}

