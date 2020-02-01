package Lesson12;


public class BubbleSort {

    public static void sort(int[] sortTab) {

        boolean swapped;

        int n = sortTab.length;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                int j = i - 1;
                if (sortTab[j] > sortTab[i]) {
                    int temp = sortTab[j];
                    sortTab[j] = sortTab[i];
                    sortTab[i] = temp;
                    swapped = true;
                }
            }
        }  while (swapped);
    }
}
