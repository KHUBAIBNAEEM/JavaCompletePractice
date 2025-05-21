/*
====================================
          Java Map Notes
====================================

# Map Interface (java.util.Map)
---------------------------------
- Stores **key-value pairs** (each key maps to one value).
- **Keys are unique**, but values can be duplicated.
- Cannot contain duplicate keys; a new key replaces the old mapping.
- Allows one **null key** and multiple **null values** (depends on implementation).

# Core Implementations
---------------------------------
1. **HashMap**
   • Backed by a hash table  
   • Allows one null key, multiple null values  
   • Constant-time performance (O(1)) for get/put/remove  
   • No ordering guarantees  
   • Not thread-safe

2. **LinkedHashMap**
   • Maintains **insertion order**  
   • Slightly slower than HashMap due to ordering  
   • Allows one null key  
   • Useful for predictable iteration

3. **TreeMap** (java.util.SortedMap)
   • Maintains keys in **sorted (natural or custom)** order  
   • Based on Red-Black tree  
   • O(log n) for get/put/remove  
   • Does **NOT allow null keys**  
   • Implements NavigableMap

4. **Hashtable**
   • Legacy class (thread-safe)  
   • **Does NOT allow null keys or values**  
   • Slower than HashMap  
   • Use ConcurrentHashMap for modern concurrent use

5. **EnumMap**
   • Keys must be of a single enum type  
   • High-performance and compact  
   • Does NOT allow null keys  
   • Allows null values

6. **ConcurrentHashMap** (java.util.concurrent)
   • Thread-safe and highly efficient  
   • Better than Hashtable for concurrent access  
   • Does **NOT allow null keys or values**

# Key Map Methods
---------------------------------
V put(K key, V value)           // inserts or updates mapping  
V get(Object key)               // returns value for key, or null  
V remove(Object key)            // removes mapping for key  
boolean containsKey(Object key) // checks if key exists  
boolean containsValue(Object v) // checks if value exists  
int size()                      // number of key-value pairs  
boolean isEmpty()               // checks if empty  
void clear()                    // removes all mappings  
Set<K> keySet()                 // returns all keys  
Collection<V> values()          // returns all values  
Set<Map.Entry<K, V>> entrySet() // returns key-value pairs  

# Example: HashMap
---------------------------------
Map<String, Integer> map = new HashMap<>();
map.put("A", 1);
map.put("B", 2);
map.put("A", 3);                // Overwrites value for key "A"
System.out.println(map);       // Output: {A=3, B=2} (order not guaranteed)

# Example: TreeMap
---------------------------------
Map<Integer, String> sortedMap = new TreeMap<>();
sortedMap.put(30, "C");
sortedMap.put(10, "A");
sortedMap.put(20, "B");
System.out.println(sortedMap); // Output: {10=A, 20=B, 30=C}

# Example: LinkedHashMap
---------------------------------
Map<String, String> linkedMap = new LinkedHashMap<>();
linkedMap.put("X", "1");
linkedMap.put("Y", "2");
linkedMap.put("Z", "3");
System.out.println(linkedMap); // Output: {X=1, Y=2, Z=3} (insertion order)

# Performance Tips
---------------------------------
- Use **HashMap** for general-purpose fast access.
- Use **LinkedHashMap** for predictable iteration order.
- Use **TreeMap** when you need sorted keys.
- Use **EnumMap** when keys are enums → fastest and most memory-efficient.
- Use **ConcurrentHashMap** for thread-safe access.

# Common Pitfalls
---------------------------------
- **TreeMap does not allow null keys** (NullPointerException).
- Hashtable and ConcurrentHashMap disallow **null keys/values**.
- Iterating and modifying map simultaneously → use `Iterator.remove()` or `ConcurrentHashMap`.

# Useful Utilities
---------------------------------
- `Collections.unmodifiableMap(map)`  // read-only wrapper  
- `Map.copyOf(map)` (Java 10+)       // immutable copy  
- `Map.of(...)` (Java 9+)            // immutable, fixed-size map  
- `compute()`, `merge()`, `putIfAbsent()` → functional helpers  

# Map vs Set vs List
---------------------------------
- Map → key-value pairs, unique keys  
- Set → unique elements, no key-value mapping  
- List → ordered, allows duplicates, indexed access

====================================
   End of Java Map Cheat Sheet
====================================
*/
