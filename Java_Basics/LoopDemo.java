public class LoopDemo {
    public static void main(String[] args) {
        //for(int i=0;i<=5;i++){
        //    System.out.println(i);
        //}

        int arr[] = {2,3,4,5,6,7};
        //for(int i = 0;i<arr.length;i++){
        //    System.out.println(arr[i]);
        //}

        // For Each
        for(int i : arr){
            System.out.println(i);
        }
        System.out.println();

        String name = "Ram Sharma";
        for(char s : name.toCharArray()){
            System.out.println(s);
        }
    }
}
