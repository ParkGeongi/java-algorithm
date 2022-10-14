package 정렬;

class 버블정렬{
    public static void main(String[] args) {
        new 버블정렬().solution();
    }
    void solution(){

        int[] arr = creatArr();
        arr = sortArr(arr);
        print(arr);
    }

    int[] creatArr(){
        
        int[] arr = new int[10];

        for(int i=0; i< arr.length; i++){
            arr[i] = randomNum();
            for(int j=0; j<i; j++){
                if(arr[j] == arr[i]){
                    i--;
                }  
            }
        }

        return arr;
    }

    int[] sortArr(int[] arr){

        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr.length - 1; j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;

                }


            }
        }
        return arr;
    }

    int randomNum(){
        return (int)(Math.random()*10)+1;
    }

    void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }






}