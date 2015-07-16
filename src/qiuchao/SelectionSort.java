package qiuchao;

public class SelectionSort {
	public int[] Selection(int[] arr)
	{
		int tempMin;
		for(int i=0;i<arr.length;i++)
		{
			tempMin=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<tempMin)
				{
					tempMin=arr[j];
					arr[j]=arr[i];
					arr[i]=tempMin;
				}
			}
			for(int ii:arr)
				System.out.print(ii+" ");
			System.out.println();
		}
		return arr;
	}
	public static void main(String[] args) {
		SelectionSort SS=new SelectionSort();
		int[] arr=new int[]{3,1,4,8,2,10,5,6,9};
		arr=SS.Selection(arr);
		System.out.println();
		for(int i:arr)
			System.out.print(i+" ");
	}

}
