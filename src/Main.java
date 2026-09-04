import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Procesando estudiante " + i);}
        int opcion = 0;
        while (opcion != 3) {

            System.out.println("=== SISTEMA DUOC ===");
            System.out.println("1. Mostrar estado");
            System.out.println("2. Procesar operación");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Scanner.nextInt();

            if (opcion == 1) {
            } else if (opcion == 2){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese carrera: ");
            String carrera = scanner.nextLine();
            System.out.println("Ingrese edad: ");
            int edad = scanner.nextInt();

            Estudiante estudiante = new Estudiante(nombre, carrera, edad);

            if (edad < 18) {
                System.out.println("Estudiante menor de edad");
            } else if (edad < 25) {
                System.out.println("Estudiante joven");
            } else {
                System.out.println("Estudiante adulto");
            }

            estudiante.mostrarInformacion();
                }
            }
        }
    }
