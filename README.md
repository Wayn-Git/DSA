# Java DSA Mastery 🚀

A comprehensive resource for mastering Data Structures and Algorithms in Java. Perfect for interview preparation, competitive programming, and skill development.

## 🎯 What's Inside

**📚 Complete Learning Path**: From arrays to advanced graph algorithms  
**💻 Clean Java Code**: Well-commented implementations with complexity analysis  
**🎯 Interview Focus**: Top problems from FAANG companies  
**📊 Progress Tracking**: Built-in checklists to monitor your journey  
**🔗 Curated Resources**: Best books, courses, and practice platforms  

---

## 🗂️ Repository Structure (The Plan)

```
Java-DSA/
├── 📁 Data-Structures/
│   ├── Arrays/ (Two-pointer, Sliding window)
│   ├── LinkedLists/ (Singly, Doubly, Circular)
│   ├── Stacks-Queues/ (Implementation & applications)
│   ├── Trees/ (Binary trees, BST, traversals)
│   ├── Graphs/ (DFS, BFS, shortest paths)
│   └── Advanced/ (Tries, Segment trees, DSU)
├── 📁 Algorithms/
│   ├── Sorting/ (All major algorithms + analysis)
│   ├── Searching/ (Binary search variants)
│   ├── Dynamic-Programming/ (1D, 2D, optimization)
│   ├── Graph-Algorithms/ (Dijkstra, MST, topological)
│   └── Backtracking/ (N-Queens, Sudoku, permutations)
├── 📁 Practice-Problems/
│   ├── Easy/ (Foundation building - 50 problems)
│   ├── Medium/ (Interview level - 100 problems)
│   └── Hard/ (Advanced concepts - 50 problems)
├── 📁 Study-Materials/
│   ├── CheatSheets.md (Quick reference)
│   ├── TimeComplexity.md (Big-O analysis)
│   └── Patterns.md (Problem-solving templates)
└── 📁 Resources/
    ├── InterviewQuestions.md (FAANG problems)
    └── CompanyWiseProblems.md (Targeted preparation)
```

---

## 🚀 Quick Start

### 🆕 Complete Beginner
1. **Foundation**: Start with `Study-Materials/` for theory
2. **Practice**: Solve 5 problems daily from `Practice-Problems/Easy/`
3. **Implementation**: Code basic data structures from scratch
4. **Timeline**: 4-6 weeks to build solid foundation

### 🎯 Interview Preparation
1. **Assessment**: Take diagnostic test to identify gaps
2. **Focused Practice**: Use `Resources/CompanyWiseProblems.md`
3. **Mock Interviews**: Practice with timing constraints
4. **Timeline**: 8-12 weeks for comprehensive preparation

### 🏆 Competitive Programming
1. **Master Fundamentals**: Complete all data structures and algorithms
2. **Contest Practice**: Weekly participation on platforms
3. **Advanced Topics**: Focus on optimization and complex algorithms
4. **Timeline**: 6+ months for competitive level

---

## 📈 Learning Progress Tracker

### Core Data Structures (Complete these first)
- [ ] **Arrays & Strings** → Two-pointer, sliding window mastery
- [ ] **Linked Lists** → All variants + cycle detection
- [ ] **Stacks & Queues** → Expression evaluation, BFS/DFS prep
- [ ] **Trees** → All traversals + BST operations
- [ ] **Graphs** → DFS/BFS + basic algorithms
- [ ] **Heaps** → Priority queue + heap sort

### Essential Algorithms 
- [ ] **Sorting** → All O(n log n) algorithms
- [ ] **Binary Search** → All variants and applications
- [ ] **Dynamic Programming** → 1D and 2D problems
- [ ] **Graph Algorithms** → Shortest paths + MST
- [ ] **Backtracking** → Constraint satisfaction problems

### Problem-Solving Milestones
- [ ] **Foundation** (0-50): Easy problems across all topics
- [ ] **Proficiency** (51-150): Medium problems + pattern recognition
- [ ] **Mastery** (151+): Hard problems + optimization techniques

---

## 💡 Problem-Solving Strategy

### The UMPIRE Method
1. **🎯 Understand**: Read problem 2-3 times, identify constraints
2. **🔗 Match**: Connect to similar problems you've solved
3. **📝 Plan**: Write pseudocode, discuss time/space complexity
4. **⚡ Implement**: Code solution with clear variable names
5. **🔍 Review**: Test with examples, check edge cases
6. **📊 Evaluate**: Analyze complexity, consider optimizations

