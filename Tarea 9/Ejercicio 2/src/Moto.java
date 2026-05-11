class Moto extends Vehiculo {

    public Moto(String marca) {
        super(marca);
    }

    @Override
    public void arrancar() {
        System.out.println("La moto " + marca + " arranco");
    }
}

