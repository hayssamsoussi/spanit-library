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
| `SpanString.BOLD`                | addStyled(text, SpanString.BOLD)                         |
| `SpanString.ITALIC`                 | addStyled(text, SpanString.ITALIC)                         |
| `SpanString.BOLD & Purple`              | addBoth(text, R.color.purple, SpanString.BOLD)                          |
| `SpanString.NEW_LINE`   | addStyled(text, SpanString.NEW_LINE)    |
| `SpanString.UNDER_LINE`             |  addStyled(text, SpanString.UNDER_LINE)                |
| `SpanString.STRIKE_THROUGH`             | addStyled(text, SpanString.STRIKE_THROUGH)           |
| `Red`                      | addColored(text, R.color.red)                                |

#### Step 2: Apply style(s)

## Example
```kotlin
TextView textView = (TextView) findViewById(R.id.textView);

String firstName = "John";
String middleName = "Smith";
String lastName = "Doe";

var c = SpanCollection(this)
        c.addColored(firstName, R.color.purple_200)
        c.addStyled(middleName, SpanString.STRIKE_THROUGH)
        c.addBoth(lastName, R.color.purple_700, SpanString.BOLD)

textView.setText(c.print());
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
