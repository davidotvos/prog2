public class lessthan1000 {
    public static void main(String[] args) {
        int num = 0;
        for(int i = 0; i < 1000; i++){
            if(i % 3 == 0 || i % 5 == 0){
                num += i;
            }
        }
        System.out.println("The sum is : " + num);
    }

}
