package Activities;

public class Activity2 {
    public static void main(String args[]) {
        int[] array1 = {10, 77, 10, 54, -11, 10};

        int fnum = 10;
        int sum = 30;
        System.out.println("Answer is "+ answer(array1, fnum, sum));
    }

    public static boolean answer(int[] numbers, int fnum, int sum) {
        int tempsum = 0;
        for (int number : numbers) {
            if (number == fnum) {
                tempsum = tempsum + fnum;
            }
            if (tempsum > sum) {
                break;
            }
        }
        return tempsum == sum;
    }
}



