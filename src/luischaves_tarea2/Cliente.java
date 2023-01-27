package luischaves_tarea2;

import java.util.Scanner;

public class Cliente {

    private String nombre;
    private String apellido;
    private int telefono;
    private String direccion;
    private String correo;
    
    
    public void cliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el nombre del cliente");
        nombre= sc.next();
        System.out.println(" ");
        
        System.out.println("Digite el apellido del cliente");
        apellido= sc.next();
        System.out.println(" ");
        
        System.out.println("Digite el telefono del cliente");
        telefono = Integer.parseInt(sc.next());
        System.out.println(" ");
        
        System.out.println("Digite la direccion del cliente");
        direccion = sc.next();
        System.out.println(" ");
        
        System.out.println("Digite el correo del cliente");
        correo = sc.next();
        System.out.println(" ");
        
        
        System.out.println("La informacion del cliente es: " + nombre + " " + apellido + " " + telefono + " " + direccion + " " + correo);
        
    }
}
