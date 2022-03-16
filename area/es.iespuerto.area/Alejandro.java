package es.iespuerto.area;

/**
 * @author Alejandro Marrero
 * @param tipo
 * @param valor1
 * @param valor2
 */
public class Alejandro {
    private String tipo; //Si es cuadrado o rectangulo
    private int valor1; //primer parametro para el calculo del area
    private int valor2; //segundo parametro para el calculo del area
    /**
     * Constructor por defecto
     */
    public Alejandro() {

    }
    /**
     * Constructor con un parametro
     * @param parametro1
     */
    public Alejandro(int parametro1) {
        this.valor1=parametro1;
    }
    /**
     * Constructor con dos parametros
     * @param parametro1
     * @param parametro2
     */
    public Alejandro(int parametro1, int parametro2) {
        this.valor1=parametro1;
        this.valor2=parametro2;
    }
    /**
     * Clase calculo area que recibe dos parametros
     * @param valor1
     * @param valor2
     */
    public calculoArea(int valor1, int valor2) {

    }
}
