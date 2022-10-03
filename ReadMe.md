# WeAreCodingSpringBoot
- Java 17
- Spring Boot
- Spring MVC
- Spring Data
- Spring Security
- Spring Rest

## Steps
> Spring MVC
> 

### Reference Documentation

* [GitHub](https://github.com/berkaybayrakc/WeAreCodingSpringBoot)


```sh
docker
```

* [H2 console] (http://localhost:8080/h2-console/l)
* [Swagger] (http://localhost:8080/swagger-ui.html)

```sh

STEP 1
$     ./mvnw clean package -DskipTests

STEP 2
$    docker-compose up
$    docker ps


######POSTMAN###########
STEP 3
POSTMAN

//ADD
http://localhost:8080/docker/v1/create/product


//LIST
http://localhost:8080/docker/v1/list/product


//FIND
http://localhost:8080/docker/v1/find/product/1



//DELETE
http://localhost:8080/docker/v1/delete/product/1


STEP 4
$    docker exec -it spring_docker_postgresqldb_1 psql -U postgres studentdb


STEP 5
$    studentdb=#  \dt ==> Show Tables
$    studentdb=#  select * from product
$    studentdb=#  \q ==> EXIT

```