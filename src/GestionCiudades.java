import java.util.HashSet;
import java.util.Scanner;


public class GestionCiudades {

    public static void main(String[] args) {
        HashSet<String> ciudades = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

            while (!salir) {
                System.out.println("\n---Gestión de Ciudades---");
                System.out.println("1. Agregar una ciudad");
                System.out.println("2. Mostrar todas las ciudades");
                System.out.println("3. Buscar una ciudad");
                System.out.println("4. Eliminar una ciudad");
                System.out.println("5. Salir");
                System.out.print("Elige una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); //Para limpiar el buffer

                switch (opcion) {
                    case 1:
                        System.out.print("Introduce el nombre de la ciudad: ");
                        String nuevaCiudad = scanner.nextLine().trim();
                        if (ciudades.contains(nuevaCiudad)) {
                            System.out.println("Error: La ciudad ya existe en la lista.");
                        } else {
                            ciudades.add(nuevaCiudad);
                            System.out.println("Ciudad agregada correctamente.");
                        }
                        break;
                    case 2:
                        if (ciudades.isEmpty()) {
                            System.out.println("No hay ciudades en la lista.");
                        } else {
                            System.out.println("Lista de ciudades:");
                            for (String ciudad : ciudades) {
                                System.out.println("- " + ciudad);
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Introduce el nombre de la ciudad a buscar: ");
                        String ciudadBuscar = scanner.nextLine().trim();
                        if (ciudades.contains(ciudadBuscar)) {
                            System.out.println("La ciudad existe en la lista.");
                        } else {
                            System.out.println("La ciudad no existe en la lista.");
                        }
                        break;
                    case 4:
                        System.out.print("Introduce el nombre de la ciudad a eliminar: ");
                        String ciudadEliminar = scanner.nextLine().trim();
                        if (ciudades.remove(ciudadEliminar)) {
                            System.out.println("Ciudad eliminada correctamente.");
                        } else {
                            System.out.println("Error: La ciudad no existe en la lista.");
                        }
                        break;
                    case 5:
                        salir = true;
                        System.out.println("¡Hasta luego!");
                        return;
                    default:
                        System.out.println("Opción no válida. Tienes que introducir un número del 1 al 4 que hay en el menú de inicio.");
                }
            }
            scanner.close(); }
    }

