# Prueba Técnica – API de Productos (Spring Boot + PostgreSQL + Frontend JS)

## Descripción General

Este proyecto implementa una API REST para gestionar productos, cumpliendo todos los requisitos de la prueba técnica.
Incluye:

- Backend con Spring Boot 3, Java 17 y PostgreSQL
- Frontend simple con HTML + JavaScript
- Validaciones y manejo global de excepciones
- Uso de ENUM para categorías
- Colección Postman con todas las pruebas solicitadas

## Funcionalidades Principales

### CRUD Completo
- Crear producto
- Listar productos
- Obtener producto por ID
- Actualizar producto por ID
- Eliminar producto por ID

### Venta de Producto (restar stock)
PATCH /productos/{id}/vender?cantidad=n

### Búsqueda por Categoría
GET /productos/categoria/{categoria}

Categorías válidas (ENUM):
- TECNOLOGIA
- ACCESORIOS
- OFICINA

## Estructura del Proyecto

api-productos/
 ├── src/main/java/com/evaluacion/productosapi
 │    ├── controller
 │    ├── entity
 │    ├── repository
 │    ├── service
 │    │    └── exception
 │    ├── exception              (GlobalExceptionHandler)
 │    └── ProductosApiApplication.java
 │
 ├── src/main/resources
 │    └── application.properties
 │
 ├── frontend/
 │    └── index.html            (Interfaz visual)
 │
 └── postman/
      └── productos-api.postman_collection.json

## Configuración de Base de Datos (PostgreSQL)

spring.datasource.url=jdbc:postgresql://localhost:5432/productosdb
spring.datasource.username=postgres
spring.datasource.password=1234
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect

logging.level.org.hibernate.SQL=DEBUG

Crear la base de datos:

CREATE DATABASE productosdb;

## Manejo Global de Excepciones

Ejemplo de respuesta:

{
  "error": "Producto no encontrado",
  "detalle": "Producto con id 10 no encontrado",
  "timestamp": "2025-11-19T16:00:12"
}

Excepciones controladas:
- ProductoNoEncontradoException → 404
- MethodArgumentTypeMismatchException (ENUM inválido) → 400
- IllegalArgumentException → 400
- Exception general → 500

## Frontend Implementado (index.html)

El frontend permite:
- Mostrar todos los productos
- Buscar productos por categoría mediante un SELECT
- Botón para "Mostrar todos"
- Tabla con estilos limpios y modernos
- Manejo visual de errores y mensajes
- Consumo del backend mediante fetch()

Ubicación:
frontend/index.html

Cómo abrirlo:
- Doble clic
- Live Server (VS Code)
- /static en Spring Boot

## Pruebas con Postman

Colección ubicada en:
postman/productos-api.postman_collection.json

Incluye:
- Crear producto
- Listar productos
- Buscar por categoría
- Obtener producto por ID
- Actualizar producto
- Vender producto
- Eliminar producto
- Error por ID no encontrado
- Error por categoría inválida

## Estado Final de la Solución

- Código limpio y organizado
- Buenas prácticas aplicadas
- Validaciones implementadas
- Excepciones globales unificadas
- PostgreSQL configurado correctamente
- Frontend funcional y mejorado visualmente
- Colección Postman completa y organizada
- Uso correcto del ENUM integrado con la API