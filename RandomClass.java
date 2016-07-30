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

	public int[] getListas() {
		return listas;
	}

	public void setListas(int[] listas) {
		this.listas = listas;
	}

}
