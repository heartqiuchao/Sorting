package qiuchao;

public class ShellSort {
	public int[] sort(int[] data)
	{
		int h = 1;  
        while (h <= data.length / 3) {  
            h = h * 3 + 1;  
        }  
        System.out.println("h="+h);
        while (h > 0) {  
            for (int i = h; i < data.length; i += h) {  
                if (data[i] < data[i - h]) {  
                    int tmp = data[i];  
                    int j = i - h;  
                    while (j >= 0 && data[j] > tmp) {  
                        data[j + h] = data[j];  
                        j -= h;  
                    }  
                    data[j + h] = tmp;  
                    print(data);  
                }  
            } 
            // 计算出下一个h值  
            h = (h - 1) / 3;  
           
        }  
        return data;
	}
	public static void print(int[] data) {  
        for (int i = 0; i < data.length; i++) {  
            System.out.print(data[i] + "\t");  
        }  
        System.out.println();  
    }  
	public static void main(String[] args) {
		ShellSort SS=new ShellSort();
		int[] arr=new int[]{6,17,4,18,32,76,2,11,10,5,16,9};
		arr=SS.sort(arr);
		System.out.println("after shellSort:");
		for(int i:arr)
			System.out.print(i+"\t");

	}

}
