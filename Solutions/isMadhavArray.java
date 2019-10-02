public class isMadhavArray{
	public static void main(String[] args){
		int result = isMadhavArray(new int[]{2, 1, 1});
		System.out.println(result);
		result = isMadhavArray(new int[]{2, 1, 1, 4, -1, -1});
		System.out.println(result);
		result = isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0});
		System.out.println(result);
		result = isMadhavArray(new int[]{18, 9, 10, 6, 6, 6});
		System.out.println(result);
		result = isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4});
		System.out.println(result);
		result = isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1});
		System.out.println(result);
		result = isMadhavArray(new int[]{3, 1, 2, 3, 0});
		System.out.println(result);
	}
	
	//this is a more simple method using some mathematics to test if the length of the array can be wrriten as n(n+1)/2
	//and also by calculating the index of each alternation in the second for loop which is i*(i-1)/2
	    static int isMadhavArray(int[] a){
        double n = (Math.sqrt(8*a.length+1) - 1)/2;
        int isMadhav = 1;
        int isNotMadhav = 0;
        if (n != (int)n){
            return isNotMadhav;
        }
        int m = a[0];

        for (int i = 2 ; i <= n ; i++){
            int sum = 0;

            for (int j=0;j<i;j++){
                sum+=a[(i*(i-1)/2)+j];
            }
            if (sum != m){
                return isNotMadhav;
            }
        }

        return isMadhav;

    }
	

}
