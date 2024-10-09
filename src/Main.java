public class Main {
    public static void main(String[] args){
        int N = 4;
        int[] myArray = new int[N];
        for (int i=0; i<N; i++) {
            myArray[i] = i+1;
        }
        for (int i=0; i<N-1; i+=2) {
            int temp = myArray[i];
            myArray[i] = myArray[i+1];
            myArray[i+1] = temp;
        }
        System.out.println("Результат: ");
        for (int num : myArray){
            System.out.print(num+" ");
        }
    }
}
