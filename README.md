# Proyecto de Sistema de Transporte

Este proyecto es una aplicación Java que permite calcular el coste de envío y el tipo de embalaje para diferentes tipos de transporte.

## Características

- Soporta diferentes tipos de transporte, incluyendo camiones y bicicletas.
- Calcula el coste total de envío basado en el código postal.
- Determina el tipo de embalaje basado en las dimensiones y el peso del paquete.

## Cómo usar

1. Instancia la clase de transporte que deseas utilizar (por ejemplo, `Camion` o `Bicicleta`).
2. Llama al método `costeTotal(int cp)` para obtener el coste total de envío.
3. Llama al método `tipoEmbalaje(float x, float y, float z, float peso)` para obtener el tipo de embalaje.

## Ejemplo de uso

```java
Camion c = new Camion();
Bicicleta b = new Bicicleta();
Factory f = new Factory();

int codigoPostal = 12345;
float costeCamion = c.costeTotal(codigoPostal);
int embalajeCamion = c.tipoEmbalaje(60.0f, 60.0f, 60.0f, 30.0f);
float costeBicicleta = b.costeTotal(codigoPostal);
int embalajeBicicleta = b.tipoEmbalaje(30.0f, 30.0f, 30.0f, 5.0f);

System.out.println("Coste total para envío en camión: $" + costeCamion);
System.out.println("Tipo de embalaje para envío en camión: " + f.getProducto(embalajeCamion));
System.out.println("Coste total para envío en bicicleta: $" + costeBicicleta);
System.out.println("Tipo de embalaje para envío en bicicleta: " + f.getProducto(embalajeBicicleta));
```