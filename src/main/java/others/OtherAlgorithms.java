package others;

public class OtherAlgorithms {
    public static void numberDigits(long number){
        int count = 0;
        long right_most_digit = 0 ;
        long left_most_digit=0;
        int degree_of_10=0;
        long temp_numebr= number;
        while (temp_numebr > 0 ) {
            System.out.println(temp_numebr  + "  count " + count + " number /10 " + temp_numebr/10 + " left_most_digit " + left_most_digit + " right_most_digit " + right_most_digit );
            left_most_digit = temp_numebr / 10;
            right_most_digit=temp_numebr % 10;
            temp_numebr = temp_numebr/10;
            count++;
        }

        degree_of_10 = (int) Math.pow(10,count-1);

        while (number > 0 ){
            left_most_digit = (number/degree_of_10);
            right_most_digit = number%10;
            System.out.println(" left_most_digit " + left_most_digit + " right_most_digit " + right_most_digit);
           //To Strip off the left most and the right most by getting the remainder when dividing by degree_of_10;
            System.out.println(number  + " number/degree_of_10 " + number/degree_of_10 + " (number/degree_of_10)/10 " + ((number/degree_of_10)/10));

            number=(number/degree_of_10)/10;
            System.out.println(number);

            degree_of_10/=100;
        }



    }
    public static Boolean isNumericPalindromeNoSpace(long number){
        long left_most_digit =0;
        long right_most_digit=0;
        int digits_count,degree_of_10;
        degree_of_10=digits_count=0;

        long temp_number = number;

        while (temp_number>0){
            temp_number=temp_number/10;
            digits_count++;
        }
        // To get the single left digit divide the number by the power of 10 of the size of number
        // e.g 10,002/10000 = 1 and to get the right most mode by 10 10,002 % 10 = 2
        degree_of_10 = (int) Math.pow(10,digits_count-1);

        while (number > 0 ){
            left_most_digit = (number/degree_of_10);
            right_most_digit = number%10;
            System.out.println(" left_most_digit " + left_most_digit + " right_most_digit " + right_most_digit);
            if(left_most_digit!=right_most_digit)
                return false;
        //To Strip off the left most and the right most by getting the remainder when dividing by degree_of_10;  
        number=(number/degree_of_10)/10;
        degree_of_10/=100;
        }

        return true;
    }

    public static boolean isNumericPalindromeWithSpace(long number) {
        // Write your code here
        int n = 0;
        // get the size of the string
        long tem_number =number;
        while (tem_number > 0){
            tem_number = tem_number /10;
            n++;
        }
        int i=n-1;
        int j=n-1;
        int [] arr = new int [n];
       // create an array of numbers
        while (number>0 && i>=0){
            arr[i]=(int)(number%10);
            number = (number / 10);
            i--;
        }
        i=0;
        while (i<j){
            if (arr[i] !=arr[j])
                return false ;
            i++;
            j--;
        }
       return true;
    }

    public static int digit_sum(long number) {
        // Write your code here
        String[] n = Long.toString(Math.abs(number)).split("");
        int sum=0;
        if (number < 0) {
            number *= -1;
        }

        while (number > 0){
            System.out.println(sum + " " + number);
            sum = sum + (int)number % 10;
            number = number / 10;
        }
       /* for (int i=0 ; i < n.length;i++){
             sum +=Integer.valueOf(n[i]);
        }*/
        return sum;
    }
}
