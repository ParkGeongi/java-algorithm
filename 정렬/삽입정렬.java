package 정렬;

class 삽입정렬{
    public static void main(String[] args) {
        new 삽입정렬().solution();       
    }
    
    void solution(){
        int[] arr = creatArray();
        arr = sortArray(arr);
        print(arr);
    }
    int creatrand(){
        return (int)(Math.random()*10)+1;
    }
    int[] creatArray(){
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = creatrand();
        }
        return arr;
    }
    int[] sortArray(int[] arr){
        return arr;
    }
    void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        
    }
}
