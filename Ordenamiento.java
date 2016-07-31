
public class Ordenamiento {

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


public static void selectionSort(int data[], int n){

	int numUnsorted = n;
	int index; 
	int max; 

	while (numUnsorted > 0){

	max = 0;
	for (index = 1; index < numUnsorted; index++){

	if (data[max] < data[index]) max = index;
	}

	swap(data,max,numUnsorted-1);
	numUnsorted--;
	}
}

void selectionSort(int data, int n) {
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
}
