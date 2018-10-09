//Implementation of Quicksort

public class Sorter {
	public int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}

	public void sort(int arr[], int low, int high) {
		if (low < high) {
			int pIndex = partition(arr, low, high);
			sort(arr, low, pIndex - 1);
			sort(arr, pIndex +1, high);
		}
	}
}