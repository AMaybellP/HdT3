import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal{
	
    public static void main(String[] args) throws FileNotFoundException{
    	Ordenamiento ord= new Ordenamiento();
    	RandomClass random= new RandomClass();
    	//int[] lista= random.generarLista();
    	
        //Metodo Generate Random
    	random.generarLista();
    	
        //Metodo Read del archivo
    	random.crearArchivo("archivo.txt", random.listaString());
    	random.crearLista("archivo.txt");
    	
    	//selección de la cantidad de datos a procesar
        Scanner keyboard = new Scanner(System.in); 
        int option1 = 0;
        while (option1 == 0){
		    System.out.print("Ingrese el número de datos que desea procesar (entre 2 y 3000): ");
		    try{
			    option1 = Integer.parseInt(keyboard.nextLine());
		    } catch (NumberFormatException e){
			    System.out.println();
			    System.out.println("Error: opcion invalida");
			    System.out.println();
			    option1 = 0;
		    }
       }
    	int[] lista= random.cortarLista(option1);
        
        int option = 0;
        while (option == 0){
		    System.out.println("[1] Selection Sort");
		    System.out.println("[2] Insertion Sort");
		    System.out.println("[3] Merge Sort");
		    System.out.println("[4] Quick Sort");
		    System.out.print("Elija el metodo de ordenamiento que desea: ");
		    try{
			    option = Integer.parseInt(keyboard.nextLine());
		    } catch (NumberFormatException e){
			    System.out.println();
			    System.out.println("Error: opcion invalida");
			    System.out.println();
			    option = 0;
		    }
       }
        if (option == 1){
            //METODO SELECTION SORT
        } if (option == 2){
            //METODO INSERTION SORT
            ord.insertionSort(lista,lista.length);
            for(int i=0; i<lista.length; i++)
            {
            	System.out.println(lista[i]);
            }
            System.out.println("Ordenado por Insertion!");
        } if (option == 3){
        	//METODO MERGE SORT
            ord.mergeSort(lista, lista.length);
            for(int i=0; i<lista.length; i++)
            {
            	System.out.println(lista[i]);
            }
            System.out.println("Ordenado por Merge!");
        } if (option == 4){
            //METODO QUICK SORT
        }
    }
