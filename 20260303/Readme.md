# Exercici: Refactorització del Menú (Classe `MenuConsola`)

L'objectiu d'aquest exercici és aplicar els principis de **modularitat** i **reutilització de codi**. Extraurem tota la gestió de la interfície d'usuari (consola) a una classe independent. 

> **Benefici:** Això permetrà que el `main` de la classe `CatalegPelis` sigui molt més net i que el sistema de menús es pugui reutilitzar en qualsevol altre projecte futur.

---

## 📋 Requisits de la classe `MenuConsola`

La classe ha de residir en un paquet d'utilitats i ha de tenir els següents components:

### 1. Atributs (Estat)
* **`String titol`**: Per emmagatzemar el títol del menú (Ex: `"MENÚ GESTIÓ PEL·LÍCULES"`).
* **`List<String> opcions`**: Una llista de cadenes de text per guardar els textos de cada opció disponible.
* **`int opcioSalida`**: Contindrà el numero de menú que sigui Sortir (cada menú podrà ser diferent)
 

### 2. Mètodes a implementar (Comportament)

| Mètode | Descripció |
| :--- | :--- |
| **Constructor** | Ha de rebre el **títol** del menú com a paràmetre i inicialitzar la llista d'opcions. El camp Opció Salida es deixa a 0|
| **`anyadirOpcio(String text)`** | Afegeix una nova línia de text a la llista d'opcions. No la demana dins, la rep d'entrada, pero hauria de comprovar que no la té afegida ja, per no insertar-la dos cops. |
| **Setter i Getter de opcioSalida** | El setter rep el numero que volem que sigui sortir, getter retorna el camp|
| **`mostrarMenu()`** | Imprimeix per pantalla el títol i totes les opcions **numerades** (0, 1, 2...). |
| **`llegirOpcioValida()`** | Gestiona l'entrada de l'usuari. Ha d'incloure un bloc `try-catch` per capturar errors si l'usuari introdueix lletres en lloc de números, si passa aixo apart d'avisar deixarem la opció com  si hagues marcat la opció de sortida. Comprova si el número introduït està dins del rang de la llista (entre 0 i la mida de la llista).|
---

## Consells per a la implementació

1. **Encapsulament:** Recorda posar els atributs com a `private`.
2. **Neteja del Buffer:** Si utilitzes `Scanner.nextInt()`, recorda gestionar el salt de línia restant amb la comanda `scanner.nextLine()`.
3. **Escalabilitat:** Gràcies a l'ús de `List`, el menú hauria de funcionar igual si té 3 opcions o si en té 10, sense haver de canviar el codi de la classe.
