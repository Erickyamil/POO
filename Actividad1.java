import java.util.*;

// Actividad 2. Pasar arreglos a métodos en Java
public class Actividad1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("--METODOS  PARA  ARREGLOS--\n");
		System.out.print("Tamaño de su arreglo: ");
		int tamaño = entrada.nextInt();
		
		int [] Array = new int[tamaño];
		
		for(int i=0; i < Array.length; i++) {
			System.out.printf("Array [%d]: ", i+1);
			Array[i] = entrada.nextInt();
		}
		
        //Llame los métodos printArray, findMax y findMin e imprima los valores del arreglo y los valores máximo y mínimo.
		System.out.println("El valor máximo de su arreglo es: " + findMax(Array)+ "\n");
        System.out.println("El valor minimo de su arreglo es: " + findMin(Array) + "\n");
		printArray(Array);
	}
	
    //Cree un método llamado findMax que tome como parámetro un arreglo de enteros y devuelva el valor máximo del arreglo.
	public static int findMax(int [] Array) {
        int max = 0;
		for (int i=0; i < Array.length; i++) {
            if (Array[i] >= max) {
                max = Array[i];
            }
        }
        return max;
    }

    //Cree un método llamado findMin que tome como parámetro un arreglo de enteros y devuelva el valor mínimo del arreglo.
    public static int findMin(int [] Array) {
        int min = findMax(Array);
		for (int i=0; i < Array.length; i++) {
            if (Array[i] <= min) {
                min = Array[i];
            }
        }
        return min;
    }

    //Cree un método llamado printArray que tome como parámetro un arreglo de enteros e imprima sus valores.
    public static void printArray(int [] Array){
        System.out.println("IMPRIMIENDO SU ARREGLO");
        for(int i=0; i < Array.length; i++){
            System.out.printf("Array [%d] = %d\n", i+1, Array[i]);
        }
    }
}
