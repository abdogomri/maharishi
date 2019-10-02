public class isInertial{
	public static void main(String[] args){
		int result = isInertial(new int[]{1});
		System.out.println(result);
		result = isInertial(new int[]{2});
		System.out.println(result);
		result = isInertial(new int[]{1, 2, 3, 4});
		System.out.println(result);
		result = isInertial(new int[]{1, 1, 1, 1, 1, 1, 2});
		System.out.println(result);
		result = isInertial(new int[]{2, 12, 4, 6, 8, 11});
		System.out.println(result);
		result = isInertial(new int[]{2, 12, 12, 4, 6, 8, 11});
		System.out.println(result);
		result = isInertial(new int[]{-2, -4, -6, -8, -11});
		System.out.println(result);
		result = isInertial(new int[]{2, 3, 5, 7});
		System.out.println(result);
		result = isInertial(new int[]{2, 4, 6, 8, 10});
		System.out.println(result);
	}
//much more simple method no need to creat new arrays
    static int isInertial(int[] a){
        int isInertial = 1;
        int isNotInertial = 0;

        if (a.length<=1){
            return isNotInertial;
        }
        int max = 0;
        int numberOfOddNumbers = 0;

        for (int i=0;i<a.length;i++){
            if (a[i]>max){
                max = a[i];
            }
        }

        for (int i=0;i<a.length;i++){
            if (a[i]%2!=0){
                numberOfOddNumbers++;
                for (int j=0;j<a.length;j++){
                        if (a[j]!=max && a[j] > a[i]){
                            return isNotInertial;
                        }
                }
            }
        }
        if (max%2 != 0 || numberOfOddNumbers == 0){
            return isNotInertial;
        }

        return isInertial;
    }
}
