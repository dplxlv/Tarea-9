class Auto extends Vehiculo implements Electrico {

    public Auto(String marca) {
        super(marca);
    }

    @Override
    public void arrancar() {
        System.out.println("El auto " + marca + " arranco");
    }

    @Override
    public void cargarBateria() {
        System.out.println("El auto electrico esta cargando bateria");
    }
}
