import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeWork5 {
    public static void main(String[] args) {
        Integer[] dataset = {53, 65, 34, 34534, 45, 6, 5345, 345, 3453, 4, 43, 43, 343, 354, 234, 23, 34, 34, 3, 876};
        long startTimeBubleSort = System.currentTimeMillis();
        for (int i = 0; i < dataset.length - 1; i++) {
            int indicator = 0;
            for (int j = 0; j < dataset.length - i - 1; j++) {
                if (dataset[j] > dataset[j + 1]) {
                    Integer cell = dataset[j];
                    dataset[j] = dataset[j + 1];
                    dataset[j + 1] = cell;
                    indicator = 1;
                    if (indicator == 0) {
                        break;
                    }
                }

            }
        }
        long endTimeBubleSort = System.currentTimeMillis();
        System.out.println("BubleSort: " + (endTimeBubleSort - startTimeBubleSort) + " milliseconds");

        long startTimeCollectionSort = System.currentTimeMillis();
        List datasetArray = new ArrayList(Arrays.asList(dataset));
        Collections.sort(datasetArray);
        long endTimeCollectionSort = System.currentTimeMillis();
        System.out.println("CollectionSort: " + (endTimeCollectionSort - startTimeCollectionSort) + " milliseconds");
    }
}
