public class IntArrayMethods{
    public static int arraySum(int[] a){
        int num;
        for(int i=0; i<a.length; i++){
            num += a[i];
        }
        return num;
    }
    //   arraySum sums the values of the integers contained in the given array and
    //   returns that value.

    public static double arrayMean(int[] a){
        int numb;
        for(int i=0; i<a.length; i++){
            numb += a[i];
        }
        numb /= a.length;
        return num;
    }
    //   arrayMean calculates the average of the values of the given array and returns
    //   that value as a double

    public static int arrayMin(int[] a){
        int low = a[0];
        for(int i=0; i<a.length; i++){
            if(low < a[i]){
                low = a[i];
            }
        }
        return low;
    }
    //   arrayMin finds the minimum value that occurs in the array and returns that
    //   value.

    public static int arrayMax(int[] a){
        int high = a[0];
        for(int i=0; i<a.length; i++){
            if(high > a[i]){
                high = a[i];
            }
        }
        return high;
    }
    //   arrayMax finds the maximum value that occurs in the array and returns that
    //   value.

    public static boolean[] arrayLocalMin(int[] a){
        boolean[] list = new boolean[a.length];
        list[0] = false;
        for(int i=1; i<a.length-1; i++){
            if(a[i]<a[i-1] && a[i]<a[i+1]){
                list[i] = true;
            }else{
                list[i] = false;
            }
        }
        list[a.length] = false;
        return list;
    }
    //   arrayLocalMin determines the locations of any local minimums in the array. A
    //   local minimum is defined as a value that is strictly less than either of its
    //   neighbors. arrayLocalMin returns an array of booleans where the value at
    //   each index is true if the value in the original array is a local minimum and
    //   false otherwise.

    public static boolean[] arrayLocalMax(int[] a){
        boolean[] list = new boolean[a.length];
        list[0] = false;
        for(int i=1; i<a.length-1; i++){
            if(a[i]>a[i-1] && a[i]>a[i+1]){
                list[i] = true;
            }else{
                list[i] = false;
            }
        }
        list[a.length] = false;
        return list;
    }
    //   arrayLocalMax determines the locations of any local maximums in the array. A
    //   local maximum is defined as a value that is strictly greater than either of its
    //   neighbors. arrayLocalMax returns an array of booleans where the value at
    //   each index is true if the value in the original array is a local maximum and
    //   false otherwise.

    public static int arrayMode(int[] a){
        
        int count;
        int num = a[0];
        int bestCount;
        for(int i=0; i<a.length; i++){
            if(num == a[i]){
                count++;
            }
            if(count>bestCount){
                bestCount = count;
                num = a[i];
            }
        }
        return num;
    }
    //   arrayMode finds the mode of the array. If multiple modes occur, then arrayMode
    //   returns the value of the first mode that occurs in the array.

    public static int arrayCount(int[] a, int b){
        int count;
        for(int i=0; i<a.length; i++){
            if(b == a[i]){
                count++;
            }
        }
        return count;
    }
    //   arrayCount determines the number of occurences of the parameter b in the array
    //   and returns that value.

    public static boolean arrayContainsDuplicates(int[] a){ 
        boolean bum;
        for(int j=0; j<a.length; j++){
            num = a[j];
            for(int i=0; i<a.length; i++){
                if(num == a[i]){
                    bum = true;
                } 
            }   
        }
        
        return count;
    }
    //   arrayCountainsDuplicates determines if any duplicate values exist within the
    //   array and returns true if this occurs and false otherwise.

    public static boolean arrayAllEqual(int[] a){
        for(int i=0; i<a.length; i++){
            if(a[i] == a[i+1]){
                return true;
            }
        }
        return false;
    }
    //   arrayAllEqual determines if all of the items in the array are the same and
    //   returns true if this is the case and false otherwise.

    public static double[] arrayRollingAverage(int[] a, int b){
        int count = 1;
        int num = a[0];
        int average;
        for(int i=0; i<b; i++){
            average = num/count;
            num += a[i];
            count++;
        }
        return average;
    }
    //   arrayRollingAverage calculates a rolling average of b values for each index in
    //   the array. These values are stored and then returned in an array of doubles.
    //   For example, the returned value at index i should contain the average of the
    //   value at index i and the additional b-1 values before it. If less than b-1
    //   values occur before index i, then an average will be calculated using just the
    //   existing values.

    public static int[] arrayShift(int[] a, int b){
        int[] list = new int[a.length];
        for(int i=0; i<a.length; i++){
            
        }
    }
    //   arrayShift returns an array of values shifted by b places from the original
    //   array. For example, an item at index i will be shifted to index i+b. If i+b is
    //   out of bounds of the array, then values should wrap back around to the start
    //   of the array.

    public static int[] arrayReverse(int[] a)
    //   arrayReverse returns the original array in reverse order.

}