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
| Method                       | Description                                     |
| -------------                | ----------------------------------------------- |
| `first(text)`                | match first occurrence                          |
| `last(text)`                 | match last occurrence                           |
| `all(text)`                  | match all occurrences                           |
| `all()`                      | match whole text                                |
| `allStartWith(prefixs...)`   | match all occurrences with specified prefix(s)  |
| `range(from:to)`             | match text at specified position                |
| `ranges(ranges)`             | match all texts at specified positions          |
| `between(startText:endText)` | match text between two texts                    |

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
Copyright 2016 Jay Chang

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
