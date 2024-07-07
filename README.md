# Fetch Rewards Coding Exercise - Mobile

A native Android app written in Kotlin that retrieves and displays data from the Fetch Rewards API. The data is displayed in a sorted and filtered list based on the requirements.

Tested on Pixel 3a API 33

## Features

- Fetch data from the Fetch Rewards API
- Filter out items with blank or null names
- Sort items by `listId` and then by `name`
- Display the items in an easy-to-read list

## Installation

1. Clone the repository:

```bash
git clone https://github.com/arshakshan/Fetch-Rewards-Exercise
```
2. Open the project in Android Studio.

3. Sync the project with Gradle files.

4. Run the app on an emulator or physical device.

## Project Structure
- `Item`: Data class representing an item.
- `ApiService`: Interface defining the API endpoint.
- `RetrofitInstance`: Singleton object for Retrofit instance.
- `ItemRepository`: Repository class to handle data operations.
- `ItemViewModel`: ViewModel class to manage UI-related data.
- `ItemViewModelFactory`: Factory class to create an instance of ItemViewModel.
- `ItemAdapter`: Adapter class for the RecyclerView.
- `MainActivity`: Main activity class.

## Usage

The app fetches data from the API and displays it in a RecyclerView. Items are filtered to remove those with blank or null names and sorted by listId and then by name.

## Layout

```css
Fetch-Rewards-Exercise/
│
├── README.md
│
└── FetchApp/
    ├── app/
    │   ├── src/
    │   │   ├── main/
    │   │   │   ├── AndroidManifest.xml
    │   │   │   ├── java/
    │   │   │   │   └── com/
    │   │   │   │       └── example/
    │   │   │   │           └── fetchapp/
    │   │   │   │               ├── MainActivity.kt
    │   │   │   │               ├── ItemAdapter.kt
    │   │   │   │               ├── ItemViewModel.kt
    │   │   │   │               ├── ItemViewModelFactory.kt
    │   │   │   │               ├── ItemRepository.kt
    │   │   │   │               ├── ApiService.kt
    │   │   │   │               ├── RetrofitInstance.kt
    │   │   │   │               └── Item.kt
    │   │   │   ├── res/
    │   │   │   │   ├── layout/
    │   │   │   │   │   ├── activity_main.xml
    │   │   │   │   │   └── item_view.xml
    │   │   │   │   ├── mipmap-anydpi-v26/
    │   │   │   │   ├── mipmap-hdpi/
    │   │   │   │   ├── mipmap-mdpi/
    │   │   │   │   ├── mipmap-xhdpi/
    │   │   │   │   ├── mipmap-xxhdpi/
    │   │   │   │   └── mipmap-xxxhdpi/
    │   │   │   └── AndroidManifest.xml
    │   └── build.gradle
    ├── build.gradle
    └── settings.gradle
```