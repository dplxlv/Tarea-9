public class Main {
    public static void main(String[] args) {

        Dibujable[] figuras = { new Circulo("Rojo", 5),
                new Triangulo("Verde", 3, 4) };

        for (Dibujable figura : figuras) {
            figura.dibujar();
            System.out.println("Perimetro: " + figura.perimetro());
            System.out.println("----------------");
        }
    }
}



