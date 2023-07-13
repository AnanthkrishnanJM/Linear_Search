package linear;
public class OccurrenceCounter {
    public static void main(String[] args) {
        int[] A = {1, 2, 2};
        int B = 2;
        
        int occurrences = countOccurrences(A, B);
        
        System.out.println("Number of occurrences: " + occurrences);
    }
    
    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}
