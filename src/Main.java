import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    static int min(int[] minArray){
        int min = minArray[0];
        for(int i = 1; i < minArray.length; i++){
            if(min > minArray[i]){
                min = minArray[i];
            }
        }
        return min;
    }
    static int max(int[] maxArray){
        int max = maxArray[0];
        for(int i = 1; i < maxArray.length; i++){
            if(max < maxArray[i]){
                max = maxArray[i];
            }
        }
        return max;
    }
    static double average(int[] averageArray){
        double average = 0;
        for(int i = 0; i < averageArray.length; i++){
            average += averageArray[i];
        }
        return average/averageArray.length;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] unlockingCode = {8, 8, 6, 8, 3, 1};
        int[] lockingCode = {8, 8, 6, 8, 3, 4};
        Random rand = new Random();
        boolean locked = true;
        boolean unlocked = false;
        int unlockedCount = 0;
        int lockedCount = 0;
        int count = 0;
        ArrayList<Integer> code = new ArrayList<Integer>();
        int runTimes;

        System.out.println("How many times would you like to run the program?");
        runTimes = scan.nextInt();
        int[] Array = new int[runTimes];

        for(int i = 0; i < runTimes; i++){
            locked = true;
            while (locked) {
                int int_random = rand.nextInt(10);
                count += 1;

                if (int_random == unlockingCode[unlockedCount]) {
                    code.add(int_random);
                    if (unlockedCount == 5) {
                        System.out.println("Unlocked!");
                        System.out.println("Numbers generated: " + count);
                        Array[i] = count;
                        locked = false;
                    } else {
                        unlockedCount += 1;
                    }
                } else {
                    unlockedCount = 0;
                    code.clear();
                }
                if (int_random == lockingCode[lockedCount]) {
                    if (lockedCount == 5) {
                        System.out.println("Locked!");
                    } else {
                        lockedCount += 1;
                    }
                } else {
                    lockedCount = 0;
                }
                System.out.println(code.toString()); //comment this out if you dont want to see the random numbers generate
            }
            System.out.println("Program ran " + runTimes + " times.");
            System.out.println("Minimum symbols used out of each run to unlock: " + min(Array));
            System.out.println("Maximum symbols used out of each run to unlock: " + max(Array));
            System.out.println("The average amount of symbols used out of each run to unlock: " + average(Array));
        }
    }
}