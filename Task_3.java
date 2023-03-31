public class Task_3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if(primeNumber(i)){
                System.out.println(i);
            }
        }  
    }

    static boolean primeNumber(int number){
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        if (number == 1) {
            return false;
        }
        return true;
    }
}