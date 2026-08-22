# Dart-Spielplattform - Arbeitsstand

Diese Datei ist unser aktueller Arbeitszettel. Der langfristige Plan bleibt in `PROJEKTPLAN.md`.

## Status-Legende

- `[ ]` Offen
- `[~]` In Arbeit
- `[x]` Erledigt
- `[!]` Blockiert

## Jetzt

- [~] Minimalen `501`-Backend-Prototyp festigen und verstehen.

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
- [x] Minimalen `501`-Spielzustand als Java-Klasse modellieren.
- [x] Einen Dartwurf mit Segmentwert und Multiplikator modellieren.
- [x] Aktuellen Spielstand ueber `GET /game` als JSON ausgeben.
- [x] Einen Wurf ueber `POST /game/wurf` entgegennehmen.
- [x] Wurfpunkte berechnen und vom aktuellen Spielstand abziehen.
- [x] Ersten kompletten API-Ablauf mit `501 -> 441` lokal testen.
- [~] Vorhandenen Java- und Spring-Ablauf festigen.
- [ ] Eingabewerte fuer Segment und Multiplikator validieren.
- [ ] Bust- und Checkout-Regeln schrittweise planen und umsetzen.
- [ ] Automatische Tests fuer Spiel- und Wurflogik schreiben.
- [ ] Kurz erklaeren, welche Rolle Java, HTML, CSS, JavaScript und JSON im Projekt haben.
- [ ] `README.md` spaeter anlegen, sobald es etwas Startbares gibt.

## Hinweise

- Lokales Git-Repository ist vorhanden.
- Aktueller Branch: `main`.
- Letzter bekannter Commit: `caa8164 stand_21.08.26`.
- Remote ist verbunden: `https://github.com/cwrembel/Darts_App_Java.git`.
- Java und Maven sind auf dem Entwicklungsrechner vorhanden.
- Spring Boot startet lokal auf `http://localhost:8080`.
- `GET http://localhost:8080/game` antwortet mit dem aktuellen Punktestand als JSON.
- `POST http://localhost:8080/game/wurf` nimmt Segmentwert und Multiplikator entgegen.
- Ein Testwurf `T20` hat den Spielstand erfolgreich von `501` auf `441` reduziert.
- Der Spielzustand liegt aktuell nur im Arbeitsspeicher und geht bei einem Neustart verloren.
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

Wir festigen als Naechstes den vorhandenen minimalen `501`-Backend-Prototyp. Noch ohne Datenbank und ohne Frontend.

Dabei klaeren wir praktisch und in kleinen Schritten:

- Wie arbeiten `GameController`, `Spiel` und `Dartpfeil` zusammen?
- Was sind Klassen, Objekte, Felder, Konstruktoren, Methoden und Parameter?
- Wie unterscheiden sich `GET` und `POST`?
- Wie pruefen wir ungueltige Eingaben, bevor der Spielstand veraendert wird?
- Wie modellieren wir danach Bust und Checkout regelkonform?
- Wann beginnen wir mit automatischen Tests und einer einfachen HTML-Oberflaeche?
