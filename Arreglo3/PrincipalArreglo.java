package Arreglo3;
import java.util.Scanner;

public class PrincipalArreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int canElementos;
        char metodo= ' ';
        char pruebaMetodo= ' ';

        System.out.println("Digite la cantidad de elementos que desea que tenga el arreglo: ");
        canElementos = entrada.nextInt();
        Arreglo arreglo1 = new Arreglo(canElementos);
        arreglo1.llenarArreglo();
        do{
                //Menú
                System.out.println("Escoja un método a usar");
                System.out.println("a- Método para invertir el arreglo");
                System.out.println("b- Método para intercambiar valores (0 con 1, 2 con 3, etc...)");
                System.out.println("c- Método para imprimir el arreglo");
                System.out.println("d- Método para imprimir el arreglo de derecha a izquierda");
                System.out.println("e- Escoger otra cantidad de elementos que desea que tenga el arreglo");
                System.out.println("f- Salir");
                metodo = entrada.next().charAt(0);

                switch (metodo) {
                    case 'a':
                    case 'A':
                        arreglo1.invertirArreglo();                        
                        System.out.println("Se ha invertido el arreglo.");
                        System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMetodo = entrada.next().charAt(0);
                        break;
                    case 'b':
                    case 'B':
                        arreglo1.cambiarValores();
                        System.out.println("Los valores se han intercambiado.");
                        System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMetodo = entrada.next().charAt(0);
                        break;
                    case 'c':
                    case 'C':
                    arreglo1.imprimirArreglo();
                    System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMetodo = entrada.next().charAt(0);
                        break;
                    case 'd':
                    case 'D':
                        arreglo1.imprimirReverse();
                        System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMetodo = entrada.next().charAt(0);
                        break;
                    case 'e':
                    case 'E':
                        System.out.println("Ingrese la cantidad de elementos que va a contener el arreglo: ");
                        canElementos = entrada.nextInt();
                        arreglo1 = new Arreglo(canElementos);
                        arreglo1.llenarArreglo();
                        System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMetodo = entrada.next().charAt(0);
                        break;
                    case 'f':
                    case 'F':
                        break;
                    default:
                        System.out.println("La letra ingresada no pertenece a una opción ");
                        System.out.println("¿Desea provar un método con el mismo arreglo?(s/n)");
                        pruebaMetodo = entrada.next().charAt(0);
                        break;
                }
        }while(pruebaMetodo == 's' || pruebaMetodo == 'S');
        
    }
}
