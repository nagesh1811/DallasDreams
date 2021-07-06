package ind.bos.atl;


public class BubbleSort {
	
	public static void main(String[] args) {
		int[] tickets = {8,9,2,5,4,3,7,1};
		sort(tickets);
		
	}
	
	public static void sort(int []list) {
		for(int i=0;i<=list.length-1;i++) {
			for(int j=i;j<=list.length-1;j++) {
					if(list[i]>list[j]) {
						int temp = list[i];
						list[i] = list[j];
						list[j] = temp;
					}
			}
		}
		
		print(list);
		
	}
	
	public static void print(int []list) {
		for(int i=0;i<=list.length-1;i++) {
			System.out.print("\t"+list[i]);
		}
	}

}
