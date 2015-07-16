package qiuchao;

public class QuickSortTest {
	private int[] data;
	public QuickSortTest(int[] data) {
		this.data=data;
		quickSort(this.data,0,data.length-1);
	}
	public void quickSort(int[] data, int left, int right){
		int low=left;
		int high=right;
		if(low<high){
			int key=data[low];
			while(low<high){
				while(low<high&&data[high]>key)
					high--;
				data[low]=data[high];
				while(low<high&&data[low]<key)
					low++;
				data[high]=data[low];
			}
			data[low]=key;
			quickSort(data, left, low-1);
			quickSort(data, low+1, right);
		}
		
	}
	public int[] getData(){
		return this.data;
	}
	public static void main(String[] args) {
		int[] testData=new int[]{12,8,5,13,17,21,4,7,6,14};
		QuickSortTest qst=new QuickSortTest(testData);
		int[] sortedData=qst.getData();
		for(int i:sortedData){
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
