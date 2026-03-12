package capstoneCS2334;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedList {
    public static final int[] LIST_SIZES = {10000, 50000, 100000, 300000, 500000};
    public static LinkedHashMap<String, ArrayList<Double>> mapOfTests = new LinkedHashMap<>();
    
    public static final int NUMBER_OF_TRIALS = 10;
	public static final int AMOUNT_TO_EDIT = 100;
    
	public static void main(String[] args) {
		testRunner("MyString", "String");
		testRunner(0.0, "Double");
		
		ArrayList<String> titles = new ArrayList<>();
		ArrayList<ArrayList<Double>> dataLists = new ArrayList<>();
		
		for (Map.Entry<String, ArrayList<Double>> entry : mapOfTests.entrySet()) {
		    String key = entry.getKey();
		    titles.add(key);
		}
		
		for (int count = 0; count < NUMBER_OF_TRIALS + 1; count++) {
			ArrayList<Double> dataList = new ArrayList<>();
			for (Map.Entry<String, ArrayList<Double>> entry : mapOfTests.entrySet()) {
			    ArrayList<Double> values = entry.getValue();
			    dataList.add(values.get(count));
			}
			dataLists.add(dataList);
		}
		
		int dataColumns = titles.size();
		
		File file = new File("results.csv");
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
			for (int index = 0; index < dataColumns; index++) {
				System.out.println(titles.get(index));
				writer.write(titles.get(index));
				if (index + 1 >= dataColumns) {continue;}
				writer.write(",");
			}
			writer.newLine();
			
			for (int count = 0; count < NUMBER_OF_TRIALS + 1; count++) {
				ArrayList<Double> dataList = dataLists.get(count);
				for (int index = 0; index < dataColumns; index++) {
					System.out.println(dataList.get(index));
					writer.write(String.valueOf(dataList.get(index)));
					if (index + 1 >= dataColumns) {continue;}
					writer.write(",");
				}
				if (count >= NUMBER_OF_TRIALS) {continue;}
				writer.newLine();
			}
			writer.close();
	    } catch (IOException e) {
	    }
    }
    
    public static <T> void testRunner(T listValue, String listType) {
    	double timeMarker;
    	for (int listSize : LIST_SIZES) {
    		CustomLinkedList<T> customList = new CustomLinkedList<>();
    		for (int count = 0; count < listSize; count++) {
    			customList.add(listValue);
        	}
    		
    		ArrayList<Double> addBeginningOfList = new ArrayList<>();
    		ArrayList<Double> addMiddleOfList = new ArrayList<>();
    		ArrayList<Double> addEndOfList = new ArrayList<>();
    		ArrayList<Double> removeBeginningOfList = new ArrayList<>();
    		ArrayList<Double> removeMiddleOfList = new ArrayList<>();
    		ArrayList<Double> removeEndOfList = new ArrayList<>();
    		ArrayList<Double> randomAccessList = new ArrayList<>();
    		ArrayList<Double> sequentialAccessList = new ArrayList<>();
    		
    		for (int trial = 0; trial < NUMBER_OF_TRIALS; trial++) {
    			// add and remove from beginning of list
    			timeMarker = System.nanoTime();
    	    	for (int count = 0; count < AMOUNT_TO_EDIT; count++) {
    	    		customList.insert(0, listValue);
    	    	}
    	    	timeMarker = System.nanoTime() - timeMarker;
    	    	addBeginningOfList.add(timeMarker);
    	    	
    	    	for (int count = 0; count < AMOUNT_TO_EDIT; count++) {
    	    		customList.remove(0);
    	    	}
    	    	timeMarker = System.nanoTime();
    	    	for (int count = 0; count < AMOUNT_TO_EDIT; count++) {
    	    		customList.remove(0);
    	    	}
    	    	timeMarker = System.nanoTime() - timeMarker;
    	    	removeBeginningOfList.add(timeMarker);
    	    	
    	    	// add and remove from middle of list
    	    	for (int count = 0; count < AMOUNT_TO_EDIT; count++) {
    	    		customList.add(listValue);
    	    	}
    	    	int middleOfListIndex = customList.size() / 2;
    	    	timeMarker = System.nanoTime();
    	    	for (int count = 0; count < AMOUNT_TO_EDIT; count++) {
    	    		customList.insert(middleOfListIndex, listValue);
    	    	}
    	    	timeMarker = System.nanoTime() - timeMarker;
    	    	addMiddleOfList.add(timeMarker);
    	    	
    	    	for (int count = 0; count < AMOUNT_TO_EDIT; count++) {
    	    		customList.remove(0);
    	    	}
    	    	timeMarker = System.nanoTime();
    	    	for (int count = 0; count < AMOUNT_TO_EDIT; count++) {
    	    		customList.remove(middleOfListIndex);
    	    	}
    	    	timeMarker = System.nanoTime() - timeMarker;
    	    	removeMiddleOfList.add(timeMarker);
    	    	
    	    	// add and remove from end of list
    	    	for (int count = 0; count < AMOUNT_TO_EDIT; count++) {
    	    		customList.add(listValue);
    	    	}
    	    	int endOfListIndex = customList.size() - 100;
    	    	timeMarker = System.nanoTime();
    	    	for (int count = 0; count < AMOUNT_TO_EDIT; count++) {
    	    		customList.insert(customList.size(), listValue);
    	    	}
    	    	timeMarker = System.nanoTime() - timeMarker;
    	    	addEndOfList.add(timeMarker);
    	    	
    	    	for (int count = 0; count < AMOUNT_TO_EDIT; count++) {
    	    		customList.remove(0);
    	    	}
    	    	timeMarker = System.nanoTime();
    	    	for (int count = 0; count < AMOUNT_TO_EDIT; count++) {
    	    		customList.remove(endOfListIndex);
    	    	}
    	    	timeMarker = System.nanoTime() - timeMarker;
    	    	removeEndOfList.add(timeMarker);
    	    	
    	    	// reset the size
    	    	for (int count = 0; count < AMOUNT_TO_EDIT; count++) {
    	    		customList.add(listValue);
    	    	}
    	    	
    	    	// random access
    	    	int[] randomIndexList = new int[AMOUNT_TO_EDIT];
    	    	for (int index = 0; index < AMOUNT_TO_EDIT; index++) {
    	    		randomIndexList[index] = (int) (Math.random() * customList.size());
    	    	}
    	    	
    	    	timeMarker = System.nanoTime();
    	    	for (int index : randomIndexList) {
    	    		@SuppressWarnings("unused")
					T temp = customList.get(index);
    	    	}
    	    	timeMarker = System.nanoTime() - timeMarker;
    	    	randomAccessList.add(timeMarker);
    	    	
    	    	// sequential access
    	    	timeMarker = System.nanoTime();
    	    	for (int index = 0; index < AMOUNT_TO_EDIT; index++) {
    	    		@SuppressWarnings("unused")
					T temp = customList.get(index);
    	    	}
    	    	timeMarker = System.nanoTime() - timeMarker;
    	    	sequentialAccessList.add(timeMarker);
    		}
    		
    		addAverage(addBeginningOfList);
    		addAverage(addMiddleOfList);
    		addAverage(addEndOfList);
    		addAverage(removeBeginningOfList);
    		addAverage(removeMiddleOfList);
    		addAverage(removeEndOfList);
    		addAverage(randomAccessList);
    		addAverage(sequentialAccessList);
    		
    		mapOfTests.put("Add Beginning " + listType + " " + listSize, addBeginningOfList);
	    	mapOfTests.put("Add Middle " + listType + " " + listSize, addMiddleOfList);
	    	mapOfTests.put("Add End " + listType + " " + listSize, addEndOfList);
	    	mapOfTests.put("Remove Beginning " + listType + " " + listSize, removeBeginningOfList);
	    	mapOfTests.put("Remove Middle " + listType + " " + listSize, removeMiddleOfList);
	    	mapOfTests.put("Remove End " + listType + " " + listSize, removeEndOfList);
	    	mapOfTests.put("Random Access " + listType + " " + listSize, randomAccessList);
	    	mapOfTests.put("Sequential Access " + listType + " " + listSize, sequentialAccessList);
    	}
    }
    
    public static void addAverage(ArrayList<Double> list) {
    	double sum = 0;
		for (int index = 0; index < NUMBER_OF_TRIALS; index++) {
		    sum += list.get(index);
		}
		sum /= NUMBER_OF_TRIALS;
		list.add(sum);
    }
}
