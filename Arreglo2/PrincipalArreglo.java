package Arreglo2;
import java.util.Scanner;

public class PrincipalArreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int canElementos;
        char metodo= ' ';
        char pruebaMetodo= ' ';
            System.out.println("Digite la cantidad de desea que tenga el arreglo: ");
            canElementos = entrada.nextInt();
            Arreglo arreglo1 = new Arreglo(canElementos);
            arreglo1.llenarArreglo();
            do{
                //Menú
                System.out.println("Escoja un método a usar");
                System.out.println("a- Conocer la cantidad de valores pares existentes en el arreglo");
                System.out.println("b- Conocer la suma de los valores pares");
                System.out.println("c- Conocer la cantidad de valores impares existentes en el arreglo");
                System.out.println("d- Conocer la suma de los valores impares");
                System.out.println("e- Imprimir el arreglo completo");
                System.out.println("f- Escoger otra cantidad de elementos que desea que tenga el arreglo");
                System.out.println("g- Salir");
                metodo = entrada.next().charAt(0);

                switch (metodo) {
                    case 'a':
                    case 'A':
                        System.out.println("La cantidad de valores pares existentes equivale a: "+ arreglo1.canPares());
                        System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMetodo = entrada.next().charAt(0);
                        break;
                    case 'b':
                    case 'B':
                        System.out.println("La suma total de los valores pares es de: "+arreglo1.sumaPares());
                        System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMetodo = entrada.next().charAt(0);
                        break;
                    case 'c':
                    case 'C':
                    System.out.println("La cantidad de valores impares existentes equivale a: "+ arreglo1.canImpares());
                    System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMetodo = entrada.next().charAt(0);
                        break;
                    case 'd':
                    case 'D':
                        System.out.println("La suma total de los valores impares es de: "+arreglo1.sumaImpares());
                        System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMetodo = entrada.next().charAt(0);
                        break;
                    case 'e':
                    case 'E':
                        arreglo1.imprimirArreglo();
                        System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMetodo = entrada.next().charAt(0);
                        break;
                    case 'f':
                    case 'F':
                        System.out.println("Ingrese la cantidad de elementos que va a contener el arreglo: ");
                        canElementos = entrada.nextInt();
                        arreglo1 = new Arreglo(canElementos);
                        arreglo1.llenarArreglo();
                        System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMetodo = entrada.next().charAt(0);
                        break;
                    case 'g':
                    case 'G':
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
//Jeliot
/*
public class Arreglo {
    int a[];

    public Arreglo(int canElementos){
        this.a = new int[canElementos];
    }

    //Llenar arreglo
    public void llenarArreglo(){
        for (int i = 0; i < this.a.length; i++) {
            if(i%2 == 0){
                this.a[i] = (int)(Math.random()*20);
            }else{
                this.a[i] = (int)Math.pow(i, 2);
            }
        }
    }
    //Cantidad de números pares
    public int canPares(){
        int cantidad = 0;
        for (int i = 0; i < this.a.length; i++) {
            if (this.a[i]%2 == 0){
                cantidad++;
            }
        }
        return cantidad;
    }
    //Suma de los valores pares
    public int sumaPares(){
        int suma = 0;
        for (int i = 0; i < this.a.length; i++) {
            if (this.a[i]%2 == 0){
                suma = suma + a[i];
            }
        }
        return suma;
    }
    ////Cantidad de números impares
    public int canImpares(){
        int cantidad = 0;
        for (int i = 0; i < this.a.length; i++) {
            if (this.a[i]%2 != 0){
                cantidad++;
            }
        }
        return cantidad;
    }
    //Suma de los valores pares
    public int sumaImpares(){
        int suma = 0;
        for (int i = 0; i < this.a.length; i++) {
            if (a[i]%2 != 0){
                suma = suma + a[i];
            }
        }
        return suma;
    }
    //imprimir arreglo
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
        char metodo= ' ';
        char pruebaMetodo= ' ';
            System.out.println("Digite la cantidad de desea que tenga el arreglo: ");
            canElementos = Input.readInt();
            Arreglo arreglo1 = new Arreglo(canElementos);
            arreglo1.llenarArreglo();
            do{
                //Menú
                System.out.println("Escoja un método a usar");
                System.out.println("a- Conocer la cantidad de valores pares existentes en el arreglo");
                System.out.println("b- Conocer la suma de los valores pares");
                System.out.println("c- Conocer la cantidad de valores impares existentes en el arreglo");
                System.out.println("d- Conocer la suma de los valores impares");
                System.out.println("e- Imprimir el arreglo completo");
                System.out.println("f- Escoger otra cantidad de elementos que desea que tenga el arreglo");
                System.out.println("g- Salir");
                metodo = Input.readChar();

                switch (metodo) {
                    case 'a':
                    case 'A':
                        System.out.println("La cantidad de valores pares existentes equivale a: "+ arreglo1.canPares());
                        System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMetodo = Input.readChar();
                        break;
                    case 'b':
                    case 'B':
                        System.out.println("La suma total de los valores pares es de: "+arreglo1.sumaPares());
                        System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMetodo = Input.readChar();
                        break;
                    case 'c':
                    case 'C':
                    System.out.println("La cantidad de valores impares existentes equivale a: "+ arreglo1.canImpares());
                    System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMetodo = Input.readChar();
                        break;
                    case 'd':
                    case 'D':
                        System.out.println("La suma total de los valores impares es de: "+arreglo1.sumaImpares());
                        System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMetodo = Input.readChar();
                        break;
                    case 'e':
                    case 'E':
                        arreglo1.imprimirArreglo();
                        System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMetodo = Input.readChar();
                        break;
                    case 'f':
                    case 'F':
                        System.out.println("Ingrese la cantidad de elementos que va a contener el arreglo: ");
                        canElementos = Input.readInt();
                        arreglo1 = new Arreglo(canElementos);
                        arreglo1.llenarArreglo();
                        System.out.println("¿Desea provar otro método con el mismo arreglo?(s/n)");
                        pruebaMetodo = Input.readChar();
                        break;
                    case 'g':
                    case 'G':
                        break;                    
                    default:
                        System.out.println("La letra ingresada no pertenece a una opción ");
                        System.out.println("¿Desea provar un método con el mismo arreglo?(s/n)");
                        pruebaMetodo = Input.readChar();
                        break;
                }
            }while(pruebaMetodo == 's');
    }
}
*/