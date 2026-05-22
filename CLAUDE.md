# CLAUDE.md — exam_algo_2026

> _Mis à jour automatiquement le 2026-05-22 15:02 — ne pas éditer à la main._

## Build & Run

```bat
# Depuis la racine du projet
javac -d bin src\App.java
java -cp bin App
```

VS Code : **F5** (`Launch App` dans `.vscode/launch.json`).
Prérequis : JDK 17+, extension *Extension Pack for Java*.

## Tests

```bat
# Lancer les tests JUnit 5
test.bat
```

VS Code : onglet **Testing** (fiole) → détection automatique via `test/`.
Framework : JUnit 5 (`lib\junit-platform-console-standalone-1.11.4.jar`).

## Structure

```
exam_algo_2026/
├── src/     # Sources Java
├── test/    # Tests JUnit 5
├── bin/     # Bytecode compilé (.class)
└── lib/     # Dépendances JAR (JUnit 5)
```

## Classes publiques

### `App` — `src/App.java`
- `main` (point d'entrée)
- `int lancerDe(int faces)`

### `AppTest` — `test/AppTest.java`
- `lancerDe_retourneEntreBornes()` — vérifie les bornes pour d4/d6/d8/d10/d12/d20
- `lancerDe_facesInvalides_retourneMinusUn()` — vérifie le retour -1 pour faces ≤ 0

