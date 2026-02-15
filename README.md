# Automation Demo (UI + API Test Framework)

Automation test framework built with Java for web UI and API validation against [demoqa.com](https://demoqa.com/).

## Why This Project

This repository demonstrates:
- UI automation with Selenide + Page Object Model
- API automation with Rest Assured
- Unified reporting with Allure
- Maven profile-based test execution

The goal is to show practical test automation architecture, not only isolated test scripts.

## Tech Stack

- Java 17
- Maven
- JUnit 5
- Selenide
- Rest Assured
- Allure Report
- AssertJ / Hamcrest

## Project Structure

```text
src/
  main/java/
    config/            # Shared configuration and base classes
    helpers/           # Action/assertion helpers
    logger/            # Logging wrapper
    pom/               # Page Objects + selectors
  test/java/
    tests/ui/          # UI tests
    tests/api/         # API tests
    tests/functional/  # End-to-end style functional tests
```

## Prerequisites

- JDK 17+
- Maven 3.8+
- Google Chrome (for UI tests)

## Quick Start

If you already have the project locally, you can skip `git clone` and `cd`.

### 1) Clone project (first time only)

```bash
git clone https://github.com/Stephanzhqa/portfolio.git
cd Automation-demo
```

### 2) Set credentials (required for login/token tests)

```bash
export DEMOQA_USERNAME="<your-demoqa-username>"
export DEMOQA_PASSWORD="<your-demoqa-password>"
```

### 3) Run tests

```bash
mvn clean test
```

## Running Test Suites

Run all tests:

```bash
mvn clean test -Pall-tests
```

Run only UI tests:

```bash
mvn clean test -Pui-tests
```

Run only API tests:

```bash
mvn clean test -Pall-api
```

Run with parallel profile:

```bash
mvn clean test -Pparallels
```

## Allure Reporting

Generate and open local report:

```bash
mvn allure:serve
```

Generate static report files:

```bash
mvn allure:report
```

## Current Coverage (Examples)

UI:
- Home page main cards visibility
- Core endpoint navigation
- Forms and Book Store flows

API:
- Login
- User registration
- Token generation
- Book retrieval

## Notes

- UI base URL and browser options are configured in `src/test/java/tests/config/BaseUITest.java`.
- Login credentials are loaded from `-Ddemoqa.username` / `-Ddemoqa.password` or env `DEMOQA_USERNAME` / `DEMOQA_PASSWORD`.

## CI Setup

For full test execution in GitHub Actions, add repository secrets:
- `DEMOQA_USERNAME`
- `DEMOQA_PASSWORD`
