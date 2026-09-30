# Synchronizing a printing queue using synchronized methods

![Java](https://img.shields.io/badge/Java-8%2B-orange?logo=openjdk)

This project presents a simple example of a printing queue shared by concurrent threads, synchronized with Java's synchronized methods.

By implementing mutual exclusion via a synchronized method, only one printing job (running as a thread) accesses the printing queue at a time. Any other jobs attempting to access the printing queue are suspended. After using the printing queue, the resource is released, and a suspended job is eventually notified to run.

This project is part of the **Concurrent Programming** module at the [Federal University of Rio Grande do Norte (UFRN)](https://www.ufrn.br), Natal, Brazil.

## 📂 Repository structure

Source code in this repository is organized as follows:

```text
+─printingqueue-synchronized
  ├─── doc                     # Directory with HTML pages resulting from the generated Javadoc
  └─── src                     # Directory with source code files
       └─── Job.java           # Implementation of a printing job as a thread
       └─── Main.java          # Main class
       └─── PrintingQueue.java # Simulation of a shared printing queue controlled by a semaphore
```

## 🚀 Getting Started

### ✅ Prerequisites

- Java Development Kit (JDK) 8 or newer
- A terminal or IDE

The program uses Java's standard library, so it requires no additional dependencies. 

## 🤝 Contributing

Contributions are welcome! Fork this repository and submit a pull request.

## 📜 License

This project is licensed under the [MIT License](LICENSE).
