import java.util.*;

public class HomeWork5 {
    public static void main(String[] args) {
        Integer[] dataset = new Integer[10_000];
        final Random random = new Random();
        for (int i = 0; i< dataset.length; i++){
            dataset[i] = random.nextInt();
        }
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
        long timeDifference = (endTimeBubleSort - startTimeBubleSort) / (endTimeCollectionSort - startTimeCollectionSort);
        System.out.println("Алгоритм Collection.sort O(n*logn) работает быстрее метода пузырьковой сортировки O(n^2) в ~" + timeDifference + " раз.");
    }
}
