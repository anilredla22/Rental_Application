# Rental_Application
The Rental Application is a comprehensive platform designed to facilitate the rental process for both property owners and tenants. It allows property owners to list their rental properties and manage tenants, while providing tenants with an easy way to find and apply for rental properties.
### **Project Structure**  
The project structured as follows

- **`pom.xml`** - Maven configuration file.  
- **`src/main/java/com/rentalappapi/api/`** - Base package for the application.  
  - **`RentalappApplication.java`** - Main application class.  

#### **Configuration classes (`config/`)**  
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
**Technologies Used**
**• Backend:** Spring Boot framework with Java
**• Database:** MySQL for data storage
**• Authentication:** Spring Security for secure user authentication and authorization
**• API:** RESTful APIs for communication between frontend and backend
