package qiuchao;

public class HeapSort {
	public void heapSort(int[] data)
	{
		MaxHeap MH=new MaxHeap();
		MH.init(data);
		for(int i=0;i<data.length;i++)
			MH.remove();
	}
	private static class MaxHeap
	{
		private int size=0;
		private int[] queue;
		private void swap(int a,int b)
		{
			int temp=a;
			a=b;
			b=temp;
		}
		 private void fixUp(int k) {  
	            while (k > 1) {  
	                int j = k >> 1;  
	                if (queue[j]>queue[k])  
	                    break;  
	                swap(queue[j],queue[k]);
	                k = j;  
	            }  
	        }  
		 private void fixDown(int k) {  
	            int j;  
	            while ((j = k << 1) <= size) {  
	                if (j < size && queue[j]<queue[j+1])  
	                    j++;   
	                if (queue[k]>queue[j]) //≤ª”√Ωªªª  
	                    break;  
	               swap(queue[j],queue[k]);  
	                k = j;  
	            }  
	        }  
		public void init(int[] data)
		{
			this.queue=new int[data.length+1];
			for(int i=0;i<data.length;i++)
			{
				queue[++size]=data[i];
				fixUp(size);
			}
		}
		public void remove() {  
            swap(queue[1],queue[size--]);  
            fixDown(1);  
        }  
		public int get() {  
            return queue[1];  
        }  
	}
	public static void main(String[] args) {
		

	}

}
