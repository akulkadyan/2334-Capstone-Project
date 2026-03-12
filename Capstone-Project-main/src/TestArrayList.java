package capstoneCS2334;

import java.util.Random;

public class TestArrayList {
    public static void main(String[] args) {
        System.out.println("Initializing variables...");
        // 10k
        System.out.println("Initializing 10k Elements...");
        ArrayList<Double> tenKDoublesCI = addRandomDoublesCI(10000);
        java.util.ArrayList<Double> tenKDoublesJI = addRandomDoublesJI(10000);
        ArrayList<Integer> tenKIntegersCI = addRandomIntsCI(10000);
        java.util.ArrayList<Integer> tenKIntegersJI = addRandomIntsJI(10000);
        System.out.println("Done!");
        // 50k
        System.out.println("Initializing 50k Elements...");
        ArrayList<Double> fiftyKDoublesCI = addRandomDoublesCI(50000);
        java.util.ArrayList<Double> fiftyKDoublesJI = addRandomDoublesJI(50000);
        ArrayList<Integer> fiftyKIntegersCI = addRandomIntsCI(50000);
        java.util.ArrayList<Integer> fiftyKIntegersJI = addRandomIntsJI(50000);
        System.out.println("Done!");

        // 100k
        System.out.println("Initializing 100k Elements...");
        ArrayList<Double> hundredKDoublesCI = addRandomDoublesCI(100000);
        java.util.ArrayList<Double> hundredKDoublesJI = addRandomDoublesJI(100000);
        ArrayList<Integer> hundredKIntegersCI = addRandomIntsCI(100000);
        java.util.ArrayList<Integer> hundredKIntegersJI = addRandomIntsJI(100000);
        System.out.println("Done!");

        // 300k
        System.out.println("Initializing 300k Elements...");
        ArrayList<Double> threeHundredKDoublesCI = addRandomDoublesCI(300000);
        java.util.ArrayList<Double> threeHundredKDoublesJI = addRandomDoublesJI(300000);
        ArrayList<Integer> threeHundredKIntegersCI = addRandomIntsCI(300000);
        java.util.ArrayList<Integer> threeHundredKIntegersJI = addRandomIntsJI(300000);
        System.out.println("Done!");

        // 500k
        System.out.println("Initializing 500k Elements...");
        ArrayList<Double> fiveHundredKDoublesCI = addRandomDoublesCI(500000);
        java.util.ArrayList<Double> fiveHundredKDoublesJI = addRandomDoublesJI(500000);
        ArrayList<Integer> fiveHundredKIntegersCI = addRandomIntsCI(500000);
        java.util.ArrayList<Integer> fiveHundredKIntegersJI = addRandomIntsJI(500000);
        System.out.println("Done!");

        // sequential test
        System.out.println("Starting sequential test with dataset...");
        System.out.println("Testing 10k double elements...");
        testSeqDataCI(tenKDoublesCI, 10);
        testSeqDataJI(tenKDoublesJI, 10);
        System.out.println("Testing 10k integer elements...");
        testSeqDataCI(tenKIntegersCI, 10);
        testSeqDataJI(tenKIntegersJI, 10);
        System.out.println("----------------------------------------");
        System.out.println("Testing 50k double elements...");
        testSeqDataCI(fiftyKDoublesCI, 50);
        testSeqDataJI(fiftyKDoublesJI, 50);
        System.out.println("Testing 50k integer elements...");
        testSeqDataCI(fiftyKIntegersCI, 50);
        testSeqDataJI(fiftyKIntegersJI, 50);
        System.out.println("----------------------------------------");
        System.out.println("Testing 100k double elements...");
        testSeqDataCI(hundredKDoublesCI, 100);
        testSeqDataJI(hundredKDoublesJI, 100);
        System.out.println("Testing 100k integer elements...");
        testSeqDataCI(hundredKIntegersCI, 100);
        testSeqDataJI(hundredKIntegersJI, 100);
        System.out.println("----------------------------------------");
        System.out.println("Testing 300k double elements...");
        testSeqDataCI(threeHundredKDoublesCI, 300);
        testSeqDataJI(threeHundredKDoublesJI, 300);
        System.out.println("Testing 300k integer elements...");
        testSeqDataCI(threeHundredKIntegersCI, 300);
        testSeqDataJI(threeHundredKIntegersJI, 300);
        System.out.println("----------------------------------------");
        System.out.println("Testing 500k double elements...");
        testSeqDataCI(fiveHundredKDoublesCI, 500);
        testSeqDataJI(fiveHundredKDoublesJI, 500);
        System.out.println("Testing 500k integer elements...");
        testSeqDataCI(fiveHundredKIntegersCI, 500);
        testSeqDataJI(fiveHundredKIntegersJI, 500);

        // random access test
        System.out.println("----------------------------------------");
        System.out.println("Starting random access test with dataset...");
        System.out.println("Testing 10k double elements...");
        testRanDataCI(tenKDoublesCI, 10);
        testRanDataJI(tenKDoublesJI, 10);
        System.out.println("Testing 10k integer elements...");
        testRanDataCI(tenKIntegersCI, 10);
        testRanDataJI(tenKIntegersJI, 10);
        System.out.println("----------------------------------------");
        System.out.println("Testing 50k double elements...");
        testRanDataCI(fiftyKDoublesCI, 50);
        testRanDataJI(fiftyKDoublesJI, 50);
        System.out.println("Testing 50k integer elements...");
        testRanDataCI(fiftyKIntegersCI, 50);
        testRanDataJI(fiftyKIntegersJI, 50);
        System.out.println("----------------------------------------");
        System.out.println("Testing 100k double elements...");
        testRanDataCI(hundredKDoublesCI, 100);
        testRanDataJI(hundredKDoublesJI, 100);
        System.out.println("Testing 50k integer elements...");
        testRanDataCI(hundredKIntegersCI, 100);
        testRanDataJI(hundredKIntegersJI, 100);
        System.out.println("----------------------------------------");
        System.out.println("Testing 300k double elements...");
        testRanDataCI(threeHundredKDoublesCI, 300);
        testRanDataJI(threeHundredKDoublesJI, 300);
        System.out.println("Testing 300k integer elements...");
        testRanDataCI(threeHundredKIntegersCI, 300);
        testRanDataJI(threeHundredKIntegersJI, 300);
        System.out.println("----------------------------------------");
        System.out.println("Testing 500k double elements...");
        testRanDataCI(fiveHundredKDoublesCI, 500);
        testRanDataJI(fiveHundredKDoublesJI, 500);
        System.out.println("Testing 500k integer elements...");
        testRanDataCI(fiveHundredKIntegersCI, 500);
        testRanDataJI(fiveHundredKIntegersJI, 500);
        System.out.println("----------------------------------------");
        System.out.println("Starting insertion test for beginning...");
        int index = 0;
        System.out.println("Testing 10k double elements...");
        testInsertDataDoubleCI(tenKDoublesCI, 10, index);
        testInsertDataDoubleJI(tenKDoublesJI, 10, index);
        System.out.println("Testing 10k integer elements...");
        testInsertDataIntCI(tenKIntegersCI, 10, index);
        testInsertDataIntJI(tenKIntegersJI, 10, index);
        System.out.println("----------------------------------------");
        System.out.println("Testing 50k double elements...");
        testInsertDataDoubleCI(fiftyKDoublesCI, 50, index);
        testInsertDataDoubleJI(fiftyKDoublesJI, 50, index);
        System.out.println("Testing 50k integer elements...");
        testInsertDataIntCI(fiftyKIntegersCI, 50, index);
        testInsertDataIntJI(fiftyKIntegersJI, 50, index);
        System.out.println("----------------------------------------");
        System.out.println("Testing 100k double elements...");
        testInsertDataDoubleCI(hundredKDoublesCI, 100, index);
        testInsertDataDoubleJI(hundredKDoublesJI, 100, index);
        System.out.println("Testing 100k integer elements...");
        testInsertDataIntCI(hundredKIntegersCI, 100, index);
        testInsertDataIntJI(hundredKIntegersJI, 100, index);
        System.out.println("----------------------------------------");
        System.out.println("Testing 300k double elements...");
        testInsertDataDoubleCI(threeHundredKDoublesCI, 300, index);
        testInsertDataDoubleJI(threeHundredKDoublesJI, 300, index);
        System.out.println("Testing 300k integer elements...");
        testInsertDataIntCI(threeHundredKIntegersCI, 300, index);
        testInsertDataIntJI(threeHundredKIntegersJI, 300, index);
        System.out.println("----------------------------------------");
        System.out.println("Testing 500k double elements...");
        testInsertDataDoubleCI(fiveHundredKDoublesCI, 500, index);
        testInsertDataDoubleJI(fiveHundredKDoublesJI, 500, index);
        System.out.println("Testing 500k integer elements...");
        testInsertDataIntCI(fiveHundredKIntegersCI, 500, index);
        testInsertDataIntJI(fiveHundredKIntegersJI, 500, index);
        System.out.println("----------------------------------------");
        System.out.println("Testing insertion test for middle...");
        index = 5000;
        System.out.println("Testing 10k double elements...");
        testInsertDataDoubleCI(tenKDoublesCI, 10, index);
        testInsertDataDoubleJI(tenKDoublesJI, 10, index);
        System.out.println("Testing 10k integer elements...");
        testInsertDataIntCI(tenKIntegersCI, 10, index);
        testInsertDataIntJI(tenKIntegersJI, 10, index);
        System.out.println("----------------------------------------");
        index = 25000;
        System.out.println("Testing 50k double elements...");
        testInsertDataDoubleCI(fiftyKDoublesCI, 50, index);
        testInsertDataDoubleJI(fiftyKDoublesJI, 50, index);
        System.out.println("Testing 50k integer elements...");
        testInsertDataIntCI(fiftyKIntegersCI, 50, index);
        testInsertDataIntJI(fiftyKIntegersJI, 50, index);
        System.out.println("----------------------------------------");
        index = 50000;
        System.out.println("Testing 100k double elements...");
        testInsertDataDoubleCI(hundredKDoublesCI, 100, index);
        testInsertDataDoubleJI(hundredKDoublesJI, 100, index);
        System.out.println("Testing 100k integer elements...");
        testInsertDataIntCI(hundredKIntegersCI, 100, index);
        testInsertDataIntJI(hundredKIntegersJI, 100, index);
        System.out.println("----------------------------------------");
        index = 150000;
        System.out.println("Testing 300k double elements...");
        testInsertDataDoubleCI(threeHundredKDoublesCI, 300, index);
        testInsertDataDoubleJI(threeHundredKDoublesJI, 300, index);
        System.out.println("Testing 300k integer elements...");
        testInsertDataIntCI(threeHundredKIntegersCI, 300, index);
        testInsertDataIntJI(threeHundredKIntegersJI, 300, index);
        System.out.println("----------------------------------------");
        index = 250000;
        System.out.println("Testing 500k double elements...");
        testInsertDataDoubleCI(fiveHundredKDoublesCI, 500, index);
        testInsertDataDoubleJI(fiveHundredKDoublesJI, 500, index);
        System.out.println("Testing 500k integer elements...");
        testInsertDataIntCI(fiveHundredKIntegersCI, 500, index);
        testInsertDataIntJI(fiveHundredKIntegersJI, 500, index);
        System.out.println("----------------------------------------");
        System.out.println("Testing insertion test for end");
        index = 9999;
        System.out.println("Testing 10k double elements...");
        testInsertDataDoubleCI(tenKDoublesCI, 10, index);
        testInsertDataDoubleJI(tenKDoublesJI, 10, index);
        System.out.println("Testing 10k integer elements...");
        testInsertDataIntCI(tenKIntegersCI, 10, index);
        testInsertDataIntJI(tenKIntegersJI, 10, index);
        System.out.println("----------------------------------------");
        index = 49999;
        System.out.println("Testing 50k double elements...");
        testInsertDataDoubleCI(fiftyKDoublesCI, 50, index);
        testInsertDataDoubleJI(fiftyKDoublesJI, 50, index);
        System.out.println("Testing 50k integer elements...");
        testInsertDataIntCI(fiftyKIntegersCI, 50, index);
        testInsertDataIntJI(fiftyKIntegersJI, 50, index);
        System.out.println("----------------------------------------");
        index = 99999;
        System.out.println("Testing 100k double elements...");
        testInsertDataDoubleCI(hundredKDoublesCI, 100, index);
        testInsertDataDoubleJI(hundredKDoublesJI, 100, index);
        System.out.println("Testing 100k integer elements...");
        testInsertDataIntCI(hundredKIntegersCI, 100, index);
        testInsertDataIntJI(hundredKIntegersJI, 100, index);
        System.out.println("----------------------------------------");
        index = 299999;
        System.out.println("Testing 300k double elements...");
        testInsertDataDoubleCI(threeHundredKDoublesCI, 300, index);
        testInsertDataDoubleJI(threeHundredKDoublesJI, 300, index);
        System.out.println("Testing 300k integer elements...");
        testInsertDataIntCI(threeHundredKIntegersCI, 300, index);
        testInsertDataIntJI(threeHundredKIntegersJI, 300, index);
        System.out.println("----------------------------------------");
        index = 499999;
        System.out.println("Testing 500k double elements...");
        testInsertDataDoubleCI(fiveHundredKDoublesCI, 500, index);
        testInsertDataDoubleJI(fiveHundredKDoublesJI, 500, index);
        System.out.println("Testing 500k integer elements...");
        testInsertDataIntCI(fiveHundredKIntegersCI, 500, index);
        testInsertDataIntJI(fiveHundredKIntegersJI, 500, index);
        System.out.println("----------------------------------------");


        // removal tests
        System.out.println("Starting removal test for beginning...");
        index = 0;
        System.out.println("Testing 10k double elements...");
        testRemoveDataDoubleCI(tenKDoublesCI, 10, index);
        testRemoveDataDoubleJI(tenKDoublesJI, 10, index);
        System.out.println("Testing 10k integer elements...");
        testRemoveDataIntCI(tenKIntegersCI, 10, index);
        testRemoveDataIntJI(tenKIntegersJI, 10, index);
        System.out.println("----------------------------------------");
        System.out.println("Testing 50k double elements...");
        testRemoveDataDoubleCI(fiftyKDoublesCI, 50, index);
        testRemoveDataDoubleJI(fiftyKDoublesJI, 50, index);
        System.out.println("Testing 50k integer elements...");
        testRemoveDataIntCI(fiftyKIntegersCI, 50, index);
        testRemoveDataIntJI(fiftyKIntegersJI, 50, index);
        System.out.println("----------------------------------------");
        System.out.println("Testing 100k double elements...");
        testRemoveDataDoubleCI(hundredKDoublesCI, 100, index);
        testRemoveDataDoubleJI(hundredKDoublesJI, 100, index);
        System.out.println("Testing 100k integer elements...");
        testRemoveDataIntCI(hundredKIntegersCI, 100, index);
        testRemoveDataIntJI(hundredKIntegersJI, 100, index);
        System.out.println("----------------------------------------");
        System.out.println("Testing 300k double elements...");
        testRemoveDataDoubleCI(threeHundredKDoublesCI, 300, index);
        testRemoveDataDoubleJI(threeHundredKDoublesJI, 300, index);
        System.out.println("Testing 300k integer elements...");
        testRemoveDataIntCI(threeHundredKIntegersCI, 300, index);
        testRemoveDataIntJI(threeHundredKIntegersJI, 300, index);
        System.out.println("----------------------------------------");
        System.out.println("Testing 500k double elements...");
        testRemoveDataDoubleCI(fiveHundredKDoublesCI, 500, index);
        testRemoveDataDoubleJI(fiveHundredKDoublesJI, 500, index);
        System.out.println("Testing 500k integer elements...");
        testRemoveDataIntCI(fiveHundredKIntegersCI, 500, index);
        testRemoveDataIntJI(fiveHundredKIntegersJI, 500, index);
        System.out.println("----------------------------------------");

        System.out.println("Testing removal test for middle...");
        index = 5000;
        System.out.println("Testing 10k double elements...");
        testRemoveDataDoubleCI(tenKDoublesCI, 10, index);
        testRemoveDataDoubleJI(tenKDoublesJI, 10, index);
        System.out.println("Testing 10k integer elements...");
        testRemoveDataIntCI(tenKIntegersCI, 10, index);
        testRemoveDataIntJI(tenKIntegersJI, 10, index);
        System.out.println("----------------------------------------");
        index = 25000;
        System.out.println("Testing 50k double elements...");
        testRemoveDataDoubleCI(fiftyKDoublesCI, 50, index);
        testRemoveDataDoubleJI(fiftyKDoublesJI, 50, index);
        System.out.println("Testing 50k integer elements...");
        testRemoveDataIntCI(fiftyKIntegersCI, 50, index);
        testRemoveDataIntJI(fiftyKIntegersJI, 50, index);
        System.out.println("----------------------------------------");
        index = 50000;
        System.out.println("Testing 100k double elements...");
        testRemoveDataDoubleCI(hundredKDoublesCI, 100, index);
        testRemoveDataDoubleJI(hundredKDoublesJI, 100, index);
        System.out.println("Testing 100k integer elements...");
        testRemoveDataIntCI(hundredKIntegersCI, 100, index);
        testRemoveDataIntJI(hundredKIntegersJI, 100, index);
        System.out.println("----------------------------------------");
        index = 150000;
        System.out.println("Testing 300k double elements...");
        testRemoveDataDoubleCI(threeHundredKDoublesCI, 300, index);
        testRemoveDataDoubleJI(threeHundredKDoublesJI, 300, index);
        System.out.println("Testing 300k integer elements...");
        testRemoveDataIntCI(threeHundredKIntegersCI, 300, index);
        testRemoveDataIntJI(threeHundredKIntegersJI, 300, index);
        System.out.println("----------------------------------------");
        index = 250000;
        System.out.println("Testing 500k double elements...");
        testRemoveDataDoubleCI(fiveHundredKDoublesCI, 500, index);
        testRemoveDataDoubleJI(fiveHundredKDoublesJI, 500, index);
        System.out.println("Testing 500k integer elements...");
        testRemoveDataIntCI(fiveHundredKIntegersCI, 500, index);
        testRemoveDataIntJI(fiveHundredKIntegersJI, 500, index);
        System.out.println("----------------------------------------");

        System.out.println("Testing removal test for end");
        index = Integer.MAX_VALUE;
        System.out.println("Testing 10k double elements...");
        testRemoveDataDoubleCI(tenKDoublesCI, 10, index);
        testRemoveDataDoubleJI(tenKDoublesJI, 10, index);
        System.out.println("Testing 10k integer elements...");
        testRemoveDataIntCI(tenKIntegersCI, 10, index);
        testRemoveDataIntJI(tenKIntegersJI, 10, index);
        System.out.println("----------------------------------------");
        System.out.println("Testing 50k double elements...");
        testRemoveDataDoubleCI(fiftyKDoublesCI, 50, index);
        testRemoveDataDoubleJI(fiftyKDoublesJI, 50, index);
        System.out.println("Testing 50k integer elements...");
        testRemoveDataIntCI(fiftyKIntegersCI, 50, index);
        testRemoveDataIntJI(fiftyKIntegersJI, 50, index);
        System.out.println("----------------------------------------");
        System.out.println("Testing 100k double elements...");
        testRemoveDataDoubleCI(hundredKDoublesCI, 100, index);
        testRemoveDataDoubleJI(hundredKDoublesJI, 100, index);
        System.out.println("Testing 100k integer elements...");
        testRemoveDataIntCI(hundredKIntegersCI, 100, index);
        testRemoveDataIntJI(hundredKIntegersJI, 100, index);
        System.out.println("----------------------------------------");
        System.out.println("Testing 300k double elements...");
        testRemoveDataDoubleCI(threeHundredKDoublesCI, 300, index);
        testRemoveDataDoubleJI(threeHundredKDoublesJI, 300, index);
        System.out.println("Testing 300k integer elements...");
        testRemoveDataIntCI(threeHundredKIntegersCI, 300, index);
        testRemoveDataIntJI(threeHundredKIntegersJI, 300, index);
        System.out.println("----------------------------------------");
        System.out.println("Testing 500k double elements...");
        testRemoveDataDoubleCI(fiveHundredKDoublesCI, 500, index);
        testRemoveDataDoubleJI(fiveHundredKDoublesJI, 500, index);
        System.out.println("Testing 500k integer elements...");
        testRemoveDataIntCI(fiveHundredKIntegersCI, 500, index);
        testRemoveDataIntJI(fiveHundredKIntegersJI, 500, index);
        System.out.println("----------------------------------------");
        System.out.println("Testing complete! Have a nice day.");
    }

