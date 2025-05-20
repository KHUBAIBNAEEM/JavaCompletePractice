/*
====================================
          Java Set Notes
====================================

# Set Interface (java.util.Set)
---------------------------------
- **Unordered** collection (no guaranteed order unless using specific implementation).
- **No duplicates** allowed — each element must be unique.
- Allows **one null** element (depends on implementation).
- Based on `Collection` interface.

# Core Implementations
---------------------------------
1. **HashSet**
   • Backed by a HashMap  
   • Constant-time performance (O(1)) for add, remove, contains  
   • No ordering guarantees  
   • Allows one null  
   • Not thread-safe

2. **LinkedHashSet**
   • Maintains insertion order  
   • Slightly slower than HashSet due to ordering  
   • Backed by LinkedHashMap  
   • Allows one null

3. **TreeSet** (java.util.SortedSet)
   • Maintains elements in **sorted (natural or custom)** order  
   • Backed by Red-Black tree  
   • O(log n) time for add, remove, contains  
   • Does NOT allow null elements  
   • Implements NavigableSet

4. **EnumSet**
   • High-performance set for enum types  
   • All elements must be of a single enum type  
   • Backed by bit vectors  
   • Not thread-safe but very efficient

5. **CopyOnWriteArraySet** (java.util.concurrent)
   • Thread-safe  
   • Backed by CopyOnWriteArrayList  
   • Best for sets with more reads than writes

# Key Set Methods
---------------------------------
boolean add(E e)             // adds element if not already present  
boolean remove(Object o)     // removes element if present  
boolean contains(Object o)   // checks if element exists  
int size()                   // returns number of elements  
boolean isEmpty()            // checks if empty  
void clear()                 // removes all elements  
Iterator<E> iterator()       // used for traversal

# Example: HashSet
---------------------------------
Set<String> set = new HashSet<>();
set.add("A");
set.add("B");
set.add("A");               // Duplicate, ignored
System.out.println(set);    // Output: [A, B] (order not guaranteed)
set.remove("B");

# Example: TreeSet
---------------------------------
Set<Integer> sortedSet = new TreeSet<>();
sortedSet.add(30);
sortedSet.add(10);
sortedSet.add(20);
System.out.println(sortedSet);  // Output: [10, 20, 30]

# Example: LinkedHashSet
---------------------------------
Set<String> linkedSet = new LinkedHashSet<>();
linkedSet.add("X");
linkedSet.add("Y");
linkedSet.add("Z");
System.out.println(linkedSet);  // Output: [X, Y, Z] (insertion order)

# Performance Tips
---------------------------------
- Use **HashSet** for general-purpose, fast lookups.
- Use **LinkedHashSet** when you need predictable iteration order.
- Use **TreeSet** when you need **sorted** data (natural or custom comparator).
- Use **EnumSet** for enums → fastest & most memory-efficient.

# Common Pitfalls
---------------------------------
- **TreeSet does not allow null** (throws NullPointerException).
- HashSet iteration order is **unpredictable**.
- Modifying a set during iteration → use Iterator’s `remove()` to avoid `ConcurrentModificationException`.

# Useful Utilities
---------------------------------
- `Collections.unmodifiableSet(set)`  // read-only wrapper  
- `Set.copyOf(set)` (Java 10+)       // immutable copy  
- `Set.of(...)` (Java 9+)            // immutable fixed-size set  
- `retainAll()`, `removeAll()`, `containsAll()` → bulk operations

# Set vs List
---------------------------------
- Set → no duplicates, unordered (mostly), no indexed access  
- List → allows duplicates, maintains order, indexed access

====================================
   End of Java Set Cheat Sheet
====================================
*/
