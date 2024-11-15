package secondlargestnumber;
public class Main {
    
    // Function to find the second largest number in an array
    public static int findSecondLargest(int[] arr) {
        // Edge case: If the array has less than 2 elements, return -1
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1;
        }

        int first = Integer.MIN_VALUE;  // First largest element
        int second = Integer.MIN_VALUE; // Second largest element

        // Loop through the array to find the two largest distinct numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;  // Update second largest
                first = arr[i];  // Update first largest
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i]; // Update second largest if it's distinct from the first
            }
        }

        // If no second largest element is found
        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no distinct second largest number.");
            return -1;
        }

        return second;  // Return the second largest number
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1}; // Example array
        int result = findSecondLargest(arr);

        // Output the result
        if (result != -1) {
            System.out.println("The second largest number is: " + result);
        }
    }
}
