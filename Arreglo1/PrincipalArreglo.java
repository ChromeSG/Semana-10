package Arreglo1;
import java.util.Scanner;

public class PrincipalArreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int canElementos;
        char meto;
        char pruebaMeto = ' ';
            System.out.println("Digite la cantidad de elementos que desea que tenga el arreglo");
            canElementos = entrada.nextInt();
            Arreglo arreglo1 = new Arreglo(canElementos);
            arreglo1.llenarConDoble();
            do{
                //Menú
                System.out.println("Escoja un metodo a usar:");
                System.out.println("a- Método para retornar el valor menor del arreglo");
                System.out.println("b- Método para retornar el promedio del arreglo");
                System.out.println("c- Método para retornar cantidad de elementos mayor al promedio");
                System.out.println("d- Método para imprimir el arreglo");
                System.out.println("e- Escoger otra cantidad de elementos que desea que tenga el arreglo");
                System.out.println("f- Salir");
                meto = entrada.next().charAt(0);

                switch (meto) {
                    case 'a':
                    case 'A':
                        System.out.println("El valor menor del arreglo equivale a: "+ arreglo1.menorArreglo());
                        System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMeto = entrada.next().charAt(0);
                        break;
                    case 'b':
                    case 'B':
                        System.out.println("El promedio del arreglo equivale a : "+arreglo1.promedioArreglo());
                        System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMeto = entrada.next().charAt(0);
                        break;
                    case 'c':
                    case 'C':
                        System.out.println("La cantidad de elementos que son mayores que el arreglo equivale a: "+ arreglo1.mayorProm()); 
                        System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMeto = entrada.next().charAt(0);
                        break;
                    case 'd':
                    case 'D':
                        arreglo1.imprimirArreglo();
                        System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMeto = entrada.next().charAt(0);
                        break;
                    case 'e':
                    case 'E':
                        System.out.println("Ingrese la cantidad de elementos que va a contener el arreglo: ");
                        canElementos = entrada.nextInt();
                        arreglo1 = new Arreglo(canElementos);
                        arreglo1.llenarConDoble();
                        System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMeto = entrada.next().charAt(0);
                        break;
                    case 'f':
                    case 'F':
                        break;
                    default:
                        System.out.println("La letra ingresada no pertenece a una opción ");
                        System.out.println("¿Desea provar un método con el mismo arreglo?(s/n)");
                        pruebaMeto = entrada.next().charAt(0);
                        break;
                }
            }while(pruebaMeto == 's' || pruebaMeto == 'S');
    }
}
//Jeliot
/* 
public class Arreglo {

    private int a[];
    //constructor
    public Arreglo(int canElementos){
        this.a = new int[canElementos];
    }
    //Método para llenar el arreglo
    public void llenarConDoble(){
        for (int i = 0; i < a.length; i++) {
            this.a[i] = i*2; 
        }
    }
    //Metodo para retornar el valor menor del arreglo
    public int menorArreglo(){
        int menor = this.a.length;
        for (int i = 0; i < a.length; i++) {
            if (this.a[i] < menor){
                menor = this.a[i];
            }
        }
        return menor;
    }
    //método para retornar el promedio del arreglo
    public double promedioArreglo(){
        double promedio = 0;
        double promedioFinal;
        for (int i = 0; i < a.length; i++) {
            promedio = promedio + a[i];
        }
        promedioFinal = promedio / a.length;
        return promedioFinal;
    }
    //Método para retornar cantidad de elementos mayor al promedio
    public int mayorProm(){
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > promedioArreglo()){
                total++;
            }
        }
        return total;
    }
    //Método para imprimir el arreglo
    public void imprimirArreglo(){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " - ");
        }
        System.out.println();
    }
}

public class PrincipalArreglo {
    public static void main(String[] args) {        
        int canElementos;
        char meto;
        char pruebaMeto = ' ';
        System.out.println("Digite la cantidad de elementos que desea que tenga el arreglo");
        canElementos = Input.readInt();
        Arreglo arreglo1 = new Arreglo(canElementos);
        arreglo1.llenarConDoble();
        do{

            //Menú
            System.out.println("Escoja un metodo a usar:");
            System.out.println("a- Método para retornar el valor menor del arreglo");
            System.out.println("b- Método para retornar el promedio del arreglo");
            System.out.println("c- Método para retornar cantidad de elementos mayor al promedio");
            System.out.println("d- Método para imprimir el arreglo");
            System.out.println("e- Escoger otra cantidad de elementos que desea que tenga el arreglo");
            System.out.println("f- Salir");
            meto = Input.readChar();

            switch (meto) {
                case 'a':
                case 'A':
                    System.out.println("El valor menor del arreglo equivale a: "+ arreglo1.menorArreglo());
                    System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                    pruebaMeto = Input.readChar();
                    break;
                case 'b':
                case 'B':
                    System.out.println("El promedio del arreglo equivale a : "+arreglo1.promedioArreglo());
                    System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                    pruebaMeto = Input.readChar();
                    break;
                case 'c':
                case 'C':
                    System.out.println("La cantidad de elementos que son mayores que el arreglo equivale a: "+ arreglo1.mayorProm()); 
                    System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                    pruebaMeto = Input.readChar();
                    break;
                case 'd':
                case 'D':
                    arreglo1.imprimirArreglo();
                    System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                    pruebaMeto = Input.readChar();
                    break;
                case 'e':
                case 'E':
                    System.out.println("Ingrese la cantidad de elementos que va a contener el arreglo: ");
                    canElementos = Input.readInt();
                    arreglo1 = new Arreglo(canElementos);
                    arreglo1.llenarConDoble();
                    System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                    pruebaMeto = Input.readChar();
                    break;
                case 'f':
                case 'F':
                    break;
                default:
                    System.out.println("La letra ingresada no pertenece a una opción ");
                    System.out.println("¿Desea provar un método con el mismo arreglo?(s/n)");
                    pruebaMeto = Input.readChar();
                    break;
            }
        }while(pruebaMeto == 's' || pruebaMeto == 'S');
    }
}
*/