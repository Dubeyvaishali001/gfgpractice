public class ImmediateSmall {
    public static void main(String [] args) {
        int arr[]={4,2,1,5,3};
        int n=arr.length;

        int arr2[]=new int[n];
        for(int i=0;i<n-1;i++) {
            if (arr[i] > arr[i+1]) {
                arr2[i]=arr[i+1];
            }

            else {
                arr2[i]=-1;
            }
        }
        arr2[n-1]=-1;

        for(int i=0;i<n;i++) {
            System.out.println(arr2[i]);
        }


    }

}
