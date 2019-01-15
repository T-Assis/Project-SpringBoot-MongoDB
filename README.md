# Project-SpringBoot-MongoDB

## English:
  - Software development project using Spring Boot with MongoDB (Using Restful API)

### DTO (Data Transfer Object) 
  - It is an object that has the role of loading data of entities in a simple way, and can even "design" only some data of the original entity.
  - Benefits
    - Optimize traffic (traveling less data)
    - Prevent data that is unique to the system from being exposed (for example: passwords, audit data such as creation date and object update date, etc.)
    - To customize the objects trafficked according to the need of each request (for example: to change a product, you need the data A, B and C, to list the products, I need the data A, B and category of each product, etc).

## References:

  - https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html
  - https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-nosql.html
  - https://stackoverflow.com/questions/38921414/mongodb-what-are-the-default-user-and-password
  - https://pt.stackoverflow.com/questions/31362/o-que-é-um-dto
  - https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/
  - https://docs.spring.io/spring-data/data-document/docs/current/reference/html/
  - https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/
  - https://docs.spring.io/spring-data/data-document/docs/current/reference/html/
  - https://docs.mongodb.com/manual/reference/operator/query/regex/
  
## ====================================================

## Português: 
  - Projeto de desenvolvimento de software usando Spring Boot com MongoDB (Usando API Restful)

### DTO (Data Transfer Object) 
  - É um objeto que tem o papel de carregar dados das entidades de forma simples, podendo inclusive "projetar" apenas alguns dados da entidade original.
   - Vantagens:
      - Otimizar o tráfego (trafegando menos dados)
      - Evitar que dados de interesse exclusivo do sistema fiquem sendo expostos (por exemplo: senhas, dados de auditoria como data de criação e data de atualização do objeto, etc.)
      - Customizar os objetos trafegados conforme a necessidade de cada requisição (por exemplo: para alterar um produto, você precisa dos dados A, B e C; já para listar os produtos, eu preciso dos dados A, B e a categoria de cada produto, etc).

## Referências:
  - https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html
  - https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-nosql.html
  - https://stackoverflow.com/questions/38921414/mongodb-what-are-the-default-user-and-password
  - https://pt.stackoverflow.com/questions/31362/o-que-é-um-dto
  - https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/
  - https://docs.spring.io/spring-data/data-document/docs/current/reference/html/
  - https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/
  - https://docs.spring.io/spring-data/data-document/docs/current/reference/html/
  - https://docs.mongodb.com/manual/reference/operator/query/regex/
