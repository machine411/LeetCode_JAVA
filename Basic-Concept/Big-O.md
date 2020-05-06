# Big-O
## what is Big O?
 It is the language and metric we use to describe the efficiency of algorithms.
 
 ;)as speed,which is the metric we use to descibe how fast of any move things,transfer things and so on.
 
## Time Complexity 
  This is the concept of asymptotic runtime.
  
  eg:
   O(N),N is the size of file,which means that the time to transfer will increases linearly with the isze of the file.
   
   O(1) with respect to the size of the file.as the size of the file increases,it won't take any longer to get the file to transfer.The time is constant.
 
   There are the most common ones :O(logN),O(NlogN),O(N),O(N^2),O(2^N)
     
   
 ## Big O,Big Theta,and Big Omega 
  These are both describe runtimes.There are the differences between them:
  
 - O(big O):In academia, big O describes an upper bound on the time.This is similar to a less-than-or-equal-to-relationship.Like a simple values in an array is O(N) as well as O(N^3) or any runtime bigger than O(N).
  
 - Ω(big omega):In academic,Ω is the equivalent concept but for lower bound.Printing the values in an array is Ω(N) as well as  Ω(log N) or Ω(1).After all, you know that it won't be faster than those runtimes.
  
 - Θ(big theta):In academic,Θ means both O and Ω.That is Θ(N) is both 0(N) and Ω(N).**industry would just say this is O(N)**.
  
## Best Case,Worst Case,and Expected Case
 Using quick sort as the example,which is a divide and conquer algorithm.It picks an element as pivot and then swaps values in the array such that the elements less than pivot appera before elements greater than pivot.
 - Best Case: If all elements are equal, then quick sort will just traverse through the array once. this is O(N).
 
 - Worst Case: If we get unlucky and the pivot is repeatedly the biggest element in the array.This will degenerate O(N^2) runtime.
  
 - Expected Case: The best and worst case not happen over and over again.In the most balanced case ,it would be O(N log N).
 
## Space Complexity
  
  Not only time needs to be considered, but also need to care about the space.
 
 Space complexity is parallel concept to timme complexity.If we need to create an array of size n , it requires O(n) space, but if we need a two-dimensional array of size n* n, this will require O(n^2) space.
 
 Stack space in recursive calls counts.each of these calls is added to the call stack and takes up actual memory.
 
 - Drop the Constants:It is very possible for O(N) code to run faster than O(1) codefr specific inputs. For this reason,we drop the constants in runtime.eg O(2N) we usually consider O(N)
 
 - Drop the Non -Dominant Terms:like O(N^2 +N),the second N is not exactly a constant but not especially important,we will drop it.
 
 - Multi-Part Algorithms: Add vs Multiply: such as two for loop separately. it would O(A+B),but if one for loop inside other for loop.it would O(A*B).
   - if algorithm in the form "do this,then,when you are all done, do that" then you add the runtimes.
   - if algorithm in the form"do this for each time you do that"then you multiply the runtimes.
   
## Log N Runtimes
 where dose this come from?
 
 Using binary search as example,we start off with an N -element array to search.Then after single step,we are down to N/2 elements.The total runtime is then a matter of how many steos,we can take until N becomes 1;
 
 2^k = N,This is exactly what log expresses.
 
 This is the same reason why finding an element in a balanced binary search tree is O(log N).
 
## Recursive Runtimes
 As the fibonacci as example,the space complexity of this algorithm will be O(N) but O(2^n) times,sometimes it will be O(branches^depth).
 
 
 
 
  
  
  
