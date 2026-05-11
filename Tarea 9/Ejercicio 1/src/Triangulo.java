class Triangulo extends Figura implements Dibujable {
    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override public double area() {
        return (base * altura) / 2;
    }

    @Override public double perimetro() {
        return base * 3;
    }

    @Override public void dibujar() {
        System.out.println("Dibujando triangulo de color " + color);
    }

}
