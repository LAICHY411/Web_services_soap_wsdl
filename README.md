# README - TP Web Services SOAP avec JAX-WS

## Description du projet
Ce projet implémente un service web SOAP permettant de :
1. Convertir un montant de l'euro en dirham marocain (DH)
2. Consulter un compte bancaire par son code
3. Consulter une liste de comptes bancaires

## Structure du projet
```
src/
├── ma/
│   ├── client/
│   │   └── ClientWS.java          # Client SOAP Java
│   ├── proxy/                     # Classes générées (stubs)
│   │   ├── BanqueService.java
│   │   ├── BanqueWS.java
│   │   ├── Compte.java
│   │   ├── ConversionEuroToDh.java
│   │   ├── ConversionEuroToDhResponse.java
│   │   ├── GetCompte.java
│   │   ├── GetCompteResponse.java
│   │   ├── ListComptes.java
│   │   ├── ListComptesResponse.java
│   │   ├── ObjectFactory.java
│   │   └── package-info.java
│   ├── server/
│   │   └── ServerJWS.java         # Serveur JAX-WS
│   └── service/                   # Implémentation du service
│       ├── BanqueService.java
│       └── Compte.java
```

## Prérequis
- JDK 8 ou supérieur
- Maven (pour la gestion des dépendances)
- Un navigateur web (pour consulter le WSDL)
- SoapUI ou Oxygen (pour tester le service)

## Déploiement du service web
1. Compiler le projet :
   ```bash
   javac ma/server/ServerJWS.java ma/service/*.java
   ```
2. Démarrer le serveur :
   ```bash
   java ma.server.ServerJWS
   ```
   Le service sera disponible à l'adresse : `http://localhost:8080/BanqueWS`

## Consultation du WSDL
Accédez au WSDL via :
```
http://localhost:8080/BanqueWS?wsdl
```

## Opérations disponibles
1. **conversionEuroToDh**:
   - Paramètre : `montant` (double)
   - Retour : montant converti en DH (taux fixe de 11 DH pour 1 euro)

2. **getCompte**:
   - Paramètre : `code` (int)
   - Retour : objet `Compte` avec code, solde aléatoire et date de création

3. **listComptes**:
   - Pas de paramètre
   - Retour : liste de 3 comptes avec des soldes aléatoires

## Test avec SoapUI/Oxygen
1. Créez un nouveau projet SOAP dans SoapUI
2. Importez le WSDL depuis `http://localhost:8080/BanqueWS?wsdl`
3. Testez chaque opération avec des valeurs appropriées

## Exécution du client Java
1. Compiler le client :
   ```bash
   javac ma/client/ClientWS.java
   ```
2. Exécuter le client :
   ```bash
   java ma.client.ClientWS
   ```

## Résultats attendus
Le client affichera :
1. Le résultat de la conversion de 600 euros en DH (devrait être 6600)
2. Les détails d'un compte avec le code 4
3. La liste de 3 comptes avec leurs informations

## Remarques
- Le taux de conversion est fixé à 11 DH pour 1 euro
- Les soldes des comptes sont générés aléatoirement entre 1000 et 10000
- Les dates de création sont fixées à la date courante

## Lancement

![image](https://github.com/user-attachments/assets/a4b2c3e3-da65-4c5a-ac89-327f2e637af5)


## Auteur
[LAICHI Yassine]  
