# Pruebas de código

# HE HECHO LOS NIVELES 1,2,3,4

## Ejercicio 1:

![1](/Capturas/1.png)
![1](/Capturas/2.png)

| Valor | Salida de factor | Código de salida 
| :---  | :--- | :--- | 
| 360   | 360: 2 2 2 3 3 5 | 0                
| 1     | 1: | 0
| 17    | 17: 17 | 0
| hola  | factor: hola is not a valid positive integer | 1
| -5    | factor: -5 is not a valid positive integer | 1

### Tuve que solucionar un error que hacía que al introducir un número negativo se printeara en la terminal varias veces. <br> Introduje en este control una linea para limpiar la variable que lo solucionó <br>
String negativo = numero_introducido;
if (numero_introducido.startsWith("-")) {
### numero_introducido = "";
}
### y que así no se guarda el valor, ya que al pasar la variable a este bucle: <br>
while ((error.readLine()) != null) {
System.out.println("factor: " + negativo + " is not a valid positive integer");
} 
### Como el comando factor lanza un error de varías lineas este se superponen con el mensaje que introducimos y por tanto se repite varias veces.

## Ejercicio 2:

![1](/Capturas/3.png)
![1](/Capturas/4.png)

## Ejercicio 3:
![1](/Capturas/5.png)
![1](/Capturas/8.png)
![1](/Capturas/9.png)

## Ejercicio 4:
![1](/Capturas/6.png)
![1](/Capturas/7.png)







