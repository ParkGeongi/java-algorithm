package 정렬;

class 삽입정렬{
    public static void main(String[] args) {
        new 삽입정렬().solution();
    }

    void solution(){
        int[] arr = creatArr();
        print(arr);
        System.out.println("\n");
        arr = sortArr(arr);
        print(arr);
    }

    int[] creatArr(){
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = creatRandnum();
            System.out.println("뽑은 랜덤값 :" + arr[i]);
        }
        return arr;
    }

    int creatRandnum(){
        return (int)(Math.random()*10)+1;
    }

    int[] sortArr(int[] arr){
        int val = 0;
        for(int j=arr.length - 1;j>0;j--){
            for(int i=0;i<j;i++){
                if(arr[i] > arr[i+1]){
                    val = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = val; 
                }
            }
        }
        return arr;
    }

    void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
       
    }

}