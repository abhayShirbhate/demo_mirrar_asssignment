# **NASA APOD Viewer App**

The NASA APOD (Astronomy Picture of the Day) Viewer is an Android app that allows users to explore stunning images and videos related to astronomy from NASA's vast collection.

## Features

- View the Astronomy Picture of the Day along with its explanation.
- Play astronomy-related videos.
- Refresh button to fetch a new random APOD.
- Loading progress indicator.
- Local database caching for offline use.

## Getting Started

To get started with this project, follow these steps:

### Prerequisites

- Android Studio: Make sure you have Android Studio installed on your development machine.
- NASA API Key: You'll need a NASA API key to access their data. You can obtain a key by signing up at https://api.nasa.gov/

### Installation

-  Clone the project repository to your local machine:

   ```bash
   git clone https://github.com/abhayShirbhate/demo_mirrar_asssignment.git

## Generating NASA API Key

-  Visit the NASA API website at [https://api.nasa.gov/](https://api.nasa.gov/).

- Create an account and log in.

- Generate a new API key and give it a name or description.

- Copy the generated API key to your clipboard.
- 
-  Open the `gradle.properties` file and add your API key like this:

- apiKey=YOUR_API_KEY_HERE

- Replace `YOUR_API_KEY_HERE` with your actual API key.

## Getting Started

To get started with this project, follow these steps:

### Prerequisites

- Android Studio: Make sure you have Android Studio installed on your development machine.
- NASA API Key: You'll need a NASA API key to access their data. You can obtain a key by signing up at [NASA API Portal](https://api.nasa.gov/).

### Installation

1. Clone the project repository to your local machine:

   ```bash
   git clone https://github.com/abhayShirbhate/demo_mirrar_asssignment.git

- Open the project in Android Studio.

- Add your NASA API key to the project:

- Open the NasaApiClient.kt file.
- Replace const val API_KEY = "YOUR_API_KEY" with your actual NASA API key.
- Build and run the project on an Android emulator or physical device.

### Code Overview

- activity_main.xml: XML layout file for the main activity, defining the UI components and their bindings.
  
- MainActivity: The main activity of the app. It initializes the ViewModel, sets up data binding, and handles menu actions.

- MainViewModel: ViewModel that holds the app's UI logic, communicates with the repository, and manages LiveData for UI updates.

- NasaApiService: Retrofit interface for making API requests to NASA's APOD endpoint.

- NasaApiClient: Singleton class for creating the Retrofit instance and initializing the NasaApiService with the base URL.

- RepositoryImpl: Repository implementation responsible for fetching data from the NASA API and handling network-related errors.

- NasaApodRoomRepository: Repository for handling local database operations using Room for caching data.


### Usage
- Upon launching the app, it fetches a random Astronomy Picture of the Day from NASA's API and displays it.
- You can click the refresh button in the app's menu to fetch a new random APOD.
- Videos can be played using the play button.
- The app also caches data locally for offline use.
