// Time complexity: O(log(n))
// Space complexity: O(log(n))
class BinarySearch {
    // Returns index of x if it is present in arr[l.. r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    {
            if(l > r || arr.length == 0) return -1;

            int mid = (l + r)/2;

            if(arr[mid] == x) return mid;

            return (x > arr[mid]) ?
                    binarySearch(arr, mid + 1, r, x) :
                    binarySearch(arr, l,mid-1, x);
    }
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length; 
        int x =10;
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 
