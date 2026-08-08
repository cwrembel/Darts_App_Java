# Dart-Spielplattform - Arbeitsstand

Diese Datei ist unser aktueller Arbeitszettel. Der langfristige Plan bleibt in `PROJEKTPLAN.md`.

## Status-Legende

- `[ ]` Offen
- `[~]` In Arbeit
- `[x]` Erledigt
- `[!]` Blockiert

## Jetzt

- [~] Projektstruktur vorbereiten und klaeren, wie wir den Start technisch aufbauen.

## Als Naechstes

- [x] Git-Repository lokal initialisieren.
- [ ] Remote-Repository pruefen oder verbinden.
- [ ] `README.md` anlegen.
- [ ] Spring-Boot-Grundgeruest erstellen.
- [ ] Erste Test-URL bauen, zum Beispiel `/health`.
- [ ] Kurz erklaeren, welche Rolle Java, HTML, CSS, JavaScript und JSON im Projekt haben.

## Hinweise

- Lokales Git-Repository ist vorhanden.
- Aktueller Branch: `main`.
- Erster Commit: `7b58e5c Start`.
- Aktuell ist kein Remote eingetragen, `git remote -v` liefert keine URL.

## Blockiert

- Keine Blocker.

## Aktuelle Entscheidungen

- Backend startet bevorzugt mit Java und Spring Boot.
- Erste Version soll so einfach wie moeglich sein.
- Erstes Spiel ist `501`.
- Kamera-Erkennung kommt erst nach einem funktionierenden manuellen Spielprototyp.
- Heimserver-Setup wird spaeter separat geprueft.

## Offene Entscheidungen

- Frontend zuerst als einfache HTML/CSS/JavaScript-Seite oder direkt mit Framework?
- Datenbank fuer den Start: SQLite, PostgreSQL oder erst In-Memory?
- Live-Updates spaeter per WebSocket, Server-Sent Events oder Polling?
- Handy-Kamera spaeter als Browser-Web-App oder native App?

## Naechster konkreter Schritt

Wir sollten als Naechstes pruefen, ob das lokale Repository mit einem Online-Repository verbunden werden soll. Danach erstellen wir ein minimales Spring-Boot-Projekt.

Dabei klaeren wir praktisch:

- Was ist ein Repository?
- Was macht Spring Boot?
- Was ist eine API?
- Was bedeutet eine URL wie `/health`?
- Wie kommen spaeter HTML, CSS und JSON dazu?
