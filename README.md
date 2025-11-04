# Jeu du Pendu

Ce programme permet de jouer au **jeu du pendu**.
Le joueur doit deviner un mot mystère en proposant des lettres.
Le nombre d'essais est limité à 10 et chaque erreur réduit le nombre de tentatives restantes.

---

## Table des matières

* Installation
* Utilisation
* Règles du jeu
* Fonctionnalités
* Structure du code

---

## Installation

Assurez-vous d'avoir **Java 8 ou supérieur** installé sur votre machine.
Téléchargez le fichier `Main.java` dans le répertoire de votre choix.

Pour compiler et exécuter le programme depuis le terminal :

```bash
javac Main.java
java Main
```

---

## Utilisation

Le programme sélectionne aléatoirement un mot dans une liste prédéfinie.

* Le mot est affiché sous forme de `_ _ _` pour chaque lettre.
* Le joueur propose une lettre à chaque tour.
* Les lettres correctes découvertes sont affichées à leur position.
* Les tentatives restantes diminuent à chaque erreur.

Exemple de sortie :

```
Mot mystère : _ _ _ _ _
Proposez une lettre : a
Bien joué ! La lettre 'a' est dans le mot.
Mot mystère : _ a _ _ _
```

---

## Règles du jeu

1. Le joueur propose une lettre à chaque tour.
2. Si la lettre est dans le mot, elle est révélée.
3. Si la lettre n'est pas dans le mot, le nombre de tentatives restantes diminue.
4. Le joueur gagne s'il découvre toutes les lettres du mot avant d'épuiser ses essais.
5. Le joueur perd si le nombre de tentatives atteint zéro.

---

## Fonctionnalités

* Sélection aléatoire du mot à deviner dans une liste.
* Gestion des lettres découvertes et affichage dynamique du mot.
* Limitation du nombre de tentatives.
* Vérification de la validité de la lettre proposée (une seule lettre de a à z).
* Messages de réussite ou d’échec clairs.

---

## Structure du code

* `main(String[] args)` : initialise le jeu, choisit le mot, gère les tours et affiche les messages.
* `isWinner(String chosenWord, ArrayList<String> discoveredCorrectLetters)` : vérifie si le joueur a deviné toutes les lettres du mot.

---

## Notes

* Les mots sont prédéfinis dans une liste (`voiture`, `train`, `java`, etc.).
* Le programme fonctionne uniquement avec des lettres minuscules de a à z.
* Le nombre initial de tentatives est de 10, mais peut être modifié dans le code.
