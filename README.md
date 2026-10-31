# Software Design Laboratory Class

**⚠️ IMPORTANT NOTE:** This repository will be **deleted** at the end of the course. Make sure to save any code you want to keep elsewhere.

## ✏️ Additional Instructions

### Base Design

The current design for copying a file to different destinations is as follows:

```java
system.copy("private.txt", new FileOutput("copy.txt"));
system.copy("private.txt", new InternetOutput("1.1.1.1"));
system.copy("private.txt", new BluetoothOutput("iPhone"));
```

We are asked to implement the following changes:
1. When copying a file **to disk** (the first statement), normalize line breaks by removing '\r' and keeping only '\n'.
2. When sending a file over the **Internet**, encrypt it by shifting each letter or digit forward by one.
3. When sending a file over **Bluetooth**, encrypt it in the same way and remove repeated spaces.

The design resulting from these changes will be referred to as the **base design**.

The application will then be extended in several ways. These extensions will put the quality of the resulting design to the test.

### Extension 1

When copying a file to disk (as `copyFile` did previously), we sometimes want to encrypt it as well as normalize its line breaks (remove '\r'). The `main` method should let us specify whether each copy should be encrypted.

```java
void main () {
    …
    fs.copy("private.txt" … "a.txt");	// Be able to indicate that "a.txt" remains unencrypted
    fs.copy("private.txt" … "b.txt");	// Be able to indicate that "b.txt" remains encrypted
}
```

### Extension 2

When sending a file over the Internet, in addition to encrypting it, we want to be able to specify whether to normalize line breaks (remove '\r'), remove repeated spaces, or do both.

```java
void main () {
    …
    fs.copy("private.txt" … "1.1.1.1");	// Send with normalized line breaks (without '\r')
    fs.copy("private.txt" … "1.1.1.2");	// Send without repeated spaces
    fs.copy("private.txt" … "1.1.1.3");	// Send with normalized line breaks and without repeated spaces
}
```

### Extension 3

In all three cases (copying a file to disk, or sending it over the Internet or Bluetooth), we want `Main` to be able to report the number of characters copied or sent.

```java
void main () {
    …
    fs.copy("private.txt" … "1.1.1.1");

    System.out.println("Number of characters sent: " + …);
}
```

### Extension 4

When normalizing line breaks (removing '\r') or removing repeated spaces, we also want to know how many characters there were **before** processing.

```java
void main () {
    …
    fs.copy("private.txt" … "1.1.1.1"); 	// Send with normalized line breaks (without '\r')

    System.out.println("There were initially " + … + " characters");
    System.out.println("After normalization, " + … + " characters have been sent");
}
```

### Extension 5

Encrypting a large file is a slow operation. If the same file is sent over both the Internet and Bluetooth, we want it to be encrypted **only once** to save time.

```java
void main () {
    …
    fs.copy("private.txt" … "1.1.1.1" … "Galaxy S");	// Send an encrypted copy to both destinations
}
```

## 💻 Submission Instructions

To submit your solution:
- Open the terminal.
- Navigate to the folder where this `README.md` file is located.
- Run `git add -A`.
- Run `git commit -m "final code"`.
- Run `git push`.


## ✅ Exercise Solution

The solution to **this exercise** can be found in [this repository](https://github.com/org-raul-ds/07_Encrypt_solution), which will be available during the next lab session (it is currently disabled, so the link will produce an error).

The solution to **last week's exercise** can be found in [this repository](https://github.com/org-raul-ds/06_Map_solution).
