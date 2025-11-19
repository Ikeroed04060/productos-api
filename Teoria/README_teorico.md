
# Solución Punto 3 – Preguntas Teóricas  
## Prueba Técnica – Desarrollador Java Spring Boot + JavaScript

---

## 1. Diferencias entre `@Controller`, `@RestController` y `@Service`

### @Controller
- Se usa para aplicaciones web tradicionales (MVC).  
- Retorna vistas (HTML, JSP, Thymeleaf).  
- Los métodos devuelven Strings que representan nombres de plantillas.  

### @RestController
- Combina `@Controller` + `@ResponseBody`.  
- Se usa para construir APIs REST.  
- Los métodos retornan directamente JSON o XML.  
- No devuelve vistas.

### @Service
- Representa la capa de negocio.  
- Contiene la lógica central de la aplicación.  
- Separa las responsabilidades respecto al controlador.  
- Facilita el mantenimiento y las pruebas unitarias.  

---

## 2. Qué es un DTO y uso recomendado

Un DTO (Data Transfer Object) es un objeto usado para transferir datos entre capas sin exponer directamente la estructura interna de las entidades del sistema.

### Uso recomendado
- No exponer todos los campos de la entidad.  
- Validar datos de entrada sin afectar el modelo principal.  
- Controlar qué datos se envían al cliente.  
- Evitar acoplamiento y mejorar la seguridad.  

Ejemplo:  
Un ProductoEntity puede tener campos internos, pero el cliente solo necesita ver los datos esenciales. El DTO permite enviar únicamente la información necesaria.

---

## 3. Explicar Promesa en JavaScript

Una Promesa es un objeto que representa el resultado futuro de una operación asíncrona.

### Estados:
- pending (pendiente)  
- fulfilled (resuelta)  
- rejected (rechazada)  

### Cómo se usa:
```
promise.then().catch();
```

O con async/await:
```
const data = await miPromesa();
```

### ¿Para qué sirve?
- Llamadas a APIs  
- Operaciones lentas o externas  
- Manejo asíncrono ordenado  
- Evitar el callback hell  

---

## 4. Ventajas de usar H2 en pruebas locales

- Base de datos en memoria, ligera y rápida.  
- No requiere instalación externa.  
- Ideal para pruebas y desarrollo rápido.  
- Se reinicia en cada ejecución (ambiente limpio).  
- Incluye consola web para inspección.  

---

## 5. Mejoras recomendadas para un entorno productivo

### Seguridad
- Autenticación JWT u OAuth2  
- Configurar CORS adecuadamente  
- Sanitizar datos de entrada  

### Base de datos
- Migraciones con Flyway o Liquibase  
- Pool de conexiones (HikariCP)  
- Backups programados  

### Documentación
- Swagger u OpenAPI  

### Logs y monitoreo
- Logs estructurados  
- ELK Stack  
- Micrometer + Prometheus/Grafana  

### Manejo de errores
- Excepciones centralizadas  
- Respuestas uniformes  

### Despliegue
- Docker + Compose  
- CI/CD  
- Ambientes dev/qa/prod  

### Frontend
- Hospedaje estático (Nginx, S3)  
- HTTPS  
