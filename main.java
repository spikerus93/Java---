// Написать программу Пирамидальной соритировки
class Main{
    public static void main(String args[]){
        int N = 10;
        int array[] = new int[N];
        
        for(int i=0; i<N; i++){
            array[i] = (int)(Math.random() * 100);
        }
        for(int i : array)
            System.out.printf("%d ", i);
        System.out.println();

        heapSort(array);
        for(int i : array)
            System.out.printf("%d ", i);
        System.out.println();


 }

    static void heapify(int[] array, int length, int i){ //метод проверки элементов
    int leftChild = 2*i+1;
    int rightChild = 2*i+2;
    int largest = i;

    if (leftChild < length && array[leftChild] > array[largest]){
        largest = leftChild;
    }

    if (rightChild < length && array[rightChild] > array[largest]){
        largest = rightChild;
    }

    if (largest != i){
        int temp = array[i];
        array[i] = array[largest];
        array[largest] = temp;
        heapify(array, length, largest);
    }
}

    public static void heapSort(int[] array){
    if (array.length == 0)
    return;

    int length = array.length;

    for (int i = length/2-1; i >= 0; i--)
        heapify(array, length, i);
    
    for (int i = length-1; i >= 0; i--){
        int temp = array[0];
        array[0] = array[i];
        array[i] = temp;
    
        heapify(array, i, 0);
    }
        
    }
}


