package comp210proj;

/* Do not remove any code that is here.
 You may add new code if you wish to
 new data fields or helper methods.
 Also note that this skeleton will not compile as is,
 since the methods that return things do not contain
 return statements... so you need to add them.
*/

public class Summer {
    private int[] nums;
    private int arraylen;
    private int index;

    // Any other data fields you decide you need can go here.

    public Summer(int n) {
      /* In this constructor, first allocate an array that hold n ints and put that in nums.
      Hint: If you add an extra field to store the index of the next open slot in the array,
      you would need to do something with that field here.
      */
        /*Your code here */
        nums = new int[n];
        index = n;
        arraylen = n;

    }

    public void add(int num) {
        // In this method, take the parameter num and put that value into the Summer.
        /*Your code here */
        nums[arraylen - index] = num;
        index--;


    }

    public int sum ( ) {
      /*In this method, go through the array and add up all the ints
      that have been stored in it so far.
      Note that the sum of ints is of type int, so return the int sum you get.

      Your code here*/
        int final_sum = 0;
        for (int i: nums) {
            final_sum += i;
        }
        return final_sum;
    }

    public int high ( ) {
      /*Find the largest number stored in the array so far
      and return it.

      Your code here */
        int max = 0;
        for (int i = 0; i < arraylen; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public int low ( ) {
      /*Find the smallest number stored in the array so far
      and return it.

      Your code here */
        int low = 0;
        for (int i = 0; i < arraylen; i++) {
            if (nums[i] < low) {
                low = nums[i];
            }
        }
        return low;
    }

    public double average( ) {
      /*Find the average of all the numbers stored in the array
      so far, and return it.
      Note that the average of ints might produce a double, so
      we are returning a double.

      HEADS UP
      This method might get called before there are any
      ints stored in the array, so you need to guard
      against divide by zero.
      We will simply define the average of no numbers
      to be 0.0 so return that if the array has no numbers in it.


      Your code here */
        double average;
        if (sum() == 0) {
            average = 0.0;
        }
        else {
            average = sum()/count();
        }
        return average;


    }

    public double avgOver( int thresh ) {

    /*Similar to average() except we want to only average up
      stored numbers that are ABOVE ( > ) the threshold
      parameter "thresh".

      Hint: Look at examples 1 and 2 in the readme make sure you
      understand how to calculate avgOver.

      HEADS UP
      We have the same divide by zero issue here as in average()
      so again if you are trying to take an average on no numbers
      simply return 0.0


      Your code here */
        double average;
        int sum = 0;
        int count = 0;
        for (int i: nums) {
            if (i > thresh) {
                sum += i;
                count++;
            }
        }
        if (sum() == 0) {
            average = 0.0;
        }
        if (sum == 0) {
            average = 0.0;
        }
        else {
            average = sum/count;
        }

        return average;


    }

    public int count ( ) {
        //Return the number of ints that have been stored in the array.

        /*Your code here */
        int number = 0;
        for (int i: nums) {
            if (i != 0) {
                number++;
            }
        }
        return number;

    }

}

