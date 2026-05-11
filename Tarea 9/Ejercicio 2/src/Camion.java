class Camion extends Vehiculo {

    public Camion(String marca) {
        super(marca);
    }

    @Override
    public void arrancar() {
        System.out.println("El camion " + marca + " arranco");
    }
}
