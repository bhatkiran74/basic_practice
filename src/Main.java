
public class Main {
    public static void main(String[] args) {

        int num = 123215;
        int r = 0;
        int rem;
        int val = num;

        while (num!=0){
            rem = num % 10;
            r = r*10 + rem;
            num = num/10;
        }
        if (r == val){
            System.out.println("Given number is pallindrome");
        }else {
            System.out.println("Given number is NOT pallindrome");
        }

    }
}