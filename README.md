Proyecto Final de Wallets

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
  

```java
 {
 }

```

## 

## Construcción
*Se utilizó un api de Bittrex para validar el funcionamiento: [LINK](https://api.bittrex.com/api/v1.1/public/getmarkets)

## Autores
* **Edier**
* **Daniel Reyes**
* **Jonathan Cortés**
* **Johan Portilla**
