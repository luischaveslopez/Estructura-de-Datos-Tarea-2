package luischaves_tarea2;

import java.util.Scanner;

public class Meses {

    private String listaMeses[] = new String[12];

    public void mostrarMeses() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < listaMeses.length; i++) {
            System.out.println("Ingrese un mes: ");
            listaMeses[i] = sc.next();
            System.out.println("Desea ingresar otro mes?");
            int respuesta = sc.nextInt();
            if (respuesta == 0) {
                break;
            }
        }
        for (int i = 0; i < listaMeses.length; i++) {
            System.out.println("Mes: " + listaMeses[i]);
        }
    }
}
