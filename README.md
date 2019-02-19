# upwards-android-app
## Android assignment for Upwards Fintech.
   The main features of this application demonstrate:
1. RecyclerView Lists
2. API Integration wiht pagination
3. Basic coding practices in Android including UI,Layouts and Widget(Button) functionality.

## Introduction

   In this Android App, we implement a REST API client that communicates with the Reference API: <https://www.datakick.org/api>. The Android Volley Library is used to data request to server.

   A successful request from API resturns a JSON Array which is loaded into a RecyclerView List. Each request returns 1 page (100 entried by default). The URL data String for each page request is as follows :
   "<https://www.datakick.org/api/items?page=>" + "page_no".

   A (Next)button implemeted at the bottom of the View, loads more data from the API when clicked.

 ## Requirements and Settings
1. Android Studio 3.3.1
2. compileSdkVersion 27
3. minSdkVersion 16
4. targetSdkVersion 27



## Getting Started
1. Clone repository from <https://github.com/Ashna17/upwards-android-app.git>
2. Import Project from Android Studio menu **File>New>Import Project**
3. Set sdk directory in local.properties in Gradle Scripts.
4. AndroidManifest.xml must include

      ```  <uses-permission android:name="android.permission.INTERNET"/>```     
5. Following dependecies in build.gradle must be implemented

      ```   implementation 'com.android.support:recyclerview-v7:27.1.1'```   
      ```implementation 'com.android.volley:volley:1.1.0'```  
6. Sync Now and Build


## Java Classes
1. Item.java: Objects of this model class hold the data items that will be displayed in the recycler view. It has a constructor and getters to set and obtain attribute values of items. Items that contain the attributes "brand_name","name" and "size" are only considered.
2. RecyclerListAdapter.java:  The adapter is the piece that will connect the data to the RecyclerView and determine the ViewHolder(s) which will need to be used to display that data. The view holder class ItemViewHolder is the object that represents each item in the collection and will be used to display it.
3. MainActivty.java: This Activity will be the screen that will display the RecyclerView and all of its containing data to the users. The loadData class in MainActivity communicates with the API and fetches the response.

## Screenshots

<img src="https://github.com/Ashna17/upwards-android-app/blob/master/RecyclerList.png" width="256" title="">
