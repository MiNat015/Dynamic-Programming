public class delimiter {
    public static void main(String[] arg){
        String str = "some interesting text";
		String[] arr = str.split("z", 0);
        arr.length
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
