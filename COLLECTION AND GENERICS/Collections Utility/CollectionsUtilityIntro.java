/*
====================================
     Java Collections Utilities
====================================

# java.util.Collections Class
-----------------------------------------
• Utility class with static methods to operate on or return collections.
• Provides sorting, synchronization, unmodifiable wrappers, searching, and more.

# Unmodifiable Collections
-----------------------------------------
• Creates a read-only view (throws UnsupportedOperationException on modify)

List<String> list = Collections.unmodifiableList(new ArrayList<>());
Set<Integer> set = Collections.unmodifiableSet(new HashSet<>());
Map<String, String> map = Collections.unmodifiableMap(new HashMap<>());

# Singleton Collections
-----------------------------------------
• Creates a collection with only one element

List<String> singleList = Collections.singletonList("only");
Set<String> singleSet = Collections.singleton("only");
Map<String, Integer> singleMap = Collections.singletonMap("key", 1);

# Empty Collections
-----------------------------------------
• Returns immutable empty collections

List<String> emptyList = Collections.emptyList();
Set<String> emptySet = Collections.emptySet();
Map<String, String> emptyMap = Collections.emptyMap();

# Synchronized Collections
-----------------------------------------
• Thread-safe wrappers for collections

List<String> syncList = Collections.synchronizedList(new ArrayList<>());
Set<String> syncSet = Collections.synchronizedSet(new HashSet<>());
Map<String, String> syncMap = Collections.synchronizedMap(new HashMap<>());

# Sorting & Shuffling
-----------------------------------------
Collections.sort(list);                        // Sort list using natural order
Collections.sort(list, comparator);            // Custom sort
Collections.reverse(list);                     // Reverse order
Collections.shuffle(list);                     // Random shuffle
Collections.swap(list, i, j);                  // Swap elements

# Searching & Filling
-----------------------------------------
int index = Collections.binarySearch(list, "key");  // List must be sorted
Collections.fill(list, "X");                        // Replace all with "X"
boolean disjoint = Collections.disjoint(c1, c2);    // true if no common elements

# Frequency & Copying
-----------------------------------------
int count = Collections.frequency(list, "apple");     // Count occurrences
Collections.copy(destList, sourceList);               // destList must be same size

# Java 9+ Immutable Factories
-----------------------------------------
List<String> list = List.of("A", "B", "C");       // Immutable fixed-size list
Set<Integer> set = Set.of(1, 2, 3);               // Immutable set (no duplicates)
Map<String, String> map = Map.of("a", "x", "b", "y"); // Immutable map

# Java 10+ Copy Factories
-----------------------------------------
List<String> newList = List.copyOf(existingList);     // Immutable copy
Set<String> newSet = Set.copyOf(existingSet);         // Immutable copy
Map<String, String> newMap = Map.copyOf(existingMap); // Immutable copy

# Bulk Operations
-----------------------------------------
collection.addAll(otherCollection);
collection.removeAll(otherCollection);
collection.retainAll(otherCollection); // Intersection

# Other Handy Utilities
-----------------------------------------
Collections.nCopies(5, "X")        // Immutable list with 5 copies of "X"
Collections.reverseOrder()         // Comparator for reverse natural order
Collections.checkedList(list, String.class)  // Runtime type safety

====================================
   End of Collections Utilities
====================================
*/
