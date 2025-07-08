# Quantum Bookstore

A simple Java-based console application simulating an online bookstore.

## 📚 Features

- Supports 3 types of books:
  - **Paper Book**: Physical books with stock, can be shipped.
  - **EBook**: Digital books sent via email.
  - **Showcase Book**: Demo books not for sale.

- Allows you to:
  - ✅ Add books to the inventory
  - ✅ Remove outdated books based on publish year
  - ✅ Buy books by ISBN (with shipping/email logic simulated)
  - ✅ Easily extend to support more book types

## 🧱 Project Structure

```text
QuantumBookstoreProject/
│
├── Book.java                  # Abstract class that defines the base for all books
├── PaperBook.java             # Inherits from Book; includes stock and shipping behavior
├── EBook.java                 # Inherits from Book; includes email delivery behavior
├── ShowcaseBook.java          # Inherits from Book; not for sale
│
├── QuantumBookstore.java      # Handles inventory management and buying logic
└── QuantumBookstoreFullTest.java # Main class with hardcoded tests and scenarios
