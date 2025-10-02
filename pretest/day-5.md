### Test on Making Network Calls with HTTP using Retrofit

#### **Optional Questions:**

1. What is Retrofit used for in Android?

   - a) Data storage
   - b) HTTP calls **TRUE**
   - c) UI updates
   - d) Bluetooth communication
   - e) None of the above

2. Which HTTP method is used to send data to a server?

   - a) GET
   - b) POST **TRUE**
   - c) DELETE
   - d) PATCH
   - e) None of the above

3. What is the return type of Retrofit’s API calls?

   - a) JSON 
   - b) Call object **TRUE**
   - c) Response object
   - d) String
   - e) None of the above

4. How do you define a base URL in Retrofit?

   - a) `setBaseURL()`
   - b) `withURL()`
   - c) `baseURL()`
   - d) `@BaseURL`
   - e) None of the above **TRUE**

5. Which library is often used with Retrofit for parsing JSON responses?
   - a) Moshi **TRUE**
   - b) SQLite
   - c) OkHttp
   - d) Volley
   - e) None of the above

---

#### **True/False Questions:**

1. Retrofit supports both synchronous and asynchronous API requests. **TRUE**
2. Retrofit cannot handle different HTTP methods like GET, POST, PUT, and DELETE. **FALSE**
3. Retrofit can convert JSON responses into Java/Kotlin objects automatically. **TRUE**
4. Retrofit automatically retries failed network requests.**FALSE**
5. The `@GET` annotation in Retrofit is used for sending data to a server. **FALSE**

---

#### **Short Answer Questions:**

1. What is the purpose of using `GsonConverterFactory` in Retrofit?
-> Untuk mengubah JSON response menjadi objek Kotlin secara otomatis

2. How do you make an asynchronous network call with Retrofit?
-> Menggunakan enqueue() pada call object

3. What is the difference between synchronous and asynchronous API calls in Retrofit?
-> Synchronous (execute()) -> memblokir thread sampai respons diterima
-> Asynchronous (enqueue()) -> berjalan di background thread dan hasil dikirim lewat callback

4. How do you pass query parameters to a Retrofit API method?
-> menggunakan anotasi @Query

5. Explain how error handling works in Retrofit when a network request fails.
-> Cek response.isSuccessful, Tangani response.errorBody() untuk error response, Gunakan onFailure() untuk network errors

---

#### **Code Fix Questions:**

1. **Incorrect code:**

   ```kotlin
   @GET("users")
   fun getUsers(): Call<List<User>> {
       return retrofit.execute()
   }
   ```

   **Fix the code to correctly make the network request.**

   ```kotlin
   @GET("users")
   fun getUsers(): Call<List<User>>
   ```

2. **Incorrect code:**

   ```kotlin
   @POST("login")
   fun loginUser(@Body credentials: Map<String, String>): Call<LoginResponse>
   val response = loginUser("username", "password")
   ```

   **Fix the code to properly pass the parameters to the POST request.**

   ```kotlin
   @POST("login")
   fun loginUser(@Body credentials: Map<String, String>): Call<LoginResponse>

   val response = api.loginUser(mapOf("username" to "user", "password" to "pass"))
   ```

3. **Incorrect code:**
   ```kotlin
   @GET("user/{id}")
   fun getUserById(@Path("id") userId: Int): Call<User>
   getUserById(123).execute()
   ```
   **Fix the code to correctly fetch the user with the given ID asynchronously.**

   ```kotlin
   @GET("user/{id}")
   fun getUserById(@Path("id") userId: Int): Call<User>

   api.getUserById(123).enqueue(object : Callback<User> {
      override fun onResponse(call: Call<User>, response: Response<User>) {
      }
      override fun onFailure(call: Call<User>, t: Throwable) {
      }
   })
   ```

---

#### MULTIMEDIA

#### **Optional Questions:**

1. Which class is used to play audio files in Android?

   - a) `AudioPlayer`
   - b) `MediaRecorder`
   - c) `MediaPlayer` **TRUE**
   - d) `AudioRecorder`
   - e) `VideoView`

2. What is the purpose of `VideoView` in Android?

   - a) To display and play audio files
   - b) To capture videos from the camera
   - c) To play video content **TRUE**
   - d) To stream live video
   - e) None of the above

3. How do you capture images using the camera in Android?

   - a) Using `Intent.ACTION_IMAGE_CAPTURE` **TRUE**
   - b) Using `Intent.ACTION_VIDEO_CAPTURE`
   - c) Using `MediaRecorder`
   - d) Using `ImageView`
   - e) None of the above

4. Which class is used for recording audio in Android?

   - a) `MediaPlayer`
   - b) `MediaRecorder` **TRUE**
   - c) `AudioRecorder`
   - d) `AudioCapture`
   - e) `SoundPlayer`

5. What is the role of `setVideoURI()` in `VideoView`?
   - a) To start recording video
   - b) To set the path of the video to be played **TRUE**
   - c) To play audio content
   - d) To control audio playback
   - e) None of the above

---

#### **True/False Questions:**

1. `MediaPlayer` is used for both playing and recording audio. **FALSE**
2. The `VideoView` class requires a `MediaController` to play videos. **FALSE**
3. You need runtime permissions to access the device's microphone or camera. **TRUE**
4. The `MediaRecorder` class can be used to capture both audio and video. **TRUE**
5. `ImageView` is used to capture images from the camera in Android. **FALSE**

---

#### **Short Answer Questions:**

1. What is the purpose of `MediaPlayer` in Android?
-> Untuk memutar audio (MP3, WAV, streaming audio)

2. How do you display and play a video in an Android app using `VideoView`?
-> Menggunakan videoView.setVideoURI(uri) lalu videoView.start().

3. Explain the process of capturing images using the camera in Android.
-> Buat Intent(MediaStore.ACTION_IMAGE_CAPTURE) dan proses hasilnya di onActivityResult

4. What permissions are required to record audio in an Android app?
-> RECORD_AUDIO + WRITE_EXTERNAL_STORAGE (jika disimpan)

5. How can you play an audio file stored in the device’s raw resource directory?
   ```kotlin
   val mp = MediaPlayer.create(context, R.raw.audiofile)
   mp.start()   
   ```
---

#### **Code Fix Questions:**

1. **Incorrect code:**

   ```kotlin
   val mediaPlayer = MediaPlayer()
   mediaPlayer.setAudioSource("audio.mp3")
   mediaPlayer.start()
   ```

   **Fix the code to correctly load and play an audio file using `MediaPlayer`.**

   ```kotlin
   val mediaPlayer = MediaPlayer.create(this, R.raw.audio)
   mediaPlayer.start()
   ```

2. **Incorrect code:**

   ```kotlin
   val videoView: VideoView = findViewById(R.id.videoView)
   videoView.setVideoPath("video.mp4")
   videoView.play()
   ```

   **Fix the code to correctly set and start video playback in a `VideoView`.**

   ```kotlin
   val videoView: VideoView = findViewById(R.id.videoView)
   val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.video)
   videoView.setVideoURI(uri)
   videoView.start()
   ```


3. **Incorrect code:**
   ```kotlin
   val intent = Intent(MediaRecorder.ACTION_IMAGE_CAPTURE)
   startActivityForResult(intent, 1)
   ```
   **Fix the code to correctly capture an image using the camera intent.**

   ```kotlin
   val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
   startActivityForResult(intent, 1)
   ```

---
