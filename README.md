# Drawing with Java

This project draws basic shapes (points, lines, rectangles, triangles, circles) onto an image using Java.  
It demonstrates the use of custom interfaces (`Drawable`, `Displayable`) and object-oriented design.

## 📂 Project Structure
```

src/
│── geometrical_shapes/
│    ├── Circle.java
│    ├── Line.java
│    ├── Point.java
│    ├── Rectangle.java
│    └── Triangle.java
├── interfaces/
│    ├── Drawable.java
│    └── Displayable.java
├── utils/
│    ├── ColorUtils.java
│    └── Image.java
│── Main.java
└── Makefile

````

## 🚀 How to Run
1. Compile all sources:
   ```bash
   make build
   ```

2. Run the program:

   ```bash
   make run
   ```

3. The program will generate an image file:

   ```
   image.png
   ```

##  Features

* Draw points, lines, rectangles, triangles, circles
* Generate random circles
* Save result as `PNG` image
