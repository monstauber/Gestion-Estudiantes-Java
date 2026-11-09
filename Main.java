
/**
 * 
 * Main
 */
public class Main {

    public static void main(String[] args) {

        // Creamos el primer estudiante
        Estudiante estudiante1 = new Estudiante(
            "Carlos", 20, "A001", 90, 85
        );

        // Creamos el segundo estudiante
        Estudiante estudiante2 = new Estudiante(
            "Maria", 21, "A002", 75, 80
        );

        // Creamos el tercer estudiante
        Estudiante estudiante3 = new Estudiante(
            "Jose", 19, "A003", 60, 55
        );

        // Mostramos los datos del primer estudiante
        System.out.println("===== ESTUDIANTE 1 =====");
        estudiante1.mostrarDatos();
        System.out.println("Promedio: " + estudiante1.calcularPromedio());
        estudiante1.verificarAprobacion();

        // Mostramos los datos del segundo estudiante
        System.out.println("\n===== ESTUDIANTE 2 =====");
        estudiante2.mostrarDatos();
        System.out.println("Promedio: " + estudiante2.calcularPromedio());
        estudiante2.verificarAprobacion();

        // Mostramos los datos del tercer estudiante
        System.out.println("\n===== ESTUDIANTE 3 =====");
        estudiante3.mostrarDatos();
        System.out.println("Promedio: " + estudiante3.calcularPromedio());
        estudiante3.verificarAprobacion();
    }
}

