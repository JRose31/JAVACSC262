# CSC262 | Java 
## ArrayLists vs Java Built-In Arrays
### Functions
**Array**s and **ArrayList**s in Java serve similar purposes and even perform some of the same functions. Both of these data structures are intended to store a collection of data. Both Arrays and ArrayLists can store different types of data, and also follow zero-indexing (where the first element of the list is referred to as the 0th element). However, there are also difference in how we use some of the functions of both data structures.

### Conceptual Differences
While Arrays and ArrayLists have similar functions, there are many differences, starting with the way you would initialize each data structure.<br>
**Array**: `<type>[] var = new <type>[n]` (*n* is the size of the collection, needing to be initialized with the object)<br>
**ArrayList**: `ArrayList<type> var = new ArrayList<type>();`<br>

Aside from the above exmaple demonstarting that Arrays are fixed in length where ArrayLists can grow to the user's needs, the way in which elements are added to each data structure differs as well. Here, we're adding the first element to the collections called grades.<br>
**Array**: `grades[0] = 93.2`<br>
**ArrayList**: `grades.add(93.2)` or `grades.set(0, 93.2)`