    public static void testRemoveDataDoubleCI(ArrayList<Double> data, int count, int index) {
        Long[] testInsertDataTimes = new Long[10];
        for(int i = 0; i < 10; i++) {
            testInsertDataTimes[i] = removalTestCI(data, index);
        }
        int sumOfTimes = 0;
        for(Long testTime : testInsertDataTimes) {
            sumOfTimes += testTime;
        }
        long averageTime = sumOfTimes / testInsertDataTimes.length;
        System.out.println("Average time taken for " + count + "k elements with custom implementation: " + averageTime + " nanoseconds.");
    }

    public static void testRemoveDataIntCI(ArrayList<Integer> data, int count, int index) {
        Long[] testInsertDataTimes = new Long[10];
        for(int i = 0; i < 10; i++) {
            testInsertDataTimes[i] = removalTestCI(data, index);
        }
        int sumOfTimes = 0;
        for(Long testTime : testInsertDataTimes) {
            sumOfTimes += testTime;
        }
        long averageTime = sumOfTimes / testInsertDataTimes.length;
        System.out.println("Average time taken for " + count + "k elements with custom implementation: " + averageTime + " nanoseconds.");
    }

    public static void testRemoveDataDoubleJI(java.util.ArrayList<Double> data, int count, int index) {
        Long[] testInsertDataTimes = new Long[10];
        for(int i = 0; i < 10; i++) {
            testInsertDataTimes[i] = removalTestJI(data, index);
        }
        int sumOfTimes = 0;
        for(Long testTime : testInsertDataTimes) {
            sumOfTimes += testTime;
        }
        long averageTime = sumOfTimes / testInsertDataTimes.length;
        System.out.println("Average time taken for " + count + "k elements with custom implementation: " + averageTime + " nanoseconds.");
    }

