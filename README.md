# 🏦 Simple Banking Transaction System

A simple **console-based Banking Transaction System** developed using **Java**. This project allows users to create bank accounts, deposit money, withdraw money, check balances, and view transaction history.

## 📌 Features

* 🏦 Create a bank account
* 👤 Store account holder details
* 💰 Deposit money
* 💸 Withdraw money
* 💳 Check account balance
* 📜 View transaction history
* 🚫 Prevent duplicate account numbers
* ⚠️ Validate deposit and withdrawal amounts
* ❌ Prevent withdrawal when balance is insufficient
* 🖥️ Console-based interface

## 🛠️ Technologies Used

* **Java**
* **ArrayList**
* **Object-Oriented Programming (OOP)**
* **Encapsulation**
* **Scanner**
* **Java Collections**

## 📂 Project Structure

```text
simple-banking-transaction-system/
│
├── src/
│   ├── BankAccount.java
│   └── BankingSystem.java
│
└── README.md
```

## 📖 Class Description

### `BankAccount.java`

Represents a bank account and stores:

* Account number
* Account holder name
* Balance
* Transaction history

It provides methods for:

* Depositing money
* Withdrawing money
* Displaying account details
* Displaying transaction history

### `BankingSystem.java`

The main class of the application.

It handles:

* Creating accounts
* Finding accounts
* Depositing money
* Withdrawing money
* Checking balances
* Viewing transaction history

## ⚙️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/Afrin-D/simple-banking-transaction-system.git
```

### 2. Open the project

```bash
cd simple-banking-transaction-system
```

### 3. Go to the source folder

```bash
cd src
```

### 4. Compile the Java files

```bash
javac *.java
```

### 5. Run the application

```bash
java BankingSystem
```

## 🖥️ Sample Output

```text
===== SIMPLE BANKING SYSTEM =====
1. Create Account
2. View Account
3. Deposit Money
4. Withdraw Money
5. Check Balance
6. View Transaction History
7. Exit

Enter your choice: 1

----- CREATE ACCOUNT -----
Enter Account Number: 10001
Enter Account Holder Name: Afrin
Enter Initial Balance: 5000

Account created successfully!
```

### 💰 Deposit Example

```text
Enter your choice: 3

----- DEPOSIT MONEY -----
Enter Account Number: 10001
Enter amount to deposit: 2000

₹2000.00 deposited successfully!
Current Balance: ₹7000.00
```

### 💸 Withdrawal Example

```text
Enter your choice: 4

----- WITHDRAW MONEY -----
Enter Account Number: 10001
Enter amount to withdraw: 1500

₹1500.00 withdrawn successfully!
Current Balance: ₹5500.00
```

### 📜 Transaction History

```text
----- TRANSACTION HISTORY -----
Account created with balance: ₹5000.00
Deposited: ₹2000.00
Withdrawn: ₹1500.00
-------------------------------
```

## 🎯 Learning Objectives

This project helps in understanding:

* Classes and Objects
* Encapsulation
* Constructors
* Getters and Setters
* ArrayList
* Methods
* Loops
* Conditional Statements
* Input validation
* Transaction handling
* Basic banking operations
* Object-Oriented Programming

## 🚀 Future Improvements

The project can be improved by adding:

* PIN/password authentication
* Money transfer between accounts
* Account deletion
* Multiple account types
* Interest calculation
* ATM simulation
* Database connectivity using MySQL
* File-based data storage
* Transaction dates and times
* Login system

## 👩‍💻 Author

**Afrin**

B.Tech Computer Science Engineering

## 📄 License

This project is created for **learning and educational purposes**.
