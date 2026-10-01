# Security Analyst Project

A Java application designed to represent and manage security analyst profiles, tracking key details such as credentials, experience, and active security incident investigations.

## Features

- **Class Model (`SecurityAnalyst`)**: Represents individual security analysts with attributes including:
  - Analyst Name (`String`)
  - Certification (`String`)
  - Years of Experience (`int`)
  - Active Incident Status (`boolean`)
- **Constructors**: Supports both default (placeholder values) and parameterized initialization.
- **Getters & Setters**: Full encapsulation with accessor and mutator methods for all fields.
- **Investigate Method**: Generates a descriptive log of current analyst activities.
- **Formatted Output**: Overridden `toString()` method for easy debugging and data representation.

## Project Structure

```text
SecurityAnalyst/
├── model/
│   └── SecurityAnalyst.java   # Core model class defining SecurityAnalyst data and methods
└── AnalystDriver.java         # Driver/main class to run and test the application
