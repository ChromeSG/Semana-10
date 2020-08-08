package Arreglo1;

/**
 * Arreglo
 */
public class Arreglo {

    private int a[];
    //constructor
    public Arreglo(int canElementos){
        this.a = new int[canElementos];
    }
    //Método para llenar el arreglo
    public void llenarConDoble(){
        for (int i = 0; i < this.a.length; i++) {
            this.a[i] = i*2; 
        }
    }
    //Metodo para retornar el valor menor del arreglo
    public int menorArreglo(){
        int menor = this.a.length;
        for (int i = 0; i < this.a.length; i++) {
            if (this.a[i] < menor){
                menor = this.a[i];
            }
        }
        return menor;
    }
    //método para retornar el promedio del arreglo
    public double promedioArreglo(){
        double promedio = 0;
        for (int i = 0; i < this.a.length; i++) {
            promedio = promedio + this.a[i];
        }
        double promedioFinal = promedio / this.a.length;
        return promedioFinal;
    }
    //Método para retornar cantidad de elementos mayor al promedio
    public int mayorProm(){
        int total = 0;
        for (int i = 0; i < this.a.length; i++) {
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