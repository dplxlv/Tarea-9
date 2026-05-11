class Triangulo extends Figura {

    private double a;
    private double b;

    public Triangulo(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return (a * b) / 2;
    }

    @Override
    public double perimetro() {
        return a + b + Math.sqrt(a * a + b * b);
    }
}

