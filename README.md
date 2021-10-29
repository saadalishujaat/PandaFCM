# PandaFCM (Firebase Cloud Messaging)

PandaFCM is a Firebase Cloud Messaging Android app that demonstrates registering your Android app for notifications and handling the receipt of a message. InstanceID allows easy registration while FirebaseMessagingService and FirebaseInstanceIDService enable token refreshes and message handling on the client.

> Read more about [Firebase Cloud Messaging](https://firebase.google.com/docs/cloud-messaging).

## Getting Started

### Step 1

[Add firebase to your Android App](https://firebase.google.com/docs/android/setup).

#### Note: After complition of step one, your project should have a google-services.json file added to the root of your project along with the classpath, plugin and dependecies.

#### Classpath
```
    classpath 'com.google.gms:google-services:4.3.10'
```
#### Plugin
```
    id 'com.google.gms.google-services'
```
#### Dependencies
```
    implementation platform('com.google.firebase:firebase-bom:28.4.2')
    implementation 'com.google.firebase:firebase-messaging'
    implementation 'com.google.firebase:firebase-analytics' 
```


### Step 2

Add maven repository in project level build.gradle.
```
    repositories {
        google()
        mavenCentral()
        maven { url "https://jitpack.io" }
    }
```  


### Step 3

Add PandaFCM dependencies in App level build.gradle.
```
    dependencies {
        implementation 'com.github.saadalishujaat:FCMLib:v1.0' 
    }
```  


### Step 4

Finally intialize Firebase and setup FCM in application class or in your "MainActivity"
```
    FirebaseApp.initializeApp(this)
```
```
    PandaFCM.setupFCM(this, "YourTopicName")
```


### Remove

If you want to stop receiving notification from the subscribed topic simply call.
```
    PandaFCM.removeFCM("YourTopicName")
```

