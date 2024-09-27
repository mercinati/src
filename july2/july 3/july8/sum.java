// there is array int[] arr = {2,3,5,8,7,6} 
// you have to find out two number whose sum is 12

package july8;

public class sum {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,7,6};

        for(int i=0; i<6; i++) {

            for(int j=i+i; j<6; j++) {

                int sum;
                sum = arr[i]+arr[j];
                if(sum==12){
                    System.out.println(arr[i]+" + "+arr[j]+" = "+sum);
                    break;
                } else{
                    continue;
                }

            }
        }
    }
}
