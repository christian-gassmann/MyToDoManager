## View Binding
- Zweck: Typ-sichere Referenzierung von Views
- Vorteile: Kein `findViewById()`, weniger Fehler
- Status: Eingesetzt in allen Fragments

## Fragments
- Zweck: Modularisierung der UI
- Herausforderungen: Lifecycle-Handling, Kommunikation
- Status: Erste Implementierungen aktiv

## JUnit
- Zweck: Automatisiertes Testen von Methoden und Klassen (insbesondere Logik)
- Vorteile:
- - Wiederholbar und schnell ohne manuelles Testen
  - Sicherheit bei Code-Änderungen durch sofortiges Feedback
  - Unterstützt sauberes Arbeiten mit Testklassen und Setup (@Before)
  - Dokumentiert das erwartete Verhalten von Code (z. B. addTask_shouldIncreaseListSize)
- Nicht geeignet für: UI-Tests, Datenbankoperationen, Netzwerkzugriffe
- Best Practices:
- - Jeder Test prüft genau ein Verhalten
  - Tests sind unabhängig voneinander (kein geteilter Zustand)
  - Klar benannte Testmethoden (methode_situation_erwartung) verbessern Lesbarkeit
  - Setup in @Before
- Status:
- - Erste Testklasse (TaskControllerTest) erfolgreich erstellt
  - Absicherung von Normalfällen (z. B. addTask) und Sonderfällen (null, leere Titel, Kopien)
  - Controller über clearList() teststabil gemacht
