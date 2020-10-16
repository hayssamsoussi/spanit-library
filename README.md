# SpanIT Library
[![](https://jitpack.io/v/hayssamsoussi/spanit-library.svg)](https://jitpack.io/#hayssamsoussi/spanit-library)

This libary aims to simplify the creation of spannable string.

## Features
- [x] text color
- [x] text style (bold, italic, bold italic)
- [x] strikethrough
- [x] underline

## Installation
In your app level build.gradle :

```java
dependencies {
    implementation 'com.github.hayssamsoussi:spanit-library:1.0.2'
}
```
## Usage
#### Step 1: Match your target text(s)
| Style                       | Use                                     |
| -------------                | ----------------------------------------------- |
| `SpanString.BOLD`                | addStyledText(text, SpanString.BOLD)                         |
| `SpanString.ITALIC`                 | addStyledText(text, SpanString.ITALIC)                         |
| `SpanString.BOLD & Purple`              | addColoredStyledText(text, R.color.purple, SpanString.BOLD)                          |
| `SpanString.NEW_LINE`   | addStyledText(text, SpanString.NEW_LINE)    |
| `SpanString.UNDER_LINE`             |  addStyledText(text, SpanString.UNDER_LINE)                |
| `SpanString.STRIKE_THROUGH`             | addStyledText(text, SpanString.STRIKE_THROUGH)           |
| `Red`                      | addColoredText(text, R.color.red)                                |

#### Step 2: Apply style(s)

## Example
#### Kotlin
```kotlin
val firstName = "John";
val middleName = "Smith";
val lastName = "Doe";

var c = SpanCollection(this)
        c.addColoredText(firstName, R.color.red)
        c.addStyledText(middleName, SpanString.BOLD)
        c.addColoredStyledText(lastName, R.color.red, SpanString.ITALIC)

textView.text = c.toText();
```
#### Java
```java
String firstName = "John";
String middleName = "Smith";
String lastName = "Doe";

SpanCollection c = new SpanCollection(this);
        c.addColoredText(firstName, R.color.red);
        c.addStyledText(middleName, SpanString.BOLD);
        c.addColoredStyledText(lastName, R.red, SpanString.ITALIC);

textView.setText(c.toText());
```

## License
```
Copyright 2020 Hayssam Soussi

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
