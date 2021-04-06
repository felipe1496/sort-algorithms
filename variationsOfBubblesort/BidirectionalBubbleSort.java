package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;
import util.Util;

/**
 * This bubble sort variation has two internal iterations. In the first, it
 * pushes big elements to the right, like the normal bubble sort does. Then in
 * the second, iterates the array backwards, that is, from right to left, while
 * pushing small elements to the left. This process is repeated until the array
 * is sorted.
 */
public class BidirectionalBubbleSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (array.length == 0 || rightIndex < leftIndex) {
			return ;
		}
			int left = leftIndex, right = rightIndex;
			while (left < right)
			{
				for (int i = left; i < right; i++)
				{
					if (array[i].compareTo(array[i+1]) > 0)
						Util.swap(array, i, i+1);
				}
				right--;


				for (int j = right; j > left; j--)
				{
					if (array[j].compareTo(array[j-1]) < 0)
						Util.swap(array, j, j-1);
				}
				left++;
			}
	}
}
