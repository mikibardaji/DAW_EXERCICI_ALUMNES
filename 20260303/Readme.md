# Exercici: Refactorització del Menú (Classe `MenuConsola`)

L'objectiu d'aquest exercici és aplicar els principis de **modularitat** i **reutilització de codi**. Extraurem tota la gestió de la interfície d'usuari (consola) a una classe independent. 

> **Benefici:** Això permetrà que el `main` de la classe `CatalegPelis` sigui molt més net i que el sistema de menús es pugui reutilitzar en qualsevol altre projecte futur.

---

## 📋 Requisits de la classe `MenuConsola`

La classe ha de residir en un paquet d'utilitats i ha de tenir els següents components:

### 1. Atributs (Estat)
* **`String titol`**: Per emmagatzemar el títol del menú (Ex: `"MENÚ GESTIÓ PEL·LÍCULES"`).
* **`List<String> opcions`**: Una llista de cadenes de text per guardar els textos de cada opció disponible.


### 2. Mètodes a implementar (Comportament)

| Mètode | Descripció |
| :--- | :--- |
| **Constructor** | Ha de rebre el **títol** del menú com a paràmetre i inicialitzar la llista d'opcions. |
| **`anyadirOpcio(String text)`** | Afegeix una nova línia de text a la llista d'opcions. |
| **`mostrarMenu()`** | Imprimeix per pantalla el títol i totes les opcions **numerades** (0, 1, 2...). |
| **`llegirOpcio()`** | Gestiona l'entrada de l'usuari. Ha d'incloure un bloc `try-catch` per capturar errors si l'usuari introdueix lletres en lloc de números. Cridarà al metode validarOpcio, i si no passa el metode demanarà que es torni a introduir.|
| **`validarOpcio(int opcio)`** | Comprova si el número introduït està dins del rang de la llista (entre 0 i la mida de la llista). |

---

## Consells per a la implementació

1. **Encapsulament:** Recorda posar els atributs com a `private`.
2. **Neteja del Buffer:** Si utilitzes `Scanner.nextInt()`, recorda gestionar el salt de línia restant amb la comanda `scanner.nextLine()`.
3. **Escalabilitat:** Gràcies a l'ús de `List`, el menú hauria de funcionar igual si té 3 opcions o si en té 10, sense haver de canviar el codi de la classe.
