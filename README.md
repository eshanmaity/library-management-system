# 📚 Library Management System

A **console-based Library Management System** developed in **Java** using **Object-Oriented Programming (OOP)** principles.

The application provides a simple way to manage a library's book collection, allowing users to add and manage books, search for books, borrow and return books, and view the current library inventory through a command-line interface.

## ✨ Features

* 📖 **Book Management** — Add and manage books in the library.
* 🔍 **Search Books** — Search for books in the library.
* 📚 **View Library** — Display the available books and their details.
* 📤 **Borrow Books** — Borrow books from the library.
* 📥 **Return Books** — Return previously borrowed books.
* ✅ **Availability Tracking** — Keeps track of whether a book is available or borrowed.
* 🖥️ **Console Interface** — Simple command-line based interaction.

## 🛠️ Technologies Used

* **Java**
* **Object-Oriented Programming (OOP)**
* **Java Collections**
* **Scanner** for user input
* **Console / Command-Line Interface**

## 🧠 Project Architecture

The project is structured around three main Java classes, each handling a specific responsibility.

| Class          | Responsibility                                                      |
| -------------- | ------------------------------------------------------------------- |
| `Main.java`    | Entry point of the application and handles user interaction         |
| `Book.java`    | Represents a book and stores its properties and availability status |
| `Library.java` | Manages the collection of books and handles library operations      |

### 🔄 Application Flow

```text
                    ┌──────────────┐
                    │     Main     │
                    │ User Input   │
                    └──────┬───────┘
                           │
                           ▼
                    ┌──────────────┐
                    │   Library    │
                    │              │
                    │ Add Books    │
                    │ Search Books │
                    │ Borrow Books │
                    │ Return Books │
                    └──────┬───────┘
                           │
                           ▼
                    ┌──────────────┐
                    │     Book     │
                    │              │
                    │ Title        │
                    │ Author       │
                    │ Availability │
                    └──────────────┘
```

## 📂 Project Structure

```text
library-management-system/
│
├── Main.java
├── Book.java
├── Library.java
│
├── .gitignore
├── .gitattributes
└── README.md
```

### `Main.java`

Acts as the entry point of the application and provides the console-based menu through which users interact with the library system.

### `Book.java`

Represents individual books and contains information such as the book's details and availability status.

### `Library.java`

Handles the library's collection of books and implements operations such as adding, searching, borrowing, and returning books.

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/eshanmaity/library-management-system.git
```

### 2. Navigate to the project

```bash
cd library-management-system
```

### 3. Compile the Java files

```bash
javac Main.java Book.java Library.java
```

### 4. Run the application

```bash
java Main
```

## 🧩 OOP Concepts Demonstrated

This project demonstrates fundamental Java and OOP concepts, including:

* **Classes and Objects**
* **Encapsulation**
* **Constructors**
* **Methods**
* **Object Composition**
* **Collections**
* **Separation of Responsibilities**

## 🎯 Project Purpose

This project was built to strengthen my understanding of **Java and Object-Oriented Programming** by implementing a practical library management system.

It provided hands-on practice with designing multiple interacting classes, managing collections of objects, handling user input, and implementing real-world operations such as borrowing and returning books.

## 🔮 Future Improvements

* 👤 Add user/member management
* 🔐 Add login and authentication
* 📅 Add borrowing and return dates
* ⏰ Add overdue and fine calculation
* 🔎 Add advanced book search and filtering
* 💾 Add database integration
* 📊 Add library statistics
* 🖥️ Add a graphical user interface

## 👨‍💻 Author

**Eshan Maity**

CSE Student | Developer | Learning & Building 🚀

---

⭐ If you found this project interesting, feel free to give the repository a star!
