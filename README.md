📌 Prueba Técnica – API de Productos (Spring Boot + PostgreSQL + Frontend JS)

Este proyecto implementa una API REST para gestionar productos, cumpliendo todos los requerimientos de la prueba técnica.
Incluye:

Backend con Spring Boot 3, Java 17 y PostgreSQL

Frontend simple con HTML + JavaScript

Validaciones, excepciones globales y estructuras limpias

Colección Postman con pruebas organizadas

🟩 🛠️ Funcionalidades principales
✔ CRUD completo

Crear producto

Listar productos

Obtener producto por ID

Actualizar producto

Eliminar producto

✔ Venta de producto (restar stock)
PATCH /productos/{id}/vender?cantidad=n

✔ Búsqueda por categoría
GET /productos/categoria/{categoria}


Categorías válidas (ENUM):

TECNOLOGIA

ACCESORIOS

OFICINA

🟦 📌 Estructura del Proyecto
api-productos/
 ├── src/main/java/com/evaluacion/productosapi
 │    ├── controller
 │    ├── entity
 │    ├── repository
 │    ├── service
 │    │    └── exception
 │    ├── exception  ← GlobalExceptionHandler
 │    └── ProductosApiApplication.java
 │
 ├── src/main/resources
 │    └── application.properties
 │
 ├── frontend/
 │    └── index.html  ← interfaz visual
 │
 └── postman/
      └── productos-api.postman_collection.json

🟩 🛢 Configuración de Base de Datos (PostgreSQL)
spring.datasource.url=jdbc:postgresql://localhost:5432/productosdb
spring.datasource.username=postgres
spring.datasource.password=1234
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect

logging.level.org.hibernate.SQL=DEBUG


La base debe existir:

CREATE DATABASE productosdb;

🟦 🛠️ Manejo Global de Excepciones

Todas las excepciones retornan respuestas estandarizadas:

{
  "error": "Producto no encontrado",
  "detalle": "Producto con id 10 no encontrado",
  "timestamp": "2025-11-19T16:00:12"
}


Controla:

ProductoNoEncontradoException → 404

MethodArgumentTypeMismatchException (ENUM inválido) → 400

IllegalArgumentException → 400

Excepción general → 500

🟩 🌐 Frontend implementado (index.html)

El frontend incluye:

✔ Tabla de productos
✔ Búsqueda por categoría usando un SELECT
✔ Botón Mostrar todos los productos
✔ Estilos CSS profesionales
✔ Manejo visual de errores y éxito

Ubicación:

frontend/index.html


Para abrirlo:

Doble clic

O con Live Server

O desde Spring colocándolo en /static

🟦 🧪 Pruebas con Postman (Colección incluida)

La colección se encuentra en:

postman/productos-api.postman_collection.json


Incluye exactamente los mismos endpoints que aparecen en tu Postman:

✔ Crear producto
✔ Listar productos
✔ Listar producto por categoría
✔ Obtener producto por ID
✔ Actualizar producto por ID
✔ Vender producto
✔ Eliminar producto por ID
✔ Prueba error ID
✔ Prueba error categoría

Esta colección permite validar:

Comportamiento del CRUD

Validaciones

Manejo global de errores

ENUM correcto

Respuestas exitosas y fallidas

🟩 🧨 Estado final de la solución

La solución cumple todos los requisitos de la prueba técnica, incluyendo:

✔ Código limpio

✔ Buenas prácticas

✔ Validaciones backend

✔ Excepciones globales

✔ Integración con PostgreSQL

✔ Frontend funcional y pulido

✔ Pruebas Postman organizadas