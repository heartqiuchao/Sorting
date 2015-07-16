package qiuchao;

public class InsertSort {
	/*
	 * ≤Â»Î≈≈–Ú
	 */
	public int[] Insert(int[] arr)
	{
		int temp=0;
		for(int i=1;i<arr.length;i++){
			for(int j=i;j>0;j--)
				if(arr[j]<arr[j-1])
				{
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			for(int ii:arr)
				System.out.print(ii+" ");
			System.out.println();
		}
		return arr;
	}
	public static void main(String[] args) {
		InsertSort IS=new InsertSort();
		int[] arr=new int[]{3,7,4,8,2,1,0,5,6,9};
		arr=IS.Insert(arr);
		System.out.println();
		for(int i:arr)
			System.out.print(i+" ");

	}

}
