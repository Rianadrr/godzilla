### **Instructions:**

- For **optional questions**, select the correct answer.
- For **short answer questions**, provide a concise response.
- For **yes/no questions**, simply answer “yes” or “no.”
- For **correct-the-code questions**, review the provided code snippet, identify the mistake, and write the corrected version.

---

### **Pretest + Posttest Questions**

#### **Optional (Choose the correct answer):**

1. Which of the following is the correct way to declare a variable in Kotlin?

   - a) `var x = 10` **TRUE**
   - b) `let x = 10`
   - c) `dim x as 10`
   - d) `declare x = 10`

2. What keyword is used to declare a constant in Kotlin?

   - a) `let`
   - b) `const`
   - c) `final`
   - d) `val` **TRUE**

3. How do you define a function in Kotlin?

   - a) `function myFunction() {}`
   - b) `def myFunction() {}`
   - c) `fun myFunction() {}` **TRUE**
   - d) `lambda myFunction() {}`

4. What is the result of `5 % 2` in Kotlin?

   - a) `2.5`
   - b) `1` **TRUE**
   - c) `0`
   - d) `5`

5. Which data type in Kotlin represents a true or false value?
   - a) `Int`
   - b) `String`
   - c) `Boolean` **TRUE**
   - d) `Float`

---

#### **Short Answer:**

6. What is the difference between `var` and `val` in Kotlin?
```bash
`var` merupakan variabel yang valuenya yang dapat diubah
`val` merupakan variabel yang valuenya tidak dapat diubah
```

7. How do you create a list in Kotlin?

```bash
val namaVariabel: List<*tipe data> = listOf(value index 1, value index 2, ....)

val angka: List<Int> = listOf(1,2,3,4,5)
```

8. Write a simple `if-else` statement in Kotlin.

```bash
var isValid = true
    if (isValid)
        println("Ini Kondisi True")
    else
        println("Ini Kondisi False")
```

9. How do you handle nullability in Kotlin?
-> menggunakan ? jika variabel tersebut bisa null

```bash
var iniBisaKosong: String? = null
```

10. What is a lambda function in Kotlin?

```bash
{ } → menandakan blok lambda.
-> → memisahkan parameter dan body lambda.

val lambdaName: (parameter) -> ReturnType = { parameter: Type -> body }

```

11. How do you define a class in Kotlin?

```bash
class Car {
    var name: String = "Toyota Supra"
    var year: Int = 2000

    fun startEngine() {
        println("Car : $name Year : $year engine started!")
    }
}

```

12. How do you use a `for` loop to iterate through a list in Kotlin?

```bash
fun main() {

    # for-in
    val fruits1 = listOf("Apple", "Banana", "Orange")

    for (fruit in fruits1) {
        println(fruit)
    }

    # with index
    val fruits2 = listOf("Apple", "Banana", "Orange")

    for ((index, fruit) in fruits2.withIndex()) {
        println("Item at $index is $fruit")
    }
}

```

13. What does the `when` statement do in Kotlin?

```bash
# Seperti Switch
fun main() {
    val x = 2

    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        3, 4 -> println("x is 3 or 4") // multiple matches
        else -> println("x is something else")
    }
}
# Output = x is 2
```

14. How do you check if a number is even in Kotlin?

```bash
# Menggunakan %
fun main() {
    val number = 10

    if (number % 2 == 0) {
        println("$number is even")
    } else {
        println("$number is odd")
    }
}

```

15. How do you declare an array in Kotlin?

```bash
val namaVariable: Array<tipeData> = arrayOf(value, value,....)

fun main(){
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(numbers)
}

```

---

#### **Yes/No Questions:**

16. Can `val` be reassigned to a new value after its initial assignment? **NO**

17. Does Kotlin support operator overloading? **YES**

18. Is Kotlin fully interoperable with Java? **YES**

19. Can a function in Kotlin return a value using `return` keyword? **YES**

20. Can Kotlin's `when` statement be used as an expression to return values? **YES**

---

#### **Correct the Code (with Answers):**

