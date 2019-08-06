public class Task1Pivot {
    public static void main(String[] args){
        int[] arr={1,1,2,3,3,4,4,5,5,6,6};
        int front=0;
        int k=0;
        int end=arr.length;
        while(front<=end){
            int mid=(front+end)/2;
            if(arr[mid]==arr[mid-1]){
                front=0;
                end=mid;
            }
            else if(arr[mid]==arr[mid+1]){
                front=mid+1;
                end=arr.length;
            }
            else{
                System.out.println(arr[mid]);
                break;
            }
        }
    }
}
