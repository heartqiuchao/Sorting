package qiuchao;

public class BubbleSort {
	/*
	 * ц╟ещеепР
	 */
	public int[] bubbleSort(int[] arr)
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			for(int ii:arr)
				System.out.print(ii+" ");
			System.out.println();
		}
		return arr;
	}
	public static void main(String[] args) {
		BubbleSort BS=new BubbleSort ();
		int[] arr=new int[]{5,7,1,8,3,4,0,6};
		arr=BS.bubbleSort(arr);
		System.out.println();
		for(int i:arr)
			System.out.print(i+" ");
	}

}
