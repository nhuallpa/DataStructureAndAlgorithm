# Data Structure and Algorithm

Space Complexity
Time Complexity: How much time does an algorithm take?.

We talk about the order of growth for large enough datasets. Asymptotic Analysis

### Typye of Complexity
- Worst Case
- Best case
- Average case

We asume:
We have infinte memory
Each operation (+/*-=) takes unit time
For each memory access, unit time is consumed
Data may be accessed from RAM or Disk, it is assumed that the data is in the RAM

### Buble Sort

```
for i = 0 to A.length - 2
  for j = 0 to A.length - 2 - i
    if A[j] > A[j+1]
        tmp = A[j+1]
        A[j+1] = A[j]
        A[j] = tmp
```

### Big O

``` 
lon g <= Squre n <= n <= n * log n <= n^2 <= n^3 <= 2^n <= n!
```

O(1) : Constant time operation. It does't depend of the input.
O(n^2) : Big O n square

## Basic Sorting set to by O(n^2)

### Selection Sort

``` bash
for i = 0 to A.length - 2
    minIndex = i
    for j = i + 1 to A.length - 1
        if (data[j] < data[minIndex])
            minIndex = j
    tmp = data[minIndex]
    data[minIndex] = data[i]
    data[i] = temp
```

### Insertion Sort
``` bash
for i = 0 to A.length - 1
    current = A[i]
    j = i - 1
    while j >= 0 && A[j] > current
        A[j+1] = A[j]
        j = j - 1
    A[j+1] = current
```
### Comparison
|Insertion Sort | Bubble Sort | Selection Sort  |
|---------------|-------------|-----------------|
| Relatively good for small lists | Very inefficient | Better than bubble sort |
| Relatively good for partially sorted lists| | Running time is independent of ordering of elements |


### In place sorting
In place sorting algorithms are those, in which we sort the data array, without using any additional memory. What does that mean?

Well, when we do the sorting, we use this temporary variable to be able to exchange elements, right? So that is memory usage other than the data array.

That is we have used extra memory in these algorithms. So does that mean our algorithms are not in place? Well, our implementation of algorithms is IN PLACE. The thing is, if we use a constant amount of extra memory (like in our examples, we just used one temporary variable - which could have been declared once outside the loops and reused), the sorting is in-place. So our algorithms are in place.

But in case extra memory, which is proportional to the input data size, is used, then it is NOT IN PLACE sorting. For e.g. instead of rearranging elements in the same array, we create another array of the same size as the input, and then keep putting the sorted items in this new array and return this new array as result (sorted array). But because memory these days is so cheap, that we usually don't bother about using extra memory, if it makes the program run faster.

### Binary Search

Find (item) = O (Log n)

### Insert element in a Ordered Array
Insert(item) = O(n)

### Delete element in a Ordered Array
Delete(item) = O(n)

---

### Assignment
1. Write a class Employee, which represents an employee in a company. The employee has a employeeNumber (9 digit number), firstName, lastName and emailId as member variables. Create a few employee objects and store them in an array. Write the insertion sort algorithm, which takes an array of employee and sorts them in order of their employee number.
2. Write an algorithm which checks if there are duplicate characters in a string. The method signature would look something like public boolean hasDuplicateChars(String s) . If we pass "anaconda" the method should return true (repeated char 'a'). If we pass 'great', the method should return false, because there are no duplicate characters in the string. What is the time complexity of this algorithm? If we know that the string contains ONLY ASCII characters, can we improve the algorithm?
3. Write an algorithm that takes two strings and returns a boolean value indicating if the strings are anagrams. If you don't know what an anagram is, search for the word (not the algorithm) online. What is the time complexity of this algorithm?

---