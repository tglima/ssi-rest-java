# SSI REST Java

Simples projeto em Java de um Rest API usando Spring Boot, PostgreSQL e JPA.

## Requisitos

|Java       | 1.8.x   |
|-----------|:-------:|
|Maven      | 3.x.x   |
|PostgreSQL | 10.x.x  |

## Rodando a aplicação

### 1) Clone este repositório

````bash
git clone https://github.com/tglima/ssi-rest-java.git 
````

### 2) Crie o banco no PostgreSQL

````sql
CREATE DATABASE dbssi  WITH OWNER=postgres ENCODING='UTF8' CONNECTION LIMIT=-1;
COMMENT ON DATABASE dbssi IS 'Database used from project Serviços Sul da Ilha.';
````

### 3) Restaure o banco no PostgreSQL

Utilize o utilitário de linha comando "`pg_restore`" como root.

````bash
pg_restore -U postgres -d dbssi 20190331-dbssi.dump
````

O arquivo "`20190331-dbssi.dump`" se encontra dentro do diretório [docs/sql](docs/sql)

### 4) Configure o acesso ao PostgreSQL

Abra o arquivo *`application.properties`* em:

    src/main/resources/application.properties

Altere os campos abaixos com os valores correspondentes do seu PostgreSQL

    spring.datasource.url
    spring.datasource.username
    spring.datasource.password

### 5) Gere seu jar

Dentro da pasta raiz de seu projeto utilize o comando:

````bash
mvn package
````

Se preferir gere o jar com ajuda de sua IDE.

### 6) Execute seu jar

````bash
java -jar target/ssi-rest-0.2.0-SNAPSHOT
````

A api rest estará disponível em  http://localhost:8080.

## Explore a API Rest

Este aplicativo disponibiliza as seguintes APIS:

    GET /api/ads

    GET /api/ads/id={adId}

    GET /api/ads/promoted={boolean}

    GET /api/ads/category={categoryUrl}

    GET /api/ads/desc={string}

    GET /api/categories/id={categoryId}

    GET /api/categories/url={categoryUrl}

    POST /api/messages

Utilize o [POSTMAN](https://www.getpostman.com) ou outro "rest client" para exlorar a aplicação.

## Licença

O código fonte desta aplicação está sob [Licença MIT](LICENSE), todo o restante deve ser considerado conteúdo registrado dos seus respectivos proprietários e desenvolvedores.