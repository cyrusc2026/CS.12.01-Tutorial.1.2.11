//I have neither given nor received unauthorized aid on this piece of work.
public class DiverseArray {
    public static int arraySum (int[] array){
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
    public static int[] rowSums (int[][] array){
        int[] answer = new int[array.length];
        for (int row = 0; row < array.length; row++){
            answer[row] = DiverseArray.arraySum(array[row]);
        }
        return answer;
    }
    public static boolean isDiverse (int[][] array){
        int[] sums = DiverseArray.rowSums(array);
        for (int i = 0; i < sums.length; i++){
            for (int j = i+1; j < sums.length; j++){
                if (sums[i] == sums[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
