# 📘 Day 26 — Lower Bound, Upper Bound & Occurrence in Sorted Array (Java)

![Language](https://img.shields.io/badge/Language-Java-orange?logo=java)
![DSA](https://img.shields.io/badge/Topic-Binary%20Search-blue)
![Status](https://img.shields.io/badge/Status-Completed-success)
![Learning](https://img.shields.io/badge/Series-Love%20Babbar-purple)

Welcome to **Day 26** of my Java DSA learning journey! 🚀

As part of the **Love Babbar DSA Series**, I practiced important binary search problems related to lower bound, upper bound, and finding the occurrence of an element in a sorted array.

The goal of this practice session was to strengthen my understanding of **Binary Search, array indices, and efficient searching techniques**.

---

## 📂 Programs Covered

| No. | File Name | Concept |
|:---:|---|---|
| 1 | `Lower bound.java` | Finding the Lower Bound |
| 2 | `upper Bound.java` | Finding the Upper Bound |
| 3 | `UpperLowerBound.java` | Understanding Lower and Upper Bound |
| 4 | `Occurence In Sorted Array.java` | Finding the Occurrence of an Element |

---

## 🧠 Concepts Learned

### 1. Lower Bound

The lower bound is the **first index where the array element is greater than or equal to the target**.

- If the target exists, it returns the index of its first occurrence.
- If the target does not exist, it returns the insertion position.
- If no such element exists, it returns `n`, where `n` is the array length.

**Example:**

```java
arr = {1, 2, 4, 4, 5, 7}
target = 4

Output: 2
```

### 2. Upper Bound

The upper bound is the **first index where the array element is strictly greater than the target**.

**Example:**

```java
arr = {1, 2, 4, 4, 5, 7}
target = 4

Output: 4
```

### 3. Lower Bound vs Upper Bound

| Feature | Lower Bound | Upper Bound |
|---|---|---|
| Condition | `arr[mid] >= target` | `arr[mid] > target` |
| Finds | First element ≥ target | First element > target |
| Duplicate values | First occurrence position | Position after last occurrence |
| Typical use | Insertion position | Counting occurrences |

### 4. Occurrence in a Sorted Array

Binary search can help find how many times a target appears in a sorted array.

For a target that exists:

```java
count = upperBound - lowerBound;
```

**Example:**

```java
arr = {1, 2, 4, 4, 4, 5, 7}
target = 4

Lower Bound = 2
Upper Bound = 5
Total Occurrences = 5 - 2 = 3
```

If the lower and upper bounds are equal, the target does not occur in the array.

---

## ⏱️ Time and Space Complexity

| Approach | Time Complexity | Auxiliary Space |
|---|---|---|
| Linear Search | `O(n)` | `O(1)` |
| Binary Search | `O(log n)` | `O(1)` |
| Count Using Two Binary Searches | `O(log n)` | `O(1)` |

*Note: These binary search complexities assume the array is already sorted. Sorting an unsorted array adds its own cost.*

---

## 🎯 Key Takeaways

- Understood the difference between lower bound and upper bound.
- Practiced binary search on sorted arrays.
- Learned how to handle duplicate elements.
- Understood how to calculate the frequency of a target using two binary searches.
- Improved my problem-solving skills in Java.

---

## 📈 Learning Progress

- [x] Lower Bound
- [x] Upper Bound
- [x] Combined Lower and Upper Bound
- [x] Occurrence in Sorted Array
- [x] Time and Space Complexity Analysis

---

## 🛠️ Technologies Used

- **Language:** Java
- **Core Concepts:** Arrays, Binary Search, Searching Algorithms
- **Learning Resource:** Love Babbar DSA Series

---

## 🔗 Connect With Me

- **GitHub:** [@Tushxr77](https://github.com/Tushxr77)
- **Java DSA Repository:** [Java DSA Series — Love Babbar](https://github.com/Tushxr77/Java-DSA-Series-Love-Babbar)

---

*“Consistency beats intensity. One day, one concept, one step closer to the goal.”* 💻🔥

**Day 26 completed — Keep learning, keep coding!**
