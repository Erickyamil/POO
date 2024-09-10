import java.util.*;

public class PromedioPonderado {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        //Declaración de los tres arreglos principales
        int [] arrayCreditos = new int[6];
        double [] arrayCalif = new double[6];
        double [] arrayTotal = new double[6];
        
        System.out.println("//CALCULO DE PROMEDIO PONDERADO//"); //Mensaje de inicio.
        guardarCalif(entrada, arrayCalif); //Guardar en un array las calificaciones ingresadas por el usuario.
        guardarCalif(entrada, arrayCreditos);//Guardar en un array los creditos de cada materia segun el usuario.
        obtenerTotal(arrayCreditos, arrayCalif, arrayTotal); //Guardar en un array los valores del total (total = creditos*calificaciones).
        obtenerPromedioPonder(obtenerSuma(arrayTotal), obtenerSuma(arrayCreditos));// Calcular el promedio ponderado final.
        }

    //Metodo encargado de guardar las calificaciones ingresadas por el usuario.
    public static void guardarCalif(Scanner entrada, double[] arrayCalif){
        for(int i=0; i<arrayCalif.length; i++){
            System.out.print("Ingrese su calificacion " + (i+1) + " : ");
            arrayCalif[i] = entrada.nextInt();
        }
    }

    public static void guardarCalif(Scanner entrada, int[] arrayCreditos){
        for(int i=0; i<arrayCreditos.length; i++){
            System.out.print("Ingrese el valor de creditos para la mteria " + (i+1) + " : ");
            arrayCreditos[i] = entrada.nextInt();
        }
    }

    //Metodo encargado de calcular y asignar los valores del total en un arreglo.
    public static void obtenerTotal(int[] arrayCreditos, double[] arrayCalif, double[] arrayTotal){
        for(int i=0; i<6; i++){
            arrayTotal[i] = (arrayCreditos[i] * arrayCalif[i]);
        }
    }

    //Metodo encargado de sumar todos los valores de un arreglo.
    public static double obtenerSuma(int[] array){
        double suma = 0;
        for(int i=0; i<array.length; i++){
            suma += array[i];
        }
        return suma;
    }

    public static double obtenerSuma(double [] array){
        double suma = 0;
        for(int i=0; i<array.length; i++){
            suma += array[i];
        }
        return suma;
    }

    //Metodo encargado de imprimir un arreglo.
    public static void imprimirArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    //Metodo encargado de obtener el promedio ponderado final.
    public static void obtenerPromedioPonder(double totalT, double creditosT){
        double promedioP = (totalT/creditosT);
        System.out.printf("Promedio Ponderado = %.2f%n", promedioP);
    }
}