    public static void testRemoveDataIntJI(java.util.ArrayList<Integer> data, int count, int index) {
        Long[] testInsertDataTimes = new Long[10];
        for(int i = 0; i < 10; i++) {
            testInsertDataTimes[i] = removalTestJI(data, index);
        }
        int sumOfTimes = 0;
        for(Long testTime : testInsertDataTimes) {
            sumOfTimes += testTime;
        }
        long averageTime = sumOfTimes / testInsertDataTimes.length;
        System.out.println("Average time taken for " + count + "k elements with custom implementation: " + averageTime + " nanoseconds.");
    }

    public static void testInsertDataDoubleCI(ArrayList<Double> data, int count, int index) {
        Long[] testInsertDataTimes = new Long[10];
        for(int i = 0; i < 10; i++) {
            testInsertDataTimes[i] = insertionTestCI(data, index, 2.0);
        }
        int sumOfTimes = 0;
        for(Long testTime : testInsertDataTimes) {
            sumOfTimes += testTime;
        }
        long averageTime = sumOfTimes / testInsertDataTimes.length;
        System.out.println("Average time taken for " + count + "k elements with custom implementation: " + averageTime + " nanoseconds.");
    }

    public static void testInsertDataIntCI(ArrayList<Integer> data, int count, int index) {
        Long[] testInsertDataTimes = new Long[10];
        for(int i = 0; i < 10; i++) {
            testInsertDataTimes[i] = insertionTestCI(data, index, 5);
        }
        int sumOfTimes = 0;
        for(Long testTime : testInsertDataTimes) {
            sumOfTimes += testTime;
        }
        long averageTime = sumOfTimes / testInsertDataTimes.length;
        System.out.println("Average time taken for " + count + "k elements with custom implementation: " + averageTime + " nanoseconds.");
    }

