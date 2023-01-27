package luischaves_tarea2;

import java.util.Scanner;

public class LuisChaves_Tarea2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente = new Cliente();
        Meses meses = new Meses();

        int opcion;

        try {
            do {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite un numero");
                System.out.println("1- Crear Cliente");
                System.out.println("2- Mostrar Meses");
                System.out.println("3- Salir");
                opcion = sc.nextInt();
                System.out.println(" ");

                switch (opcion) {
                    case 1:
                        //cliente.cliente(nombre, apellido, opcion, direccion, correo);
                        break;
                    case 2:

                        break;
                    case 3:
                        System.out.println("Salir");
                        break;
                    default:
                        System.out.println("Ingrese 1 o 2");
                        break;
                }
            } while (opcion != 3);
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }

}
