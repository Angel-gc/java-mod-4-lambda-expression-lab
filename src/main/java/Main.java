import java.util.function.IntUnaryOperator;

public class Main {
	// write the nextOddNum here
    public static IntUnaryOperator nextOddNum = (n) -> {
       if((n |1) > n){
            return n+=1;
       } else {
          return n+=2;
       }
    };
    public static void main(String[] args) {
        int num = 5;
        int num2 = 10;

        System.out.println(nextOddNum.applyAsInt(num)); // 7
        System.out.println(nextOddNum.applyAsInt(num2)); // 11
    }
//    @FunctionalInterface
//    interface oddNumInterface {
//        int applyAsInt(int num);
//    }
}
