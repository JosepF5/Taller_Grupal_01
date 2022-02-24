public class Luna extends SistemaPlanetario {

    public Luna(double masa, double densidad, double diametro, double distanciaSol, int ID, String nombre) {
        super(masa,densidad,diametro,distanciaSol,ID,nombre);
    }
    @Override
    public double GetAtraccionGravitatoria(SistemaPlanetario planeta1, SistemaPlanetario planeta2) {
        /*Representa la constante de gravitación universal en Nm^2/kg^2.*/
        double G = 6.77 * 10E-11;
        /**
         * Retorna el cálculo de la Fuerza mediante la fórmula de la fueza de atracción
         * gravitacional F = (G*(m1*m2))/d^2.
         */
        return (G * (planeta1.masa * planeta2.masa)) / Math.pow(Math.abs(planeta1.distanciaSol - planeta2.distanciaSol), 2);
    }
}
