#### **Optional (Choose the correct answer):**

1. Which of the following creates an immutable list in Kotlin?

   - a) `arrayOf(1, 2, 3)`
   - b) `listOf(1, 2, 3)`
   - c) `mutableListOf(1, 2, 3)` **TRUE**
   - d) `setOf(1, 2, 3)`

2. What is the purpose of a coroutine in Kotlin?

   - a) To manage multiple threads
   - b) To handle asynchronous programming efficiently **TRUE**
   - c) To suspend functions indefinitely
   - d) To manage Android lifecycle events

3. Which activity lifecycle method is called when the activity is visible but not yet interactive?

   - a) `onCreate()`
   - b) `onResume()`
   - c) `onStart()` **TRUE**
   - d) `onPause()`

4. In Android UI, which ViewGroup arranges its children in a single direction (either horizontal or vertical)?

   - a) `RelativeLayout`
   - b) `ConstraintLayout`
   - c) `LinearLayout` **TRUE**
   - d) `FrameLayout`

5. What keyword is used to define a suspending function in Kotlin?
   - a) `async`
   - b) `launch`
   - c) `suspend` **TRUE**
   - d) `defer`

---

#### **Short Answer:**

6. What is the difference between `listOf()` and `mutableListOf()` in Kotlin?
-> listOf() tidak dapat menambahkan data atau mengubah data (Read Only)
-> mutableListOf() dapat menambahkan data dan mengubah data (Read and Write)

7. How does `onDestroy()` differ from `onStop()` in the Android activity lifecycle?
-> onDestroy() akan benar benar menghapus aktivitas yang dilakukan
-> onStop() hanya memberhentikan dan aktivitas akan tetap di simpan dan bisa di lanjutkan atau resume kembali

8. What is the advantage of using coroutines over threads in Kotlin?
-> lebih ringan dari sisi memori, dapat melaksanakan eksekusi tanpa harus menunggu salah satu eksekusi selesai dahulu

9. How can you prevent memory leaks in Android when handling configuration changes like screen rotation?
-> menggunakan ViewModel + LiveData untuk data UI

10. Explain the difference between `View` and `ViewGroup` in Android.
-> view adalah elemen tunggal seperti tombol, label, dll
-> viewGroup adalah sebuah kotak yang menampung banyak elemen

11. How does a `RecyclerView` differ from a `ListView` in Android UI components?
-> ListView adalah komponen untuk menampilkan list yang dapat di scroll
-> RecyclerView adalah versi modern dari ListView yang lebih efficient, dan flexible

12. What is the role of `onResume()` in the Android lifecycle?
-> onResume() adalah entry point untuk membuat sebuah aktivitas menjadi interaktif, melanjutkan UI update, dll sehingga dapat berinteraksi dengan user

13. What is the purpose of `launch` in Kotlin coroutines?
-> untuk memulai coroutine yang baru tanpa memblok aktifitas yang sedang berjalan

14. What is `LiveData` in Android, and why is it useful?
-> LiveData adalah penampung data yang dapat diamati (observable) dan sadar terhadap lifecycle di Android

15. What is the `ViewModel` class used for in Android?
-> ViewModel untuk menyimpan dan mengelola data yang terkait dengan UI, dan memisahkan logika UI dari controller


---

#### **Yes/No Questions:**

16. Can `setOf()` store duplicate elements in Kotlin? **NO**

17. Is it possible to use coroutines with Android’s lifecycle-aware components like `LiveData`? **YES**

18. Does the Android `onCreate()` method get called every time an activity becomes visible? **NO**

19. Can a `ConstraintLayout` position elements relative to each other in Android? **YES**

20. Are `RecyclerView` and `SwipeRefreshLayout` both advanced Android UI components? **YES**

---

#### **Correct the Code (with Reasons for Correction):**

21. **Incorrect code:**
    ```kotlin
    val myList = listOf(1, 2, 3)
    myList.add(4)
    ```
    **Corrected code**

    ```kotlin
    val myList = mutableListOf(1, 2, 3)
    myList.add(4)
    ```

---

22. **Incorrect code:**
    ```kotlin
    fun myCoroutine() {
        delay(1000L)
        println("Coroutine executed")
    }
    ```
    **Corrected code**

    ```kotlin
    suspend fun myCoroutine() {
        delay(1000L)
        println("Coroutine executed")
    }
    ```

---

23. **Incorrect code:**
    ```kotlin
    override fun onCreate() {
        super.onCreate()
        setContentView(R.layout.activity_main)
    }
    ```
    **Corrected code**

    ```kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    ```

---

24. **Incorrect code:**
    ```kotlin
    val map = mapOf(1 to "One", 2 to "Two")
    map[3] = "Three"
    ```

    **Corrected code**

    ```kotlin
    val map = mutableMapOf(1 to "One", 2 to "Two")
    map[3] = "Three"
    ```

---

25. **Incorrect code:**
    ```kotlin
    val view = findViewById<Button>(R.id.button)
    view.setOnClickListener {
        Log.d("Click", "Button clicked")
    }
    ```

    **Corrected code**

    ```kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = findViewById<Button>(R.id.button)
        view.setOnClickListener {
            Log.d("Click", "Button clicked")
        }
    }
    ```
---

### **Story-based Question (with Failed Code)**

#### **Story:**

You are developing an Android app for managing tasks. Each task has a title and a description. The app should allow users to add tasks and display the list of tasks in a `RecyclerView`. However, the app crashes when you try to display the list of tasks.

Here’s the failed code:

```kotlin
class TaskAdapter(private val taskList: List<Task>) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.taskTitle)
        val descriptionTextView: TextView = itemView.findViewById(R.id.taskDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.task_item, parent, false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = taskList[position]
        holder.itemView.findViewById<TextView>(R.id.taskTitle).text = task.title
        holder.itemView.findViewById<TextView>(R.id.taskDescription).text = task.description
    }

    override fun getItemCount() = taskList.size
}

data class Task(val title: String, val description: String)
```

---
