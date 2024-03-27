package task4;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import java.util.Arrays;

public class SortChart {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }

        BubbleSort bubbleSort = new BubbleSort();
        ShakerSort shakerSort = new ShakerSort();

        XYSeries bubbleComparisons = new XYSeries("Сравнение пузырьковым методом");
        XYSeries bubbleSwaps = new XYSeries("Кол-во ообменов пузырьковым методом");
        XYSeries shakerComparisons = new XYSeries("Сравнение шекерным методом");
        XYSeries shakerSwaps = new XYSeries("Кол-во обменов шекерным методом");

        for (int i = 100; i <= 1000; i += 100) {
            int[] arr1 = Arrays.copyOfRange(arr, 0, i);
            int[] arr2 = Arrays.copyOfRange(arr, 0, i);
            bubbleSort.sort(arr1);
            shakerSort.sort(arr2);
            bubbleComparisons.add(i, bubbleSort.getComparisons());
            bubbleSwaps.add(i, bubbleSort.getSwaps());
            shakerComparisons.add(i, shakerSort.getComparisons());
            shakerSwaps.add(i, shakerSort.getSwaps());
        }

        XYDataset dataset = new XYSeriesCollection();
        ((XYSeriesCollection) dataset).addSeries(bubbleComparisons);
        ((XYSeriesCollection) dataset).addSeries(bubbleSwaps);
        ((XYSeriesCollection) dataset).addSeries(shakerComparisons);
        ((XYSeriesCollection) dataset).addSeries(shakerSwaps);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "График",
                "Размер",
                "Число операций",
                dataset
        );

        ChartFrame frame = new ChartFrame("Sort Chart", chart);
        frame.pack();
        frame.setVisible(true);
    }
}
