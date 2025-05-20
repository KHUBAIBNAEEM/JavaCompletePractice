package List;

// Collection Frameworks arcs methodology pe kam kerte hain (add,remove,clear, size). Jiske pas ye methods hain wo collection hai ya banskta hai
// List eik collection hai jiske ander ArrayList, Vector, and LinkedList ajata hai
// ye eik ordered/sequestial collection pe kam kerta hai
// duplicate elements support kerta hai
// Can be accessed by index number
// Preferred over array jab size humein pta na ho yani dynamic ho
// Automatically size increase kerdeta hai and memory bhi
// Methods: add(), remove(), clear(), size(), 
// Collections k ander hum sirf objects rakhskte hai (wrapper ya object)**
// hum List ko kisi wrapper bina bhi define kerskte hain but wo object pakrega or kuch bhi String, int pakerlega

/*
====================================
          Java List Notes
====================================

# List Interface (java.util.List)
---------------------------------
- **Ordered** collection (maintains insertion order).
- Allows **index‑based** access (0‑based).
- Permits **duplicates**.
- Allows (one or more) **null** elements (except in some special implementations).

# Core Implementations
---------------------------------
1. **ArrayList**
   • Backed by a resizable array  
   • Fast random access (O(1) get/set)  
   • Slower inserts/removes in middle (O(n))  
   • Not thread‑safe

2. **LinkedList**
   • Doubly‑linked nodes  
   • Fast inserts/removes anywhere (O(1) for add/remove at ends; O(n) to locate index)  
   • Extra memory per node for links  
   • Also implements Deque

3. **Vector**
   • Legacy, synchronized (thread‑safe)  
   • Slower due to overhead; rarely used in new code  
   • Grows by 100% (capacity*2) unless specified otherwise

4. **Stack** (extends Vector)
   • Legacy LIFO stack (prefer Deque/ArrayDeque instead)

5. **CopyOnWriteArrayList** (java.util.concurrent)
   • Thread‑safe; writes copy entire backing array  
   • Great for frequent reads & infrequent writes

# Key List Methods
---------------------------------
boolean add(E e)               // append element  
void add(int index, E e)       // insert at index  
E get(int index)               // retrieve by index  
E set(int index, E e)          // replace & return old value  
E remove(int index)            // remove by index  
boolean remove(Object o)       // remove first occurrence  
int indexOf(Object o)          // first index or -1  
int lastIndexOf(Object o)      // last index or -1  
List<E> subList(int from, int to) // view (backed by original)

# Example: ArrayList
---------------------------------
List<String> list = new ArrayList<>();
list.add("A");
list.add("B");
list.add(1, "X");          // A, X, B
System.out.println(list.get(2));  // B
list.remove("A");          // X, B
list.set(0, "Y");          // Y, B

# Example: LinkedList as List & Deque
---------------------------------
LinkedList<Integer> ll = new LinkedList<>();
ll.addFirst(10);           // 10
ll.addLast(20);            // 10, 20
ll.add(1, 15);             // 10, 15, 20
System.out.println(ll.removeLast()); // 20

# Performance Tips
---------------------------------
- For **random access** → prefer **ArrayList**.  
- For frequent **insert/remove in middle** → prefer **LinkedList**.  
- Need **thread safety** without external sync → use **CopyOnWriteArrayList** or Collections.synchronizedList(list).

# Common Pitfalls
---------------------------------
- **ConcurrentModificationException** when structurally modifying during iteration (use Iterator’s remove() or ListIterator).  
- Autoboxing overhead with primitive wrappers (consider IntArrayList from fastutil if performance‑critical).  
- SubList is a **view** – structural changes to parent or sublist reflect in both; beware of cascading modifications.

# Useful Utilities
---------------------------------
- `Collections.unmodifiableList(list)`  // read‑only view  
- `Collections.sort(list)` or `list.sort(Comparator)`  
- `List.of(...)` (Java 9+)             // immutable fixed‑size list

====================================
   End of Java List Cheat Sheet
====================================
*/


import java.util.ArrayList;
import java.util.List;

public class ListIntro {
    public static void main(String[] args) {
        // List str = new List(); error dega kyunke interface hai List or uska object nhi banskta new kerke
        List <String> str = new ArrayList<String>(); // Arraylist eik concrete class hai 
        str.add("Khubaib");
        str.add("Shaham");
        str.add("Ali");
        System.out.println("The index of: " + str.get(0) + " is " + str.indexOf("Khubaib"));
        for (String strs : str){
            System.out.println(strs);
        }

    }
    
}