### Essential Code Templates
```java
// Binary Search
int left = 0, right = arr.length - 1;
while (left <= right) {
    int mid = left + (right - left) / 2;
    if (arr[mid] == target) return mid;
    else if (arr[mid] < target) left = mid + 1;
    else right = mid - 1;
}

// Tree DFS
void dfs(TreeNode node) {
    if (node == null) return;
    // Process current node
    dfs(node.left);
    dfs(node.right);
}

// Graph BFS
Queue<Integer> queue = new LinkedList<>();
boolean[] visited = new boolean[n];
queue.offer(start);
visited[start] = true;
while (!queue.isEmpty()) {
    int node = queue.poll();
    // Process node
    for (int neighbor : graph.get(node)) {
        if (!visited[neighbor]) {
            visited[neighbor] = true;
            queue.offer(neighbor);
        }
    }
}
```

---

## 🎓 Study Resources

### 🏆 Top Practice Platforms
| Platform | Best For | Difficulty | Cost |
|----------|----------|------------|------|
| [LeetCode](https://leetcode.com/) | Interview prep | All levels | Freemium |
| [HackerRank](https://www.hackerrank.com/) | Structured learning | Beginner-Advanced | Free |
| [Codeforces](https://codeforces.com/) | Competitive programming | Intermediate+ | Free |
| [GeeksforGeeks](https://www.geeksforgeeks.org/) | Comprehensive theory | All levels | Free |

### 📚 Essential Books
- **"Cracking the Coding Interview"** - Gayle McDowell (Interview prep)
- **"Algorithms"** - Robert Sedgewick (Java implementations)
- **"Introduction to Algorithms"** - CLRS (Comprehensive theory)
- **"Elements of Programming Interviews"** - Advanced problems

### 🎥 Top YouTube Channels
- **Abdul Bari** - Clear algorithm explanations
- **Back To Back SWE** - Interview-focused content
- **William Fiset** - Graph algorithms specialist
- **Tushar Roy** - Coding interview preparation

### 🔧 Development Tools
- **IDEs**: IntelliJ IDEA, VS Code with Java extensions
- **Visualization**: [Visualgo.net](https://visualgo.net/) for algorithm animations
- **Extensions**: LeetHub for auto-syncing solutions to GitHub

---

## 🎯 Interview Preparation

### Must-Know Problems (Top 25 for Interviews)
#### Arrays & Strings (8)
1. Two Sum / Three Sum
2. Maximum Subarray (Kadane's)
3. Merge Intervals
4. Longest Substring Without Repeating Characters
5. Container With Most Water
6. Product of Array Except Self
7. Valid Anagram
8. Minimum Window Substring

#### Trees & Graphs (8)
9. Binary Tree Level Order Traversal
10. Validate Binary Search Tree
11. Lowest Common Ancestor
12. Maximum Depth of Binary Tree
13. Number of Islands
14. Clone Graph
15. Course Schedule
16. Word Ladder

#### Dynamic Programming (5)
17. Climbing Stairs
18. Coin Change
19. Longest Increasing Subsequence
20. House Robber
21. Word Break

#### Linked Lists & Others (4)
22. Reverse Linked List
23. Merge Two Sorted Lists
24. Valid Parentheses
25. LRU Cache

### Company-Specific Focus
- **Google**: Graph algorithms, system design
- **Facebook/Meta**: Trees, dynamic programming
- **Amazon**: Arrays, strings, leadership principles
- **Microsoft**: Recursion, OOP design patterns
- **Apple**: Trees, design patterns

---

### Time Complexity Cheat Sheet
| Data Structure | Access | Search | Insertion | Deletion |
|---------------|--------|--------|-----------|----------|
| Array | O(1) | O(n) | O(n) | O(n) |
| Linked List | O(n) | O(n) | O(1) | O(1) |
| Stack | O(n) | O(n) | O(1) | O(1) |
| Queue | O(n) | O(n) | O(1) | O(1) |
| Hash Table | - | O(1) | O(1) | O(1) |
| Binary Search Tree | O(log n) | O(log n) | O(log n) | O(log n) |
| Heap | - | O(n) | O(log n) | O(log n) |

---

### Java Collections Framework Quick Reference
```java
// ArrayList - Dynamic array
List<Integer> list = new ArrayList<>();
list.add(element);           // O(1) amortized
list.get(index);            // O(1)
list.remove(index);         // O(n)

// LinkedList - Doubly linked list
List<Integer> linkedList = new LinkedList<>();
linkedList.addFirst(element);  // O(1)
linkedList.addLast(element);   // O(1)
linkedList.removeFirst();      // O(1)

// HashMap - Hash table
Map<String, Integer> map = new HashMap<>();
map.put(key, value);        // O(1) average
map.get(key);              // O(1) average
map.containsKey(key);      // O(1) average

// TreeMap - Red-black tree
Map<String, Integer> treeMap = new TreeMap<>();
treeMap.put(key, value);    // O(log n)
treeMap.get(key);          // O(log n)

// PriorityQueue - Min heap by default
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(element);          // O(log n)
pq.poll();                 // O(log n)
pq.peek();                 // O(1)

// HashSet - Hash table for unique elements
Set<Integer> set = new HashSet<>();
set.add(element);          // O(1) average
set.contains(element);     // O(1) average
set.remove(element);       // O(1) average

// TreeSet - Balanced BST for sorted unique elements
Set<Integer> treeSet = new TreeSet<>();
treeSet.add(element);      // O(log n)
treeSet.contains(element); // O(log n)
```
---

### Common Problem Patterns & Solutions
| Pattern | When to Use | Example Problems | Key Insight |
|---------|-------------|------------------|-------------|
| Two Pointers | Sorted array, palindromes | Two Sum, 3Sum, Container With Most Water | Use two pointers moving towards each other |
| Sliding Window | Subarray/substring problems | Max Sum Subarray, Longest Substring | Maintain window with specific property |
| Fast & Slow Pointers | Cycle detection, middle element | Linked List Cycle, Find Middle | Floyd's algorithm for cycle detection |
| Merge Intervals | Overlapping intervals | Merge Intervals, Meeting Rooms | Sort by start time, then merge |
| Cyclic Sort | Array with range 1 to n | Find Missing Number, First Missing Positive | Place each number at its correct index |
| Tree DFS | Tree traversal, path problems | Binary Tree Paths, Max Depth | Recursive traversal with backtracking |
| Tree BFS | Level-order, minimum depth | Level Order Traversal, Min Depth | Queue-based level-by-level processing |
| Trie | Prefix matching, word problems | Word Search II, Auto-complete | Tree structure for string prefixes |
| Topological Sort | Dependency resolution | Course Schedule, Alien Dictionary | DFS or BFS on directed acyclic graph |
| Union Find | Connected components | Number of Islands, Graph Valid Tree | Efficient set operations with path compression |

---

## 📅 Study Schedule

### 12-Week Interview Prep Plan
**Weeks 1-3: Foundation**
- Arrays, strings, basic math problems
- Linked lists, stacks, queues
- Basic tree operations and traversals

**Weeks 4-6: Core Algorithms**
- Sorting and searching algorithms
- Two pointers and sliding window
- Introduction to dynamic programming

**Weeks 7-9: Advanced Topics**
- Tree and graph algorithms
- Advanced dynamic programming
- Backtracking and recursion

**Weeks 10-12: Interview Practice**
- Company-specific problems
- Mock interviews and time management
- System design basics

### Daily Schedule (2 hours)
- **30 min**: Review and learn new concepts
- **75 min**: Solve 2-3 problems (mix of difficulties)
- **15 min**: Update progress and plan next day

---

## 🏆 Success Tips

### Mindset & Strategy
- **Start with understanding**, not memorizing solutions
- **Focus on patterns** rather than individual problems
- **Practice consistently** - 1 hour daily beats 7 hours once weekly
- **Explain your approach** out loud to build interview skills
- **Learn from mistakes** - review wrong answers thoroughly

### Common Pitfalls to Avoid
- Jumping to code without planning
- Ignoring edge cases (null, empty, single element)
- Not considering time/space constraints
- Over-optimizing before getting basic solution working
- Giving up too quickly on challenging problems

### Before Technical Interviews
- Review your top 50 solved problems
- Practice coding on whiteboard/paper
- Prepare behavioral stories using STAR method
- Get good sleep and manage stress
- Have backup plans for difficult problems

---

## ⭐ Support This Project

If this repository helps your DSA journey:
- **⭐ Star** the repo to show appreciation
- **🍴 Fork** it to create your customized version
- **📢 Share** with friends preparing for interviews
- **🐛 Report** issues to help improve content
- **💡 Suggest** new features or improvements

---


**🎯 Remember**: *Consistency beats intensity. Master one concept at a time, practice regularly, and stay persistent. Your future self will thank you!*

**Happy Coding! 🚀**

*"The expert in anything was once a beginner." - Helen Hayes*
