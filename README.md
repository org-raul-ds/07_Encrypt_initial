# Software Design Laboratory Class

**⚠️ IMPORTANT NOTE:** This repository will be **deleted** at the end of the course. Make sure to save any code you want to keep elsewhere.

## ✏️ Additional Instructions

### Reference Design

Currently, the design to copy a file to different outputs is as follows:

```java
system.copy("private.txt", new FileOutput("copy.txt"));
system.copy("private.txt", new InternetOutput("1.1.1.1"));
system.copy("private.txt", new BluetoothOutput("iPhone"));
```

We are asked to implement the following changes:
1. When making a copy of a file on disk (the first statement), we want to normalize line breaks (remove '\r' and leave only '\n').
2. When sending over the Internet, we want to encrypt (+1 if it's a letter or digit).
3. When sending over Bluetooth, we want to encrypt (in the same way as before) and remove repeated spaces.

### Modification 1

When making a copy of a file on disk (what `copyFile` previously did), in addition to normalizing line breaks (removing '\r'), there are times when we also want to encrypt. In the main, it should be possible to indicate whether, when making the copy, we want to encrypt or not.

```java
void main () {
    …
    fs.copy("private.txt" … "a.txt");	// Be able to indicate that "a.txt" remains unencrypted
    fs.copy("private.txt" … "b.txt");	// Be able to indicate that "b.txt" remains encrypted
}
```

### Modification 2

When sending over the Internet, in addition to encrypting, we want to be able to indicate whether to normalize (remove '\r') and/or remove repeated spaces (one of them or both).

```java
void main () {
    …
    fs.copy("private.txt" … "1.1.1.1");	// This sending normalized (without '\r')
    fs.copy("private.txt" … "1.1.1.2");	// This sending without repeated spaces
    fs.copy("private.txt" … "1.1.1.3");	// This normalized and without repeated spaces
}
```

### Modification 3

In all three cases (whether copying the file to disk or sending over Internet or Bluetooth) we want to know, from the Main, the number of characters copied.

```java
void main () {
    …
    fs.copy("private.txt" … "1.1.1.1");

    System.out.println("# characters have been sent " + …);
}
```

### Modification 4

Both when normalizing (removing '\r') and when removing repeated spaces, we also want to know how many characters there were **before** processing.

```java
void main () {
    …
    fs.copy("private.txt" … "1.1.1.1"); 	// Sent normalized (without '\r')

    System.out.println("Initially there were " + … + "# characters");
    System.out.println("After normalizing, " + … + "# characters have been sent");
}
```

### Modification 5

Encrypting a large file is a slow operation. We want that, if the same file is going to be sent both over Internet and Bluetooth, it encrypts **only once** to save time.

```java
void main () {
    …
    fs.copy("private.txt" … "1.1.1.1" … "Galaxy S");	// Sent encrypted to both
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
