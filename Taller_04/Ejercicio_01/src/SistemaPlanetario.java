public abstract class SistemaPlanetario {
    /**
     * Este atributo representa la masa en Kg del cuerpo celeste que hace parte
     * del Sistema planetario.
     */
    public double masa;
    /**
     * Este atributo representa la densidad en g/cm^3 del cuerpo celeste que
     * hace parte del Sistema planetario.
     */
    public double densidad;
    /**
     * Este atributo representa el diámetro en Km del cuerpo celeste que hace
     * parte del Sistema planetario.
     */
    public double diametro;
    /**
     * Este atributo representa la distancia al sol en m del cuerpo celeste que
     * hace parte del Sistema planetario.
     */
    public double distanciaSol;
    /**
     * Este atributo representa la Identificación del cuerpo celeste que hace
     * parte del Sistema planetario.
     */
    public int ID;
    /**
     * Este atributo representa el nombre del cuerpo celeste que hace parte del
     * Sistema planetario.
     */
    public String nombre;

    public SistemaPlanetario(double masa, double densidad, double diametro, double distanciaSol, int ID, String nombre) {
        this.masa = masa;
        this.densidad = densidad;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.ID = ID;
        this.nombre = nombre;
    }

    public abstract double GetAtraccionGravitatoria(SistemaPlanetario planeta1, SistemaPlanetario planeta2);
}