21. **Incorrect code:**

    ```kotlin
    val x = "Hello"
    x = "World"
    ```

    - **Correction**:

    ```kotlin
    val x: String
    x = "World"
    ```

22. **Incorrect code:**

    ```kotlin
    fun sum(a: Int, b: Int): Int {
        return a + b
    sum(5, 10)
    ```

    - **Correction**:

    ```kotlin
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    val result = sum(5,10)
    ```

23. **Incorrect code:**

    ```kotlin
    val myList = listOf(1, 2, 3)
    myList.add(4)
    ```

    - **Correction**:

    ```kotlin
    val myList = mutableListOf(1, 2, 3)
    myList.add(4)
    ```

24. **Incorrect code:**

    ```kotlin
    val name: String = null
    ```

    - **Correction**:

    ```kotlin
    val name: String? = null
    ```

25. **Incorrect code:**

    ```kotlin
    if x > 5 {
        println("x is greater than 5")
    }
    ```

    - **Correction**:

    ```kotlin
    val x: Int = 9

    if x > 5 {
        println("x is greater than 5")
    }
    ```

26. **Incorrect code:**

    ```kotlin
    when (x) {
        1 -> println("One")
        2 -> println("Two")
        else println("Other")
    }
    ```

    - **Correction**:

    ```kotlin
    val x: Int = 1

    when (x) {
        1 -> println("One")
        2 -> println("Two")
        else println("Other")
    }
    ```

27. **Incorrect code:**

    ```kotlin
    fun greet() {
        println("Hello, $name)
    }
    ```

    - **Correction**:

    ```kotlin
    val name: String = "Asep"

    fun greet() {
        println("Hello, $name)
    }
    ```

28. **Incorrect code:**

    ```kotlin
    val myVar = "10"
    val result = myVar + 5
    ```

    - **Correction**:

    ```kotlin
    val myVar = "10"
    val result = myVar.toInt() + 5
    ```


29. **Incorrect code:**

    ```kotlin
    val numbers = arrayOf(1, 2, 3)
    println(numbers[3])
    ```

    - **Correction**:

    ```kotlin
    val numbers: Array<Int>= arrayOf(1, 2, 3)
    println(numbers[2])
    ```

30. **Incorrect code:**
    ```kotlin
    class Person(val name: String, val age: Int) {
        fun greet() {
            print("Hello, my name is " + name + " and I'm " + age)
        }
    }
    ```

    - **Correction**:

    ```kotlin
    class Person(val name: String, val age: Int) {
        fun greet() {
            println("Hello, my name is $name and I'm $age years old.")
        }
    }
    val person = Person("Rian", 22)
    person.greet()
    ```

---

### **Story-based Question (with Failed Code)**

#### **Story:**

Imagine you are building a ticket booking system for a movie theater. Each customer can reserve a seat by providing their name and the seat number. The seat numbers are stored in an array, and the program should check if the seat is available. If available, the seat will be reserved, and if not, a message will be displayed to the user that the seat is taken.

Here’s the failed code:

```kotlin
fun reserveSeat(name: String, seatNumber: Int) {
    val availableSeats = arrayOf(1, 2, 3, 4, 5)

    if (availableSeats.contains(seatNumber)) {
        availableSeats[seatNumber] = 0  // Mark the seat as reserved by setting it to 0
        println("$name reserved seat $seatNumber.")
    } else {
        println("Seat $seatNumber is already reserved.")
    }
}

fun main() {
    reserveSeat("John", 2)
    reserveSeat("Sarah", 2)
}
```

- **Correction**:

```kotlin
val availableSeats = mutableListOf(1, 2, 3, 4, 5)

fun reserveSeat(name: String, seatNumber: Int) {
    if (availableSeats.contains(seatNumber)) {
        availableSeats[availableSeats.indexOf(seatNumber)] = 0 // mark as reserved
        println("$name reserved seat $seatNumber.")
    } else {
        println("Seat $seatNumber is already reserved.")
    }
}

fun main() {
    reserveSeat("John", 2)
    reserveSeat("Sarah", 2)
}
```
