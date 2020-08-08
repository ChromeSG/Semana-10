package Arreglo2;

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