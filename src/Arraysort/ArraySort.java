
package Arraysort;

public class ArraySort {
    
public static void main(String[] args) {
        int[] numbers = {9, 7, 8, 15, 3, 2};
        Array a = new Array(numbers);
        a.setNumbers(numbers);
    }
}

class Array {
    int[] numbers;

    public Array(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] newNumbers) {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                   
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
