package qiuchao;

public class SortUtil {
	public int[] sort(int[] data)
	{
		int h=1;
		while(h<=data.length/3)
			h=h*3+1;
		while(h>0)
		{
			for(int i=h;i<data.length;i+=h)
			{
				if(data[i]<data[i-h])
				{
					int temp=data[i];	
					int j=i-h;
					while(j>=0&&data[j]>temp)
					{
						data[j+h]=data[j];
						j-=h;
					}
					data[j+h]=temp;
				}
			}
			h=(h-1)/3;
		}
		return data;
	}
	public static void main(String[] args)
	{
		SortUtil s=new SortUtil();
		int[] a=new int[]{4,6,8,2,0,3,67,45,12};
		a=s.sort(a);
		for(int i:a)
		{
			System.out.print(i+" ");
		}
	}
}
