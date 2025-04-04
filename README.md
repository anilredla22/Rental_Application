# Rental_Application
The Rental Application is a comprehensive platform designed to facilitate the rental process for both property owners and tenants. It allows property owners to list their rental properties and manage tenants, while providing tenants with an easy way to find and apply for rental properties.
### **Project Structure**  

- **`pom.xml`** - Maven configuration file.  
- **`src/main/java/com/rentalappapi/api/`** - Base package for the application.  
  - **`RentalappApplication.java`** - Main application class.  

#### **Configuration Files (`config/`)**  
- `JwtAuthenticationEntryPoint.java`  
- `JwtRequestFilter.java`  
- `JwtTokenUtil.java`  
- `WebSecurityConfig.java`  

#### **REST Controllers (`controller/`)**  
- `BookingController.java`  
- `EmailController.java`  
- `PropertyController.java`  
- `TenantController.java`  
- `UserController.java`  

#### **JPA Entities (`entity/`)**  
- `BookingEntity.java`  
- `OwnerEntity.java`  
- `PropertyEntity.java`  
- `TenantEntity.java`  
- `UserEntity.java`  

#### **Request and Response Models (`model/`)**  
- `BookingIdRequest.java`  
- `BookingRequestBody.java`  
- `LoginRequestBody.java`  
- `PropertyIdRequest.java`  
- `PropertyRequestBody.java`  
- `TenantIdRequest.java`  
- `TenantRequestBody.java`  
- `UserIdRequest.java`  

#### **Spring Data JPA Repositories (`repositories/`)**  
- `BookingRepository.java`  
- `PropertyRepository.java`  
- `TenantRepository.java`  
- `UserRepository.java`  

---

### **Technologies Used**  
- **Backend:**  
  - Java  
  - Spring Boot  

- **Security:**  
  - JWT Authentication  
  - Spring Security  

- **Database:**  
  - H2 Database (for development)  
  - MySQL/PostgreSQL (for production)  

- **ORM:**  
  - Spring Data JPA  

- **Build Tool:**  
  - Maven  

- **REST API Development:**  
  - Spring Web  
  - RESTful Services  

- **Authentication & Authorization:**  
  - JWT (JSON Web Tokens)  

- **Frontend (if integrated):**  
  - React  
  - Angular  
  - Vue.js (to consume APIs)
