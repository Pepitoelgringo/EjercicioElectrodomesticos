import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        try {
            Lavadora lavadora1 = new Lavadora("sssss", 125);
            do {
                System.out.println("MENU DE OPCIONES:" +
                        "\n1.- Reservar Habitacion" +
                        "\n2.- Cancelar Reserva" +
                        "\n3.- Cargar servicios Hotel al Cliente(Comidas, Spa,bebidas,..) " +
                        "\n4-  Facturar habitacion al Cliente + servicios " +
                        "\n5-  Nº de habitaciones libres" +
                        "\n6-  Buscar Nº de Habitacion de un Cliente" +
                        "\n0.- Salir");

                System.out.println("Enter la opcion elegida: ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 0:
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Número no reconocido");
                        break;
                }//switch

                System.out.println("\n"); //Mostrar un salto de línea en Java



            } while (opcion != 0);//while
            System.out.println("Hasta pronto");
        } //try
        catch (Exception e) {
            System.out.println("Uoop! Error!");
        }//catch


    }
}