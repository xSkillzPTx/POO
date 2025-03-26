package Ficha4;

/**
 *
 * @author Igor
 */
public enum Planetas {
    MERCURIO(3.303e+23, 2.4397e6),
    VENUS (4.869e+24, 6.0518e6),
    TERRA (5.976e+24, 6.37814e6),
    MARTE (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27, 7.1492e7),
    SATURNO (5.688e+26, 6.0268e7),
    URANO (1.024e+26, 2.5559e7),
    NEPTUNO (1.024e+26, 2.4746e7);
    
    private static final double G = 6.673E-11;
    private final double massa;
    private final double raio;
    
    Planetas(double massa, double raio) {
    this.massa = massa;
    this.raio = raio;
}
    public double calcularGravidade() {
        return (G * massa) / (raio * raio);
    }
}
