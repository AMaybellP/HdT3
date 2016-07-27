public class Principal{
    public Principal(){}
    public static void main(String[] args){
        //Metodo Generate Random
        //Metodo Read del archivo
        Scanner keyboard = new Scanner(System.in); //Pequeño menu para ver por cual metodo de ordenamiento se ordenará el archivo
        int option = 0
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
        } if (option == 3){
            //METODO MERGE SORT
        } if (option == 4){
            //METODO QUICK SORT
        }
    }
}
