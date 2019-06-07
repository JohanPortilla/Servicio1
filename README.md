*Proyecto Final de Wallets*

# Coordinador

Este componente es el coordinador, el cual realiza el ruteo de los datos de la siguiente manera:
Hay que tener en cuenta de dónde viene y hacia donde va.

#### Wallet
  * Registrar Transacción ➜ Registro
  * Consultar Fondos ➜ Blockchain
  
#### Register
  * Registrar Transacción ➜ Blockchain
  * Verificar Data De Transacción ➜ Blockchain
  
#### OpenCloser
  * Solicitar Data del Bloque ➜ Blockchain
  * Correr Bloque ➜ Blockchain
  
## Código

Se crean 3 clases, las cuales se desglosan a continuación:

* Servicio web REST para poder hacer de coordinador para las transacciones en criptomoneda:

```java
 class Servicio1
```

* Clase para que pueda consumir la API de Bittrex para poder obtener las transacciones (En este caso, se utiliza como ejemplo obtener los marcadores de Bittrex):

```java
 class ConsumoApi
```
   El String, en este caso, se reemplaza por BTC-LTC para que pueda funcionar.
   ```java
    String salida="BTC-LTC"
   ```


* Clase de configuración para el servicio web REST:

```java
 class ApplicationConfig
```

## Construcción
* Se utilizó un API de Bittrex para validar el funcionamiento: [LINK](https://api.bittrex.com/api/v1.1/public/getmarkets)

## Autores
* **Edier**
* **Daniel Reyes**
* **Jonathan Cortés**
* **Johan Portilla**
