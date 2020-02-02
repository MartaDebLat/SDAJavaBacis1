package Lesson13;

class BinarySearch {
    int binarySearch (int arr[], int l, int r, int x)
    {
if (r >= l) {
    int mid = 1 + (r-1) /2;
    if (arr [mid] == x)
        return mid;
    if (arr[mid] > x)
        return binarySearch(arr,l,mid-1,x);
}
return -1;
    }
   }
