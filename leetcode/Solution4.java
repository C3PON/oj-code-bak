class Solution4 {
    public double findMedianSortedArrays(int[] args1, int[] args2) {
        int[] result = new int[args1.length+args2.length];
		
		int i=0,j=0,k=0;
		while(i<args1.length&&j<args2.length){
			if(args1[i]<args2[j]){
				result[k]=args1[i];
				i++;
			}else{
				result[k]=args2[j];
				j++;
			}
			
			k++;
		}
		if(i==args1.length){
			while(j<args2.length){
				result[k]=args2[j];
				j++;
				k++;
			}
		}
		if(j==args2.length){
			while(i<args1.length){
				result[k]=args1[i];
				i++;
				k++;
			}
		}
		System.out.println(result[(args1.length+args2.length)/2]);
		System.out.println(result[(args1.length+args2.length-1)/2]);
		double median = (result[(args1.length+args2.length)/2]+result[(args1.length+args2.length-1)/2])/(double)2;
		return median;
    }
}
