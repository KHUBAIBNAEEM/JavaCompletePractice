/*
===============================
       Java Queue Notes
===============================

# Queue Interface (java.util.Queue)
- Follows **FIFO** (First-In-First-Out) order.
- It is a part of the Java Collections Framework.
- Extends the Collection interface.

# Common Implementations:
--------------------------------
1. LinkedList  (also implements Deque)
2. PriorityQueue (natural ordering or custom Comparator)
3. ArrayDeque (double-ended queue)

# Key Queue Methods:
--------------------------------
boolean add(E e)          --> Inserts element, throws exception if fails
boolean offer(E e)        --> Inserts element, returns false if fails

E remove()                --> Removes head, throws exception if queue is empty
E poll()                  --> Removes head, returns null if queue is empty

E element()               --> Retrieves head, throws exception if empty
E peek()                  --> Retrieves head, returns null if empty

# Example (LinkedList):
--------------------------------
Queue<String> q = new LinkedList<>();
q.add("A");
q.add("B");
q.offer("C");

System.out.println(q.peek());   // A
System.out.println(q.poll());   // A
System.out.println(q.remove()); // B

# PriorityQueue:
--------------------------------
- Orders elements based on natural order or custom comparator.
- Not thread-safe.

PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.add(10);
pq.add(5);
pq.add(20);

System.out.println(pq.poll());  // 5 (natural order)

# ArrayDeque (Deque interface):
--------------------------------
- Faster than Stack, LinkedList.
- Can add/remove from both ends.
- No null elements allowed.

Deque<String> dq = new ArrayDeque<>();
dq.addFirst("X");
dq.addLast("Y");
dq.removeFirst();  // X

# Important Notes:
--------------------------------
- Queue is **not** thread-safe by default.
- Use ConcurrentLinkedQueue for thread safety.
- BlockingQueue (java.util.concurrent) is used in multithreaded scenarios.

# BlockingQueue:
--------------------------------
- Supports operations that wait for queue to become non-empty/full.
- Common implementations: ArrayBlockingQueue, LinkedBlockingQueue.

*/

