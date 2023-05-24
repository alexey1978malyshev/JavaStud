public class Sort {

    public static void main(String[] args) {
        int[] arr1 = {5,1,9,12,8,16,17,12};
        sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }

    public static void sort(int[]arr){
        // построение кучи, перегрупируем массив
        for (int i = arr.length/2 -1; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }
        // один за другим извлекаем элементы из кучи
        for (int i = arr.length -1; i >= 0 ; i--) {
            //перемещаем текущий элемент в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            //вызываем hearify на уменьшенной куче
            heapify(arr, i,0);
            
        }
    }


    private static void heapify(int[] array, int heapSize, int rootIndex) { // просеивание кучи

        int largest = rootIndex; //инициализируем наибольший элемент как корень
        int leftChild = 2 * rootIndex + 1; //определяем два дочерних элемента
        int rightChild = 2 * rootIndex + 2;
        //если левый дочерний элемент больше корня
        if (leftChild < heapSize && array[leftChild] > array[largest])
            largest = leftChild;

        //если правый дочерний элемент больше, чем самый большой на данный момент
        if (rightChild < heapSize && array[rightChild] > array[largest])
            largest = rightChild;
        //если самый боьшой элемент не корень
        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;
            //рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(array, heapSize, largest);
        }

    }

}









