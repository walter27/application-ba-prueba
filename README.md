📦 Arquitectura (Clean Architecture implementada)

Capas:

Domain: Entidades y reglas de negocio (no depende de Spring).

Application: Casos de uso / servicios de aplicación.

Infrastructure: Controllers REST, persistencia JPA, WebClient, mappers, configuraciones.

Bootstrap: Arranque Spring Boot.

com.banco.austro.prueba
 ├── domain
 ├── application
 ├── infraestructure
 └── BancoAustroWsApplication.java

🚀 Requisitos

Java 17+

Maven 3.9+

Puerto por defecto: 8080

🧱 Generar el JAR con Maven

Desde la raíz del proyecto:

mvn clean package


Se generará el JAR en:

target/banco-austro-ws-0.0.1-SNAPSHOT.jar

▶️ Ejecutar el Web Service con la JVM
java -jar target/banco-austro-ws-0.0.1-SNAPSHOT.jar


Con perfil (opcional):

java -jar target/banco-austro-ws-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev


Cuando el servicio esté arriba verás en consola:

Started BancoAustroWsApplication
Tomcat started on port(s): 8080

🧪 Postman – Exportar / Importar JSON
📤 Exportar la colección (cuando el WS esté arriba)

Abre Postman

Ve a tu colección Banco Austro

Clic en … → Export

Guarda el archivo como:

banco-austro.postman_collection.json


Sube el archivo al repo en:

/postman/banco-austro.postman_collection.json

📥 Importar la colección

Abre Postman

Clic en Import

Selecciona:

postman/banco-austro.postman_collection.json


Ejecuta los endpoints contra:

http://localhost:8080/api/external

🔌 Endpoints principales
GET    /users
GET    /posts/title/{idUser}
