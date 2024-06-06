public class FigurasGeometricas {
    private int nlados;
    private String nombre;

    public FigurasGeometricas(int nlados, String nombre) {
        this.nlados = nlados;
        this.nombre = nombre;
    }

    public int getNlados() {
        return nlados;
    }

    public void setNlados(int nlados) {
        this.nlados = nlados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar_datos() {
        System.out.println("Número de lados: " + nlados);
        System.out.println("Nombre: " + nombre);
    }
}