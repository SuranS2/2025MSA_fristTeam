package Na;

public class QuickSort {
	public static void swap(int[] arr, int num1, int num2) {
		int tmp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = tmp;
	}

	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	public static void quickSort(int[] arr, int low, int high) {

		if (low >= high)
			return;

		int pivot = low; // 피벗 설정
		int left = low + 1;
		int right = high;

		while (left <= right) {
			// 피벗보다 큰 값을 찾을 때까지 오른쪽으로 이동
			while (left <= high && arr[left] <= arr[pivot])
				left++;
			// 피벗보다 작은 값을 찾을 때까지 왼쪽으로 이동
			while (right > low && arr[right] > arr[pivot])
				right--;
			// left와 right가 교차하지 않으면 swap
			if (left < right)
				swap(arr, left, right);
		}
		// pivot과 교환
		swap(arr, pivot, right);

		// 재귀적으로 왼쪽과 오른쪽 정렬
		quickSort(arr, low, right - 1);
		quickSort(arr, right + 1, high);
	}

	public static void main(String[] args) {

		// int[] arr = {8, 7, 6, 5, 2, 4, 1};
		int[] arr = { 78, 46, 5412, 34, 88, 49, 5, 6, 1, 21, 322, 695, 845, 215, 89, 52, 95, 15, 9 };
		quickSort(arr);

		for (int n : arr) {
			System.out.printf("%d ", n);
		}
		System.out.println();

	}
}
