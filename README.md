# MathsWebService

## Description

MathsWebService est une application Java EE utilisant SOAP et GlassFish.  
Elle expose plusieurs opérations mathématiques simples sous forme de Web Services.

Le projet inclut également un client SOAP permettant de consommer les opérations du service à partir d’une application Java.

---

## Technologies utilisées

- Java 8
- Maven
- GlassFish 5.1
- JAX-WS (SOAP)
- Apache NetBeans IDE 30

---

## Fonctionnalités

Le service `CalculsSimples` propose les opérations suivantes :

### `hello(String name)`

Retourne un message de bienvenue.

### `additionner(double a, double b)`

Retourne la somme de deux nombres.

### `decomposer(int entier)`

Décompose un entier en facteurs premiers.

### `premier(int entier)`

Vérifie si un nombre est premier.

---

## Structure du projet

### MathsWebService

Projet serveur SOAP exposant les Web Services.

### ClientSOAP

Projet client Java consommant les opérations SOAP via le WSDL généré automatiquement.

---

## Lancement du projet

### Démarrer GlassFish

```bash
/Users/dev/glassfish5/glassfish/bin/asadmin start-domain
```

### Lancer le serveur SOAP

Depuis NetBeans :

- Clean and Build
- Run Project

---

## Accès au Web Service

### WSDL

```text
http://localhost:8080/MathsWebService/CalculsSimples?wsdl
```

### Console d’administration GlassFish

```text
http://localhost:4848
```

---

## Utilisation du client SOAP

Le projet `ClientSOAP` permet d’invoquer les méthodes du Web Service à l’aide des méthodes statiques générées automatiquement depuis le WSDL.

Exemple :

```java
System.out.println(additionner(5, 3));
System.out.println(premier(7));
System.out.println(decomposer(12));
```

---

## Auteur

Projet réalisé dans le cadre d’un tutoriel Java Web Services.
