package FindingNumberOfIteration;

public class Main {
	public static void main(String[]args) {
		int[]list= {10, 20, 20, 10, 10, 20, 5, 20};
		int[]temp=new int[list.length];
		for(int i=0;i<list.length;i++) {
			int x=0;
			if(!isFind(temp,list[i])) {
			for(int a=0;a<list.length;a++) {
				
					
					if(list[a]==list[i]) {
						x++;
					}
					
				
					
			}
				
			}
			if(x>0) {
				System.out.println("There are "+x+" numbers "+list[i]);
			}
			
			temp[i]=list[i];
			
		}
		
	}
	public static boolean isFind(int[]arr,int number) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==number) {
				return true;
			}
			
		}
		return false;
	}

}
