# 🏠 Home Automation System (Java)

A console-based **Home Automation System** built using **Core Java**, focused on demonstrating real-world usage of **Object-Oriented Programming (OOP)** concepts.

This project simulates a smart home where users can control devices like **Light, Fan, and AC**, view their status, and perform an **Emergency Power Off** from a centralized system.

---

## 🚀 Features
- Control multiple devices (Light, Fan, AC)
- Device-specific controls:
  - Light → Brightness control
  - Fan → Speed control
  - AC → Temperature control
- Show status of all devices
- Emergency Power Off (turns off all devices)
- Easily extendable (add new devices without rewriting code)

---

## 🧠 OOP Concepts Used
- **Abstraction** – `Device` abstract class
- **Inheritance** – `Light`, `Fan`, `AC` extend `Device`
- **Interfaces** – `Switchable`, `Adjustable`
- **Polymorphism** – Common device handling using parent reference
- **Composition** – `HomeAutomation` class contains devices
- **Encapsulation** – Controlled access using getters and methods

---

## 🛠️ Tech Stack
- **Language:** Java (Core Java)
- **Application Type:** Console-based
- **Tools:** VS Code, Git, GitHub

---
