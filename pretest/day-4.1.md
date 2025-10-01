#### **Optional Questions:**

1. What is the purpose of Shared Preferences in Android?

   - a) To store large amounts of data in a relational format.
   - b) To store small key-value pairs for user preferences or settings. **TRUE**
   - c) To store large media files like images and videos.
   - d) To interact with external databases.
   - e) None of the above.

2. Which method is used to save data in Shared Preferences?

   - a) `apply()` **TRUE**
   - b) `savePreferences()`
   - c) `writePreferences()`
   - d) `store()`
   - e) `commit()`

3. How can you remove a specific key from Shared Preferences?

   - a) `clearKey()`
   - b) `remove()` **TRUE**
   - c) `deleteKey()`
   - d) `deletePreference()`
   - e) `removeKey()`

4. Where is data stored when using Shared Preferences?

   - a) External storage
   - b) Internal storage in XML format **TRUE**
   - c) SQLite database
   - d) In-memory cache
   - e) Cloud storage

5. What data types can be stored in Shared Preferences?
   - a) `String`, `int`, `boolean`
   - b) `String`, `int`, `ArrayList`
   - c) `String`, `int`, `boolean`, `ArrayList`
   - d) `String`, `int`, `float`, `boolean`, `Set<String>` **TRUE**
   - e) `String`, `float`, `JSONArray`

---

#### **True/False Questions:**

1. Shared Preferences can be used to store complex objects like lists or JSON data. **FALSE**
2. Data saved in Shared Preferences is lost when the app is closed. **FALSE**
3. `apply()` saves data asynchronously, while `commit()` saves it synchronously. **TRUE**
4. Shared Preferences can store large amounts of data such as images or videos. **FALSE**
5. You can access Shared Preferences from multiple activities in an Android app. **TRUE**

---

#### **Short Answer Questions:**

1. What is the difference between `apply()` and `commit()` in Shared Preferences?
-> apply() asynchonous, tidak akan mengembalikan nilai apapun
-> commit() synchonous, akan mengembalikan nilai boolean jika berhasil ataupun gagal

2. How would you store a user's login status (true/false) using Shared Preferences in Android?

   ```kotlin
   val sharedPref = getSharedPreferences("UserPrefs", Context.MODE_PRIVATE)
   val editor = sharedPref.edit()
   editor.putBoolean("isLoggedIn", true)
   editor.apply()
   ```

3. How can you read data from Shared Preferences in Android?

   ```kotlin
   val sharedPref = getSharedPreferences("UserPrefs", Context.MODE_PRIVATE)
   val isLoggedIn = sharedPref.getBoolean("isLoggedIn", false)
   ```

4. What are the advantages of using Shared Preferences over other storage options for small amounts of data?
-> dapat digunakan di page mana saja, lebih ringan dan cepat, mudah untuk digunakan untuk settings/flags

5. Can you modify Shared Preferences from multiple threads? Explain your answer.
-> ya karena SharedPreferences synchronized secara internal, tetapi disarankan pakai apply() agar non-blocking.

---

#### **Code Fix Questions:**

1. **Incorrect code:**

   ```kotlin
   val sharedPref = getSharedPreferences("UserPrefs", Context.MODE_PRIVATE)
   val editor = sharedPref.edit()
   editor.putValue("username", "JohnDoe")
   editor.apply()
   ```

   **Fix the code to store the correct data.**

   ```kotlin
   val sharedPref = getSharedPreferences("UserPrefs", Context.MODE_PRIVATE)
   val editor = sharedPref.edit()
   editor.putString("username", "JohnDoe")
   editor.apply()
   ```

2. **Incorrect code:**

   ```kotlin
   val sharedPref = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
   val username = sharedPref.getValue("username", "defaultName")
   ```

   **Fix the code and explain the correct method to read from Shared Preferences.**

   ```kotlin
   val sharedPref = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
   val username = sharedPref.getString("username", "defaultName")

   ```

3. **Incorrect code:**
   ```kotlin
   val editor = sharedPref.edit()
   editor.clear("key")
   editor.commit()
   ```
   **Fix the code to properly remove a key from Shared Preferences.**

   ```kotlin
   val editor = sharedPref.edit()
   editor.remove("key")
   editor.commit()
   ```
---
