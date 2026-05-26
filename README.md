# ServiceRestTutoriel /MathsWebService

## Description

MathsWebService est une application Java EE utilisant SOAP et GlassFish.  
Elle expose plusieurs opérations mathématiques simples sous forme de Web Services.

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

## Lancement du projet

### Démarrer GlassFish

```bash
/Users/dev/glassfish5/glassfish/bin/asadmin start-domain
```
