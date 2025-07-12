hey , today we gonna learn about array , array is a dynamic data type which can store multiple one or more values in it of same data type , it haave fixed size and its starts from indexing 0 , random access O(1),

int arr[5] = {10, 20, 30, 40, 50};


there are way to dclear array

 1. Declare Without Initializing (Fixed Size Later)

 int[] arr;  // preferred
// or
int arr[];  // also valid, but less used

🔸 2. Declare and Allocate Memory

int[] arr = new int[5];  // creates array with 5 elements (0 by default)

This means:

arr[0] to arr[4] are available

All values are initialized to 0


🔸 3. Declare and Initialize in One Line

int[] arr = {10, 20, 30, 40, 50};


🔸 4. For Other Data Types

String[] names = {"Aditya", "Kaira", "Java"};
char[] vowels = {'a', 'e', 'i', 'o', 'u'};
float[] marks = {89.5f, 77.0f, 92.3f};


🔸 5. 2D Array Declaration

int[][] matrix = new int[3][3];  // 3x3 grid

Or initialize directly:

int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};


✅ Accessing Array Elements

System.out.println(arr[0]);  // prints first element
arr[2] = 99;  // update value at index 2


🔁 Loop Through Array

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

// OR enhanced for-loop
for (int num : arr) {
    System.out.println(num);
}
