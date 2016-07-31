import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class RandomClass {
	
	private int[] listas= new int[3000];

	public int[] generarLista()
	{
		Random generador= new Random();
		for (int i=0; i<3000; i++)
		{
			int randomNum = generador.nextInt(100);
			listas[i]= randomNum;
		}
		return listas;
	}
	
	public String listaString()
	{
		String stringL= "";
		for (int i=0; i<listas.length; i++)
		{
			stringL= stringL+String.valueOf(listas[i])+" ";
		}
		//System.out.println(stringL);
		return stringL;
	}
	
	public void crearArchivo(String archivo, String list) throws FileNotFoundException
	{
		PrintWriter writer= new PrintWriter(archivo);
		writer.println(list);
		writer.close();
	}
	
	//Metodo que lee un txt y devuelve un string con lo escrito dentro
	public String LeerArchivo(String direccion) {
	      // Leer una linea a la vez 
	       String line = null;

	       try {
	           // FileReader lee el texto 
	           FileReader fileReader = new FileReader(direccion);
	           BufferedReader bufferedReader =  new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	                return line;
	            }   

	            // Cerrar el texto 
	            bufferedReader.close();         
	        }
	        //Si no logra abir el archivo mandar un mensaje 
	        catch(IOException ex) {
	            System.out.println("No se pudo leer el archivo '" + direccion + "'");                  
	        }
	        return line;
	       
	    }
	
	//forma la lista dependiendo el número de enteros que se desee procesar
	public int[] crearLista(String direccion)
	{
		int[] listaInts= new int[3000];
		String listaS= LeerArchivo(direccion);
		//System.out.println("lista leida: "+listaS); //DEBUG
		char[] cadena= listaS.toCharArray();
		int [] nums= {0,0};
		int k=1;
		int c=0;
		
		for(char i: cadena)
		{
			//Verificar si es un numero 
			int num= Character.getNumericValue(i);
			
			if(num!=-1)
			{
				nums[k]=num;
				k--;
			}
			else
			{
				int numero= (nums[1]*10)+(nums[0]);
				//System.out.println("numero"+c+": "+numero);//DEBUG
				listaInts[c]=numero;
				nums[0]=0;
				nums[1]=0;
				k=1;
				c++;
			}
		}
		
		return listaInts;
	}
	
	public int[] cortarLista(int n)
	{
		int[] listaCortada= new int[n];
		for(int i=0; i<n; i++)
		{
			listaCortada[i]= listas[i];
		}
		return listaCortada;
	}

	public int[] getListas() {
		return listas;
	}

	public void setListas(int[] listas) {
		this.listas = listas;
	}

}
