
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

}
