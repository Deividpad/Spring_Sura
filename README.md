# Spring_Sura CRUD

#Descripción
Se realiza un CRUD usando las siguiente tecnologías:
1. SpringBoot
2. PostgreSQL
3. Maven

#Instalación

Clonar el proyecto: https://github.com/Deividpad/Spring_Sura.git

Archivos Base_Datos Ruta: "\db"
Para importar la Base_Datos hay dos opciones
1. Importar el archivo db_import.sql en el gestor de base de datos
2. O abrir el archivo db_script.sql en el gestor y ejecutar las Querys.
Nota: La contraseña por defecto del gestor para acceder a la Base_Datos es: 1234

Código del proyecto - Ruta: "\code\spring"
1. Importar la carpeta "spring" en el editor de código de preferencia(IDE: IntelliJ o Spring-Tools)
2. Instalar Maven y agregarla a la ruta en las variables de entorno del S.O Windows 10
3. Ejecutar el siguiente comando en la terminal del editor de código: "mvn install" para instalar las dependencias usadas
4. ejecutar "mvn spring-boot:run" para arrancar el proyecto
Nota: En caso de error en la conexión a Base_Datos se debe revisar el archivo "spring\src\main\resources\application.properties"
donde esta la configuración de conexión.

#Uso
Rutas expuestas para realizar el CRUD desde POSTMAN:
1. Listar todos los empleados-GET: http://localhost:8080/api/employer
2. Empleado por id-GET: http://localhost:8080/api/employer/1
3. Empleado por DNI-GET: http://localhost:8080/api/employer/dni/1
4. Guardar empleado-POST: http://localhost:8080/api/employer
	{
		"nombre": "David",
		"dni": "13459789",
		"cargo": "Desarrollador",
		"fechaIngreso": "2022-02-07"
	}
5. Actualizar empleado-PUT: http://localhost:8080/api/employer/1 
{
	"nombre": "David",
	"dni": "13459789",
	"cargo": "Desarrollador",
	"fechaIngreso": "2022-02-07"
}
6. Eliminar empleado-DELETE: http://localhost:8080/api/employer/1

