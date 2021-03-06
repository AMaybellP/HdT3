/**
 * Clase: Ordenamiento
 * @author Gladys De La Roca 15755
 * @author Andrea Pena 15127
 * @author Jackeline Hidalgo 15776
 * @author Rene Olivet 15238
 * Los códigos mergeSort, quickSort, selectionSort y insertionSort fueron tomados de: Java Structures:Data Structure
 * for the Principled Programmer.
 */
public class Ordenamiento {
	//metodo mergesort
	public void merge(int data[],int temp[], int low, int middle, int high)
	{
		int ri= low;
		int ti= low;
		int di= middle;
		
		while(ti<middle && di<=high)
		{
			if(data[di]<temp[ti])
			{
				data[ri++]=data[di++];
			}
			else
			{
				data[ri++]=temp[ti++];
			}
		}
		while(ti<middle)
		{
			data[ri++]=temp[ti++];
		}
	}
	public void mergeSortRecursive(int data[], int temp[], int low, int high)
	{
		int n= high-low+1;
		int middle= low + n/2;
		int i;
		
		if (n<2) return;
		for (i=low; i<middle; i++)
		{
			temp[i]=data[i];
		}
		mergeSortRecursive(temp,data,low,middle-1);
		mergeSortRecursive(data,temp,middle,high);
		merge(data,temp,low,middle,high);
		
	}
	public void mergeSort(int data[], int n)
	{
		mergeSortRecursive(data,new int[n],0,n-1);
	}

	//metodo quickSort 
	int partition(int arr[], int left, int right)
	{
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	     
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}
	 
	void quickSortRecursive(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSortRecursive(arr, left, index - 1);
	      if (index < right)
	            quickSortRecursive(arr, index, right);
	}
	
	public void quickSort(int data[], int n)
	{
	quickSortRecursive(data,0,n-1);
	}
	
	
	
	//metodo selectionSort
	public static void selectionSort(int data[], int n) {
      	int i, j, index, max;    
      	for (i = 0; i < n - 1; i++) {
            index = i;
            for (j = i + 1; j < n; j++)
                  if (data[j] < data[index])
                        index = j;
            if (index != i) {
                  max = data[i];
                  data[i] = data[index];
                  data[index] = max;
            }
      }
}

	//metodo insertionSort
	public static void insertionSort(int data[], int n){
		//n = data.length
		int x = 1; //posicion del valor a ordenar
		int index; //posicion de datos a evaluar
		while (x < n){
			int temp = data[x];//valor a ordenar en variable temporal
			for (index = x; index > 0; index--){
				if (temp < data[index-1]){
					data[index] = data[index-1]; //cambia los valores de lugar
				} else{
					break;
				}
			}
			data[index] = temp; //en index debido a la ultima corrida del for
			x++;
		}
	}
}
