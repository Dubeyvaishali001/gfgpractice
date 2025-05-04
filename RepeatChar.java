public class RepeatChar {
    public static void main(String[] args) {
        String name="geekforgeeks";
             char arr[] =name.toCharArray();

       for(int i=0;i<arr.length;i++) {
           for(int j=i+1;j< arr.length;j++) {
               if(arr[i]==arr[j]) {

                   System.out.println(arr[i]);
return;
               }
               else {
                   System.out.println("not in common");
               }
           }

       }

    }
}
