# CS445-L13
String Matching
Algorithms and Data Structures I
Lab 13: String Matching

Background
String matching is a common and widely-used algorithm (Have you ever used ctrl + F on a web document?). In this lab, we are going to implement a string-matching algorithm of our choice, except it won’t run on Strings, it will run on arrays.

Exercise
Your job is to implement a class called ArraySearcher that implements the ArraySearcher interface. The interface includes one method:

int search(T[] arr, T[] pattern)
Given an array arr and a pattern array (called pattern), return the index of the first occurrence of pattern in arr. If pattern is not in arr, return -1.
You can assume pattern will always have at least 1 element in it

search() examples:

arr
pattern
Expected Result
{1, 2, 3, 4, 5}
{3, 4, 5}
2
{1, 2, 3, 4, 5, 6, 7, 8, 9}
{8, 9, 10}
-1
{}
{1, 2, 3}
-1


Sample Output
Running java Lab13.java with your ArraySearcher.java file in the same directory should produce the following output:

Found the sub-array at index 7799
Did not find the sub-array in arr


Note: Lab13.java uses a Random object so your ‘found’ index will likely be different from 7799. The second sub array should never be found.

Starter Code
The Lab 13 Starter Code can be found here.

Deliverables
You are responsible for submitting only ArraySearcher.java. Note: Your ArraySearcher implementation does not need a constructor, but the search method should be non-static.
