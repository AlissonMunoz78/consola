import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la cédula del estudiante: ");
        String cedula = scanner.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();

        Estudiante estudiante = new Estudiante(nombre, cedula, edad);
        estudiante.imprimirInfo();

        scanner.close();
    }
}
