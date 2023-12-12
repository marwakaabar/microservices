# Docker Compose for Microservices with Keycloak and Gateway

This Docker Compose configuration sets up a microservices architecture using various interconnected services. Keycloak is integrated for authentication and authorization, while an API Gateway manages routing requests to the appropriate services.

## Services Overview

### Gateway
- **Service Name**: api-gateway
- **Description**: API Gateway responsible for routing requests to respective microservices.
- **Port**: 8087

### Eureka (Service Registry)
- **Service Name**: discovery-service
- **Description**: Eureka is utilized as a service registry for service discovery among microservices.
- **Port**: 8761

*Other Microservices:*
- **Article**, **Hotel**, **Offre**, **Pays**, **Reservation**, **Site Touristique**
    - These services handle specific functionalities and communicate through the Eureka service registry.
    - They are accessible via designated ports (`9090`, `9079`, `8282`, `9099`, `8080`, `9098` respectively).

### Other Service (Technologie Avancee)
- **Service Name**: offre
- **Description**: Payment service connected to a MongoDB database.
- **Port**: 3000
- **Database URL**: `mongodb+srv://bahaeddine170:ebaiwDFSlXUMoCLb@cluster0.ag1fzjf.mongodb.net/test`

### PostgreSQL Database
- **Service Name**: psql
- **Description**: Psql used by the payment service.
- **Port**: 5432
- **Credentials**:
    - Username: postgres
    - Password: root
    - Database: offre_ms_db


## Usage

1. Clone this repository.
2. Navigate to the root directory containing `docker-compose.yml`.
3. Run `docker-compose up` to start all services.

Utilize the Gateway (`localhost:8081`) to interact with various microservices.
