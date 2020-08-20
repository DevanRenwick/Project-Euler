public class Problem1 {

    public static void main(String[] args){

        int sum = 0; //everything will get added up through this variable.

        for(int i = 0; i < 1000; i++){ //as long as int i is under 1000 the loop will keep going.
            if(i % 3 == 0 || i % 5 ==0) //checking if int i is a multiple of 3 or 5.
                sum = sum + i; //add the number to the current sum.
        }
        System.out.println(sum); //print out the total sum.
    }
}