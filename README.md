# MS-TEST-CLF-PRODCUTS-BACKEND

Servicio que valida informaci&oacute;n de los prodcutos a prodcutos.
* Autor: Carlos Luna Fernandez
* Version Doc: 1.0

## Swagger
Consumo de documentaci&oacute;n del servicio en los siguientes contextos:
* http://localhost:808o/swagger-ui/index.html
* http://localhost:8080/v3/api-docs

# Como ejecutar el servicio
Para ejecutar el servisio puede hacerse de dos maneras
1 - Abrirl el proyecto en un ide por ejemplo STS y presionar el boton Run
2 - ejecutar el siguiente comando: mvn spring-boot:run

# Como ejecutar el servicio desde el postman
Importar la coleccion PostMan adjunta por correo

    - /api/prodcuts 
      http://localhost:8080/api/prodcuts
      API POST para insertar un prodcuto con el body :
      {
        "name": "Laptop",
        "description": "Laptop de última generación"
      }
      El seervicio regresa el ID insertado.

    - /api/prodcuts/
      http://localhost:8080/api/prodcuts
      API GET para consultar los prodcutos
      El servicio regresa los prodcutos

    - /api/prodcuts/{productId}
      http://localhost:8080/api/prodcuts/1
      API GET para consultar el el prodcuto
      El servicio regresa el prodcuto asociado al id

    - /api/prodcuts/{productId}
      http://localhost:8080/api/prodcuts/1
      API PUT para actualizar el el prodcuto
      El seervicio regresa el ID actualizado.

    - /api/prodcuts/{productId}
      http://localhost:8080/api/prodcuts/1
      API PUT para actualizar el el prodcuto
      El seervicio regresa el ID actualizado.

