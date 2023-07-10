import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 6, 66, 45, 55, 4444, 3, 98};
        QuickSort.quickSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

        MargeSort.margeSort(arr);
        for (int num1 : arr) {
            System.out.print(num1 + " ");
        }

        System.out.println(BinarySearch.binarySearch(arr, 5));

        SimpleTree tree = new SimpleTree();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);

        System.out.println("Перебор в глубину");
        tree.traverseDepthFirst();

        System.out.println("Перевор в ширину");
        tree.traverseBreadthFirst();
    }
}