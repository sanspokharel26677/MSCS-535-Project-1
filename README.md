# 🚀 My Secure Spring Boot Application

This project is a **secure web application** built with **Spring Boot**, implementing **secure authentication, HTTPS, and SQL injection prevention**.

---

## 🔒 Features
- **Secure Authentication** using Spring Security
- **Password Hashing** (BCrypt)
- **HTTPS Enabled** (`keystore.p12`)
- **SQL Injection Protection** (Spring Data JPA)
- **REST API for User Management**
- **Role-Based Access Control (RBAC) - Optional**

---

## ⚙️ Installation & Setup

### **1️⃣ Clone the Repository**

git clone ggit@github.com:sanspokharel26677/MSCS-535-Project-1.git
cd mySecureApp 

### 2️⃣ Build the Project (Gradle)
./gradlew build or gradle build

### 3️⃣ Run the Application
./gradlew bootRun or gradle bootRun

	•	The application will start at https://localhost:8443.
### 4️⃣ Test Secure Endpoints
🔹 Unauthorized Access
curl -k https://localhost:8443/users

Response: 401 Unauthorized

🔹 Authorized Access
curl -u admin:password -k https://localhost:8443/users
Response: List of users

🔹 Create a New User
curl -X POST -H "Content-Type: application/json" -d '{"username":"testuser", "password":"testpass"}' -u admin:password -k https://localhost:8443/users

## 🔐 Security Implementations

1️⃣ Password Hashing (BCrypt)

2️⃣ Prevent SQL Injection
Spring Data JPA automatically protects against SQL injection.

3️⃣ Secure HTTPS Configuration
HTTPS is enforced using a self-signed certificate (keystore.p12).

## 📜 API Endpoints
GET /users
POST /users

👨## ‍💻 Author
Sandesh Pokharel


