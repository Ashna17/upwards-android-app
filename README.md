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
2. Import Project
3. Set sdk directory in local.properties in Gradle Scripts.
3. Modify Manifest
4. build.gradle implementations (recyclerview, volley)
5. Sync and build


## Java Classes
1. Item.java
2. RecyclerListAdapter
3. Main Activty 

## Screenshots
