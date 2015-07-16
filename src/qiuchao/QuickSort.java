package qiuchao;

public class QuickSort {
	private int Data[];
	
	public QuickSort(int[] data) {
		Data=data;
		quickSort(Data,0,Data.length-1);
	}

	public void quickSort(int[] data,int left,int right)
	{
		int low=left;
		int high=right;
		if(low<high)
		{
			int key=data[low];
			System.out.println("Key:"+key);
			while(low<high)
			{
				while(low<high&&data[high]>key)
					high--;
				data[low]=data[high];
				while(low<high&&data[low]<key)
					low++;
				data[high]=data[low];
//				System.out.print("|high:"+data[high]+"|low:"+data[low]);
				for(int i=left;i<=right;i++)
					System.out.print(data[i]+" ");
				System.out.println();
			}
			data[low]=key;
			System.out.println();
			for(int i=left;i<=right;i++)
				System.out.print(data[i]+" ");
			System.out.println("\n***************************");
			quickSort(data,left,low-1);
			quickSort(data,low+1,right);
		}
	}
	public int[] getData()
	{ 
		return Data;
	}
	public static void main(String[] args) {
		
		int[] data=new int[]{12,8,5,13,17,21,4,7,6,14};
		QuickSort QS=new QuickSort(data);
		for(int i:QS.getData())
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
