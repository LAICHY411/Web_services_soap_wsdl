# Web Services SOAP avec JAX-WS
Ce projet consiste en la mise en œuvre d'un service web SOAP offrant trois fonctionnalités principales. Tout d'abord, il permet de convertir un montant donné en euros vers la devise marocaine, le dirham (DH). Ensuite, il offre la possibilité de consulter les détails d'un compte bancaire spécifique en fournissant son code unique. Enfin, le service permet également d'obtenir une liste complète des comptes bancaires disponibles. Ces fonctionnalités visent à faciliter les opérations financières et la gestion des comptes via une interface web standardisée.

## Architecture du projet
<img width="862" height="796" alt="image" src="https://github.com/user-attachments/assets/263b04dd-e920-4f15-8411-151ca8620b61" />

### Integration de la dependance JAXWS au niveau du fichier pom.xml
<img width="975" height="283" alt="image" src="https://github.com/user-attachments/assets/02ec699e-9127-49bd-9fd2-962c67016530" />

### Creation de la classe Compte defini par code, solde et date de creation

<img width="975" height="1022" alt="image" src="https://github.com/user-attachments/assets/3bba1afd-fe1b-4990-bb96-ebe8c3b3f3f4" />

### Creation de la classe BanqueWS qui represente une implementation d'un web service
##### cet classe offre trois operation :
##### 1- Conversion euro to dirham
##### 2- Consulatation du compte
##### 3- Recuperer la liste des comptes
<img width="975" height="859" alt="image" src="https://github.com/user-attachments/assets/d7195553-7d90-4b82-9850-40ca8b87e837" />
