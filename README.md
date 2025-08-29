# 📄Quick Invoice - An Invoice Generator Web App (Backend)

### A full-stack **Invoice Management System** built with **React + Spring Boot + MongoDB** to automate billing and reduce manual workload.  
The system provides an intuitive UI for managing invoices, exporting PDFs, and sending invoices directly via email.
---
Screenshots of Webapp

## 1. Home Page.
   <img width="1904" height="950" alt="Screenshot 2025-08-29 164547" src="https://github.com/user-attachments/assets/22072bfe-68ed-438c-a13d-37f636dab3e9" />

## 2. Invoice Generating Page.
<img width="1079" height="962" alt="Screenshot 2025-08-29 164604" src="https://github.com/user-attachments/assets/ff36db95-6176-44b7-a8fd-6e0e430e0dea" />

## 3. Dashboard : Where you find all the previous invoices.
<img width="1065" height="951" alt="Screenshot 2025-08-29 164618" src="https://github.com/user-attachments/assets/dbc5f5c6-d374-42bd-a688-4d2af571a369" />

---
## 🚀 Features
- **Full-stack architecture**: React frontend + Spring Boot backend + MongoDB database
- **Invoice Management**: Create, read, update, delete invoices
- **Multi-item Support**: Add multiple items/products per invoice
- **PDF Export**: Generate professional invoices in PDF format
- **Email Integration**: Deliver invoices instantly via email
- **User-Friendly UI**: Responsive design for seamless experience

---

## 🛠️ Tech Stack
### Frontend
- React.js
- Bootstrap CSS (for styling)

### Backend
- Spring Boot
- Spring Data MongoDB
- Clerk Authentication
  
### Database
- MongoDB (NoSQL database)

### Others
- PDF Export Support
- Email API Integration
---

## 📂 Project Structure
```
┣ 📂 backend/ # Spring Boot backend
┃ ┣ 📂 src/main/java/com/invoice
┃ ┃ ┣ 📂 controller/ # REST Controllers
┃ ┃ ┣ 📂 service/ # Business logic
┃ ┃ ┣ 📂 repository/ # MongoDB Repositories
┃ ┃ ┗ 📂 model/ # Entity classes (Invoice, Item, etc.)
┃ ┣ 📂 src/main/resources/
┃ ┃ ┗ application.properties
┃ ┗ pom.xml
┗ README.md
```
---

## ⚡ Installation & Setup

### Prerequisites
- Node.js & npm
- Java 17+
- Maven
- MongoDB (local or cloud)

### Steps
1. Clone the repository:
   ```
   git clone https://github.com/Sk2112/Quick-Invoice.git
   cd invoice-generator-webapp
   ```

   2.Setup backend:
   ```
   cd backend
   mvn spring-boot:run
   ```
   3.Access app in browser:

   ```
    http://localhost:3000
   ```
---



# ⚙️ Configuration Guide


This project requires external services for **Database**, **Email (SMTP)**, and **Authentication (Clerk)**.  
Since `application.properties` contains secrets, it is **not included in the repo**.  
--
Instead, you will find a `application.properties.example` file.  
👉 Copy it to `src/main/resources/application.properties` and fill in the required values or just edit the name of file to  `application.properties`
--

## 1. MongoDB Setup

### Option A: Local MongoDB (no authentication)
- Install MongoDB locally (default port: `27017`).
- Create a database named `invoicedb`.
- Use this in your config:
  ```properties
  spring.data.mongodb.uri=mongodb://localhost:27017/invoicedb
   ```

## 2. SMTP (Brevo / Any Email Service)

Brevo Setup
Create a free account at Brevo.
Go to SMTP & API → Generate SMTP credentials.
Update your config:

```
spring.mail.host=smtp-relay.brevo.com
spring.mail.port=587
spring.mail.username=<your-brevo-smtp-username>
spring.mail.password=<your-brevo-smtp-password>
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.protocol=smtp
spring.mail.properties.mail.smtp.from=<your-email@example.com>
```

## 3. Clerk Authentication Setup

- Clerk is used for authentication.
- Create a free project at Clerk.dev
- Copy your Issuer URL and JWKS URL from the project settings.
- Update your config:
```
clerk.issuer=https://<your-clerk-app>.clerk.accounts.dev
clerk.jwks-url=https://<your-clerk-app>.clerk.accounts.dev/.well-known/jwks.json
```

 ## 4. Logging (Optional)
 
 To debug email sending:
``` 
logging.level.org.springframework.mail=DEBUG
```


## 5 Run the app 
  ```
mvn spring-boot:run
```

   
### 
## 🤝 Contributing
Pull requests are welcome. For significant changes, please open an issue first to discuss your ideas.

### Frontend Repo : 
```
https://github.com/Sk2112/Quick-Invoice
```

###  👨‍💻 Developed by Sumit kumar
   