    public static void testInsertDataDoubleJI(java.util.ArrayList<Double> data, int count, int index) {
        Long[] testInsertDataTimes = new Long[10];
        for(int i = 0; i < 10; i++) {
            testInsertDataTimes[i] = insertionTestJI(data, index, 2.0);
        }
        int sumOfTimes = 0;
        for(Long testTime : testInsertDataTimes) {
            sumOfTimes += testTime;
        }
        long averageTime = sumOfTimes / testInsertDataTimes.length;
        System.out.println("Average time taken for " + count + "k elements with custom implementation: " + averageTime + " nanoseconds.");
    }

    public static void testInsertDataIntJI(java.util.ArrayList<Integer> data, int count, int index) {
        Long[] testInsertDataTimes = new Long[10];
        for(int i = 0; i < 10; i++) {
            testInsertDataTimes[i] = insertionTestJI(data, index, 5);
        }
        int sumOfTimes = 0;
        for(Long testTime : testInsertDataTimes) {
            sumOfTimes += testTime;
        }
        long averageTime = sumOfTimes / testInsertDataTimes.length;
        System.out.println("Average time taken for " + count + "k elements with custom implementation: " + averageTime + " nanoseconds.");
    }

    public static <T> void testSeqDataCI(ArrayList<T> data, int count) {
        Long[] testSeqIntTimes = new Long[10];
        for(int i = 0; i < 10; i++) {
            testSeqIntTimes[i] = seqAccessTestCI(data);
        }
        int sumOfTimes = 0;
        for(Long testTime : testSeqIntTimes) {
            sumOfTimes += testTime;
        }
        long averageTime = sumOfTimes / testSeqIntTimes.length;
        System.out.println("Average time taken for " + count + "k elements with custom implementation: " + averageTime + " nanoseconds.");
    }

