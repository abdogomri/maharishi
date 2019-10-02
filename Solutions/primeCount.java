public class primeCount{
	public static void main(String[] args){
		int result = primeCount(10, 30);
		System.out.println(result);
		result = primeCount(11, 29);
		System.out.println(result);
		result = primeCount(20, 22);
		System.out.println(result);
		result = primeCount(1, 1);
		System.out.println(result);
		result = primeCount(5, 5);
		System.out.println(result);
		result = primeCount(6, 2);
		System.out.println(result);
		result = primeCount(-10, 6);
		System.out.println(result);
	}

	static int primeCount(int start, int end) {

        int primeCount = 0;
        if (start > end) {
            return primeCount;
        }

        if (start < 0) {
            if (end < 0) {
                return 0;
            } else {
                start = 0;
            }
        }


        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }
        return primeCount;
    }

    static boolean isPrime(int n) {
        if (n == 0 || n == 1){
            return false;
        }
        int primeRoot = (int) Math.sqrt(n);

        if (primeRoot == Math.sqrt(n)){
            return false;
        }
        for (int i = 2; i <= primeRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
