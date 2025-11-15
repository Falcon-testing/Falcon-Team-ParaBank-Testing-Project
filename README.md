# 🏦 ParaBank Testing Project – Falcon Team  
Comprehensive Functional, Validation, and System Testing

---

##  **Team Members**
- **Team Leader:** Eng. Abdelrahman Ramadan  
- **Members:**  
  - Kerolos George  
  - Abdelsabour Mohamed  
  - Nour Hussein  
  - Mahmoud Sameeh  
  - Mohamed Wageeh  

---

#  **1. Requirements Overview**

Below is the full list of requirements grouped by module.

---

##  **1. Registration Module (REG)**  
**REG-001 → REG-040**  
Includes:  
- Access to registration page  
- Field validation (name, address, city, state, ZIP, phone, SSN, username, password)  
- Format, length, character restrictions  
- Error messages  
- Disabled register button  
- Success message  

---

##  **2. Authentication Module (AUTH)**  
**AUTH-001 → AUTH-011**  
Includes:  
- Login validations  
- Error handling  
- Password recovery  
- Session handling  
- Temporary password generation  

---

##  **3. Account Management Module (ACC)**  
**ACC-001 → ACC-018**  
Includes:  
- Account overview  
- New account creation  
- Freeze/close account  
- Multi-account switching  
- Default account retention  
- Statements & filtering  

---

##  **4. Transaction History & Transfer Module (TRX)**  
**TRX-001 → TRX-011**  
Includes:  
- Filtering by date, amount, ID  
- Numeric validation  
- Balance checks  
- Account selection  
- Logging & confirmation  

---

##  **5. Profile Management Module (PROF)**  
**PROF-001 → PROF-004**  
Includes:  
- Updating personal data  
- Applying registration-level validations  
- OTP verification  

---

##  **6. Loan Management Module (LN)**  
**LN-001 → LN-003**  
Includes:  
- Loan amount & down payment validations  
- Source account balance checks  

---

##  **7. System Module (SYS)**  
**SYS-001 → SYS-005**  
Includes:  
- Logout  
- Logo navigation  
- Browser session handling  
- Auto-logout  
- Multi-language support  

---

#  **2. Test Objective (Test Closure Phase)**

The objective of the Test Closure phase is to officially complete all testing activities and ensure full validation of all requirements across modules (REG, AUTH, ACC, TRX, PROF, LN, SYS).  
The closure phase ensures all test deliverables are completed, defects resolved, and the ParaBank system is ready for release.

### ✔ Key Goals
- Ensure **complete validation** of all requirements (REG → SYS).  
- Confirm **all high-critical defects are fixed**.  
- Validate **requirement coverage** using RTM.  
- Assess **system readiness** for production.  
- Produce final test documentation and archive all evidence.

---

#  **3. Test Scope**

The scope includes complete validation of **all functional, validation, usability, and security behaviors** across:

- Registration (REG-001 → REG-040)  
- Authentication (AUTH-001 → AUTH-011)  
- Account Management (ACC-001 → ACC-018)  
- Transaction History & Transfers (TRX-001 → TRX-011)  
- Profile Management (PROF-001 → PROF-004)  
- Loan Management (LN-001 → LN-003)  
- System Module (SYS-001 → SYS-005)

### ✔ In-Scope Items  
- Field validations  
- UI behavior  
- Navigation  
- Error handling  
- Functional flows  
- Business rules  
- Negative & boundary testing  
- Session handling  
- OTP verification  
- Multi-language support  

---

#  **4. Test Approach**

The ParaBank testing uses a **requirements-driven and risk-based** strategy to ensure full coverage and reliability.

---

## **1. Requirement Coverage**
Mapped each requirement (REG–SYS) to corresponding test cases through:

- Positive testing  
- Negative testing  
- Boundary value testing  
- Error-handling testing  
- UI and workflow validation  

RTM is used to ensure 100% requirement coverage.

---

## **2. Testing Methodology**

### ✔ Manual Testing  
Used for:  
- UI validation  
- Field-level rules  
- Error messages  
- Navigation  
- Exploratory flows  

### ✔ Automated Testing  
Used for stable and critical flows:  
- Login & logout  
- Registration positive path  
- Account overview  
- Fund transfers  
- Basic regression scenarios  

---

## **3. Functional Focus (Module-Based)**

### 🔹 Registration  
- Strict validation for all fields  
- Password strength + confirm match  
- Uniqueness of username  

### 🔹 Authentication  
- Credential validation  
- Password recovery  
- Session persistence  

### 🔹 Account Management  
- Balances  
- New account creation  
- Freeze/close confirmation  
- Statements and switching  

### 🔹 Transactions  
- Filters  
- Transfer rules  
- Account-to-same-account prevention  
- Balance updates & logging  

### 🔹 Profile  
- Data update + OTP verification  

### 🔹 Loan  
- Loan amount rules  
- Down payment validation  

### 🔹 System  
- Logout  
- Multi-language  
- Browser handling  

---

## **4. Risk-Based Prioritization**

Top priority modules:  
- Authentication (AUTH)  
- Account Management (ACC)  
- Transactions (TRX)  
- Session & security rules (SYS)

---

## **5. Test Data Strategy**

Prepared datasets for:  
- Valid/invalid names  
- ZIP & phone formats  
- Unique usernames  
- Accounts with various balances  
- Transactions for edge cases  
- Recovery scenarios  

---

## **6. Exit Criteria**

Testing is complete when:  
- All requirements have test cases  
- All critical/high defects are closed  
- RTM shows full coverage  
- Core flows REG → AUTH → ACC → TRX → PROF pass  
- All evidence is archived  

---

#  **5. Test Techniques Used**

ParaBank testing applied four major techniques:

---

## **1. Boundary Value Analysis (BVA)**  
Applied to:  
- Name, address, city, state, ZIP (min/max length)  
- Phone (12–15 digits)  
- Password (8–12 chars)  
- Transfer amount (0, max balance)  
- Loan amounts  
- Maximum accounts creation  

---

## **2. Equivalence Partitioning (EP)**  
Used for valid vs. invalid:  
- Names, address, city, username, password  
- Login data  
- Transaction amount  
- Loan values  
- Account selections  

---

## **3. Error Guessing**  
Examples:  
- Invalid special characters  
- Same-account transfer  
- Unconfirmed freeze/close  
- Back/forward after logout  
- Browser close session issues  

---

## **4. Exploratory Testing**  
Applied for:  
- Default account retention  
- Multi-account switching  
- Statements + filters  
- OTP verification  
- Language settings  
- Loan edge cases  

---

#  **6. Summary**

The combination of:  
- **BVA**  
- **EP**  
- **Error Guessing**  
- **Exploratory Testing**  

ensures strong coverage and confidence in system readiness.

---