    public static <T> void testSeqDataJI(java.util.ArrayList<T> data, int count) {
        Long[] testSeqIntTimes = new Long[10];
        for(int i = 0; i < 10; i++) {
            testSeqIntTimes[i] = seqAccessTestJI(data);
        }
        int sumOfTimes = 0;
        for(Long testTime : testSeqIntTimes) {
            sumOfTimes += testTime;
        }
        long averageTime = sumOfTimes / testSeqIntTimes.length;
        System.out.println("Average time taken for " + count + "k elements with java implementation: " + averageTime + " nanoseconds.");
    }

    public static <T> void testRanDataCI(ArrayList<T> data, int count) {
        Long[] testRanDataTimes = new Long[10];
        for(int i = 0; i < 10; i++) {
            testRanDataTimes[i] = ranAccessTestCI(data);
        }
        int sumOfTimes = 0;
        for(Long testTime : testRanDataTimes) {
            sumOfTimes += testTime;
        }
        long averageTime = sumOfTimes / testRanDataTimes.length;
        System.out.println("Average time taken for " + count + "k elements with custom implementation: " + averageTime + " nanoseconds.");
    }

    public static <T> void testRanDataJI(java.util.ArrayList<T> data, int count) {
        Long[] testRanDataTimes = new Long[10];
        for(int i = 0; i < 10; i++) {
            testRanDataTimes[i] = ranAccessTestJI(data);
        }
        int sumOfTimes = 0;
        for(Long testTime : testRanDataTimes) {
            sumOfTimes += testTime;
        }
        long averageTime = sumOfTimes / testRanDataTimes.length;
        System.out.println("Average time taken for " + count + "k elements with java implementation: " + averageTime + " nanoseconds.");
    }

