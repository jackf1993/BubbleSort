/* author: Jack Farah
 * description: Bubble Sort implementation running at O(n^2) time complexity.
*/

public class Main {
    public static void main(String[] args) {

        int [] array = {5, 1, 4, 2, 3};  //creating array with predetermined elements.
        for(int i = array.length-1; i > 0; i--){ //Bubble sort
            for(int j =0; j < i; j++){
                if(array[i] > array[j]){
                    swap(array,i,j);  //calling swao method
                }
            }
        }
        for(int a =0; a <array.length; a++){ //printing sorted array
            System.out.print(array[a] +", ");
        }
    }

    public static void swap(int[] array, int i, int j){ // swap method
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
