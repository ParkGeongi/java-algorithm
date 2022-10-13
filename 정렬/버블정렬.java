package 정렬;
import java.util.*;
class 버블정렬{
    public static void main(String[] args) {
        new 버블정렬().solution();
        
    }
    void solution(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 개수: ");
        
        int n = scanner.nextInt();
        System.out.println("##########################");
        int[] arr = creatArr(n);
        System.out.println("##########################");
        arr = sortArr(arr,n);
        print(arr, n);
    }
    int creatRand(){
        return (int)(Math.random()*10)+1;
    }
    int[] creatArr(int n){ 
        int[] arr = new int[n];
        for(int i=0; i< arr.length;i++){
            int number = creatRand();
            arr[i] =  number;
            System.out.println(arr[i]);
        }
               
        return arr;
    }
    int[] sortArr(int[] arr,int n){
        
        for (int j=n-1; j>0;j--){
            for (int i=0; i<j;i++){
                if(arr[i]>arr[i+1]){
                    int val = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = val;
                    }
                else {
                    arr[i] = arr[i];
                    arr[i+1] = arr[i+1];
                }
            }
        }
        return arr;
    }

    void print(int[] arr,int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] +"\t");
        }
    }
}