    /*
    METHOD IMPLEMENTATION FOR TESTS
     */
    // custom implementation
    public static <T> long seqAccessTestCI(ArrayList<T> data) {
        long startTime = System.nanoTime();
        for(int i = 0; i < data.size(); i++) {
            data.get(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    // java implementation
    public static <T> long seqAccessTestJI(java.util.ArrayList<T> data) {
        long startTime = System.nanoTime();
        for(int i = 0; i < data.size(); i++) {
            data.get(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // custom implementation
    public static <T> long ranAccessTestCI(ArrayList<T> data) {
        long startTime = System.nanoTime();
        for(int i = 0; i < 101; i++) {
            Random random = new Random();
            int randomSelectedInt = random.nextInt(data.size());
            data.get(randomSelectedInt);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    // java implementation
    public static <T> long ranAccessTestJI(java.util.ArrayList<T> data) {
        long startTime = System.nanoTime();
        for(int i = 0; i < 101; i++) {
            Random random = new Random();
            int randomSelectedInt = random.nextInt(data.size());
            data.get(randomSelectedInt);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // custom implementation
    public static <T> long insertionTestCI(ArrayList<T> data, int index, T insertionData) {
        long startTime = System.nanoTime();
        data.add(index, insertionData);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    // java implementation
    public static <T> long insertionTestJI(java.util.ArrayList<T> data, int index, T insertionData) {
        long startTime = System.nanoTime();
        data.add(index, insertionData);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // custom implementation
    public static <T> long removalTestCI(ArrayList<T> data, int index) {

        if (index >= data.size()) {
            index = data.size() - 1;
        }

        long startTime = System.nanoTime();
        data.remove(index);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    // java implementation
    public static <T> long removalTestJI(java.util.ArrayList<T> data, int index) {
        if (index >= data.size()) {
            index = data.size() - 1;
        }
        long startTime = System.nanoTime();
        data.remove(index);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static ArrayList<Double> addRandomDoublesCI(int numberOfElements) {
                ArrayList<Double> newArrayList = new ArrayList<>();
                for(int i = 0; i < numberOfElements; i++) {
                    Random random = new Random();
                    newArrayList.add(random.nextDouble());
                }
                return newArrayList;
    }

    public static ArrayList<Integer> addRandomIntsCI(int numberOfElements) {
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for(int i = 0; i < numberOfElements; i++) {
            Random random = new Random();
            newArrayList.add(random.nextInt());
        }
        return newArrayList;
    }

    public static java.util.ArrayList<Double> addRandomDoublesJI(int numberOfElements) {
        java.util.ArrayList<Double> newArrayList = new java.util.ArrayList<>();
        for(int i = 0; i < numberOfElements; i++) {
            Random random = new Random();
            newArrayList.add(random.nextDouble());
        }
        return newArrayList;
    }

    public static java.util.ArrayList<Integer> addRandomIntsJI(int numberOfElements) {
        java.util.ArrayList<Integer> newArrayList = new java.util.ArrayList<>();
        for(int i = 0; i < numberOfElements; i++) {
            Random random = new Random();
            newArrayList.add(random.nextInt());
        }
        return newArrayList;
    }
}
