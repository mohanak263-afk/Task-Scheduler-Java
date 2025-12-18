# Task Scheduler – Java

## About the Project
I built this project to understand how task scheduling works using a priority queue.
The scheduler executes tasks based on their priority, where higher priority tasks are executed first.

This project helped me practice Java data structures and understand how scheduling systems work at a basic level.

## Features
- Add tasks with a priority
- Automatically assigns a unique Task ID to each task
- Executes the highest priority task first
- Displays all pending tasks
- Menu-driven console interface

## How It Works
- Each task contains:
  - Task ID
  - Task Name
  - Priority
- Tasks are stored in a PriorityQueue
- A custom comparator is used so tasks with higher priority are processed first

## Technologies Used
- Java
- PriorityQueue
- Comparator
- Scanner

## How to Run
1. Clone the repository
2. Compile the program:

