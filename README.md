# Binary Search Tree with Custom Iterators

A Java implementation of a Binary Search Tree with custom iterators for preorder, inorder, and postorder traversals using the Iterator design pattern.

## Features

- Binary Search Tree implementation for storing student records
- Custom iterators for three traversal methods:
  - Preorder (root, left, right)
  - Inorder (left, root, right)
  - Postorder (left, right, postorder)
- Sorting by student ID

## Usage

----------------
javac *.java
java Main
----------------

## Example Output

---------------------------------------
Preorder Traversal:
ID: 4, Name: Maria Ross, Dept: CS
ID: 2, Name: Laura Welkin, Dept: ME
ID: 1, Name: Harrison Ford, Dept: ME
ID: 3, Name: Tyler Rodgers, Dept: CS
ID: 6, Name: Nick Graham, Dept: EE
ID: 5, Name: Dan Toman, Dept: EE
ID: 7, Name: Tommy Jones, Dept: ME

Inorder Traversal:
ID: 1, Name: Harrison Ford, Dept: ME
ID: 2, Name: Laura Welkin, Dept: ME
ID: 3, Name: Tyler Rodgers, Dept: CS
ID: 4, Name: Maria Ross, Dept: CS
ID: 5, Name: Dan Toman, Dept: EE
ID: 6, Name: Nick Graham, Dept: EE
ID: 7, Name: Tommy Jones, Dept: ME

Postorder Traversal:
ID: 1, Name: Harrison Ford, Dept: ME
ID: 3, Name: Tyler Rodgers, Dept: CS
ID: 2, Name: Laura Welkin, Dept: ME
ID: 5, Name: Dan Toman, Dept: EE
ID: 7, Name: Tommy Jones, Dept: ME
ID: 6, Name: Nick Graham, Dept: EE
ID: 4, Name: Maria Ross, Dept: CS
---------------------------------------

## Requirements
Java 8 or higher
