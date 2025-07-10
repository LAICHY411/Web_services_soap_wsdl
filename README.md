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

### Acceder au web service avec le navigateur 
<img width="975" height="490" alt="image" src="https://github.com/user-attachments/assets/9f8123b6-f94d-4fe5-8c24-5558e27f94b1" />

### le fichier xml du service web de la banque

<img width="975" height="486" alt="image" src="https://github.com/user-attachments/assets/98e26e89-871f-4a41-bc36-25faa8b674ce" />

### Creation s'un projet avec SOAPUI

<img width="975" height="457" alt="image" src="https://github.com/user-attachments/assets/38eb9a88-62a1-4973-b727-7a738548d2db" />

### Test de l'operation converion euro a dirham
#### affichant a la fois la requette et la reponse
<img width="975" height="519" alt="image" src="https://github.com/user-attachments/assets/ec2feac7-129d-4b92-9849-fa51b88bb3eb" />

### L'operation consultation compte

<img width="975" height="519" alt="image" src="https://github.com/user-attachments/assets/9add3885-1b1f-4bd5-b35a-7c302191cccd" />

### l'operation listeComptes

<img width="975" height="552" alt="image" src="https://github.com/user-attachments/assets/4f811c38-ced1-409f-8ff7-aa209f4ea47d" />

### Creation du proxy au niveau du client java
##### ce proxy permet de recuperer les operations du service web et l'utiliser au niveau du client
<img width="975" height="398" alt="image" src="https://github.com/user-attachments/assets/542e266d-8e83-4473-825c-ead2732390cd" />

### Exemple simple d'utilisation du service au niveau du fonction principale
<img width="975" height="799" alt="image" src="https://github.com/user-attachments/assets/aab613ca-9f14-44ce-85cb-2b6895a7b8d8" />

### Tester a la fois toute les trois operations
<img width="975" height="609" alt="image" src="https://github.com/user-attachments/assets/fe923cf3-3835-4674-b387-612a1fc8c85d" />

### Resultat
<img width="975" height="603" alt="image" src="https://github.com/user-attachments/assets/36a3b0d6-28d3-4b06-96ed-8ea4d84c98b8" />


