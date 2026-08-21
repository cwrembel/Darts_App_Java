# Dart-Spielplattform - Arbeitsstand

Diese Datei ist unser aktueller Arbeitszettel. Der langfristige Plan bleibt in `PROJEKTPLAN.md`.

## Status-Legende

- `[ ]` Offen
- `[~]` In Arbeit
- `[x]` Erledigt
- `[!]` Blockiert

## Jetzt

- [~] Ersten minimalen `501`-Spielzustand planen.

## Als Naechstes

- [x] Git-Repository lokal initialisieren.
- [x] Remote-Repository pruefen oder verbinden.
- [x] Spring Boot als Starttechnologie fuer Phase 1 festlegen.
- [x] Java und Maven sind laut aktuellem Stand installiert.
- [x] Spring-Boot-Grundgeruest gemeinsam erstellen.
- [x] Erste Test-URL bauen, zum Beispiel `/health`.
- [x] `/health` lokal im Browser testen.
- [x] JSON-Antwort fuer `/health` verstehen und vorbereiten.
- [x] Spring Boot DevTools einrichten und automatischen Neustart testen.
- [~] Minimalen `501`-Spielzustand als naechsten API-Schritt verstehen.
- [ ] Kurz erklaeren, welche Rolle Java, HTML, CSS, JavaScript und JSON im Projekt haben.
- [ ] `README.md` spaeter anlegen, sobald es etwas Startbares gibt.

## Hinweise

- Lokales Git-Repository ist vorhanden.
- Aktueller Branch: `main`.
- Letzter bekannter Commit: `50ede15 Start`.
- Remote ist verbunden: `https://github.com/cwrembel/Darts_App_Java.git`.
- Java und Maven sind auf dem Entwicklungsrechner vorhanden.
- Spring Boot startet lokal auf `http://localhost:8080`.
- `http://localhost:8080/health` antwortet mit JSON.
- Spring Boot DevTools startet die App bei Code-Aenderungen automatisch neu.

## Blockiert

- Keine Blocker.

## Aktuelle Entscheidungen

- Backend startet bevorzugt mit Java und Spring Boot.
- Spring Boot wird fuer Phase 1 gemeinsam eingerichtet.
- Frontend startet am Anfang als einfache HTML/CSS/JavaScript-Seite im Spring-Boot-Projekt.
- Erste Version soll so einfach wie moeglich sein.
- Erstes Spiel ist `501`.
- Kamera-Erkennung kommt erst nach einem funktionierenden manuellen Spielprototyp.
- Heimserver-Setup wird spaeter separat geprueft.

## Offene Entscheidungen

- Datenbank fuer den Start: SQLite, PostgreSQL oder erst In-Memory?
- Live-Updates spaeter per WebSocket, Server-Sent Events oder Polling?
- Handy-Kamera spaeter als Browser-Web-App oder native App?

## Naechster konkreter Schritt

Wir planen als Naechstes einen ersten minimalen `501`-Spielzustand. Noch ohne Datenbank und ohne Frontend.

Dabei klaeren wir praktisch:

- Was ist ein Repository?
- Was macht Spring Boot?
- Was ist eine API?
- Was bedeutet eine URL wie `/health`?
- Wie kommen spaeter HTML, CSS und JSON dazu?
- Wann ist eine `README.md` sinnvoll?
- Wie modellieren wir einen sehr einfachen Spielstand?
