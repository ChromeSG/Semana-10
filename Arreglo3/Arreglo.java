package Arreglo3;

public class Arreglo {
    private int a[];

    //creación del constructor
    public Arreglo(int canElementos){
        a = new int[canElementos];
    }
    //LLenar arreglo
    public void llenarArreglo(){
        for (int i = 0; i < this.a.length; i++) {
            if (i%2 == 0){
                this.a[i] = (int)(Math.random()*100);
            }else{
                this.a[i] = a[i-1]*2;
            }
        }
    }
    //Método para invertir el arreglo
    public void invertirArreglo(){
        int temp;
        for (int i = 0; i < this.a.length/2; i++) {
            temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
    }
    //Método para intercambiar valores (0 con 1, 2 con 3, etc...)
    public void cambiarValores(){
        int temp;
        for (int i = 0; i < this.a.length; i++) {
            if(a.length%2 == 0){
                temp = a[i+1];
                a[i+1] = a[i];
                a[i] = temp;
                i++;
            }else{
                for (int j = 0; j < a.length-1; j++) {
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    j++;
                }
            }
        }
    }
    //Método para imprimir el arreglo
    public void imprimirArreglo(){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" - ");
        }
        System.out.println();
    }
    //Método para imprimir el arreglo de derecha a izquierda
    public void imprimirReverse(){
        invertirArreglo();
        imprimirArreglo();
    }
}