# Dart-Spielplattform - Projektplan und Status

Dieses Dokument ist der langfristige Projektplan. Es soll nicht alles sofort festlegen, sondern das Projekt in verstaendliche Schritte zerlegen, damit wir Frontend, Backend, Datenbank, Kamera-Erkennung, Hosting und spaetere Hardware-Erweiterungen sauber erarbeiten koennen.

Der aktuelle Arbeitsstand fuer den naechsten konkreten Schritt steht in `ARBEITSSTAND.md`.

## Status-Legende

- `[ ]` Offen
- `[~]` In Arbeit
- `[x]` Erledigt
- `[!]` Blockiert

## 1. Projektidee

Wir entwickeln eine Spielplattform fuer Dartspiele.

Das langfristige Ziel ist ein System aehnlich wie Scolia:

- Kameras erkennen, wo Dartpfeile im Board stecken.
- Die erkannten Treffer werden automatisch an die Spielplattform gemeldet.
- Die Plattform wertet den Treffer je nach Spielmodus aus.
- Spieler sehen Spielstand, Runden, Statistiken und Verlauf in einer Weboberflaeche.
- Spaeter kann ein kleiner lokaler Rechner mehrere Kameras auswerten und die Daten an den Server schicken.

Fuer den Anfang starten wir bewusst einfacher:

- Ein Handy dient als Kamera.
- Die Auswertung kann anfangs manuell, halbautomatisch oder experimentell automatisch erfolgen.
- Der Rechner oder Server empfaengt Treffer-Events.
- Ein erstes Spiel laeuft im Browser.

## 2. Lernziel

Das Projekt soll als Fullstack-Lernprojekt dienen. Deshalb dokumentieren wir nicht nur das Ergebnis, sondern auch Entscheidungen, Alternativen und Reihenfolge.

Wichtige Lernbereiche:

- Frontend: Benutzeroberflaeche fuer Spieler, Spiele, Scoreboard und Admin-/Setup-Seiten.
- Backend: API, Spielregeln, Sessions, Benutzer, Events und Validierung.
- Datenbank: Speicherung von Spielern, Spielen, Wuerfen, Statistiken und Geraeten.
- Kamera/Computer Vision: Erkennung von Board, Segmenten und Pfeilen.
- Infrastruktur: lokales Hosting auf eigenem Server, Deployment, Logs, Backups und Netzwerk.
- Architektur: saubere Schnittstellen zwischen Kamera, Backend und Frontend.

## 3. Grobes Zielbild

### Komponenten

- Mobile Kamera-App oder Web-App auf dem Handy
- Backend-Server
- Datenbank
- Web-Frontend
- Spiel-Engine
- Kamera-Erkennungsmodul
- Geraete-/Board-Konfiguration
- Spaeter: lokaler Mini-Rechner mit drei Kameras

### Datenfluss im Zielbild

1. Kamera sieht das Dartboard.
2. Erkennung bestimmt die Position des Pfeils.
3. Aus Position wird ein Dart-Segment berechnet, zum Beispiel `T20`, `S5`, `D16` oder `Bull`.
4. Das Treffer-Event wird an das Backend gesendet.
5. Das Backend prueft Spielzustand und Regeln.
6. Die Datenbank speichert Wurf, Spielstand und Statistik.
7. Das Frontend aktualisiert die Anzeige live.

## 4. Erste realistische Projektphase

Die erste Phase soll beweisen, dass die Plattform als Software funktioniert, ohne dass die Kamera-Erkennung schon perfekt sein muss.

Ziel:

- Ein Spiel kann im Browser gestartet werden.
- Spieler koennen angelegt oder ausgewaehlt werden.
- Ein Treffer kann an das Backend gesendet werden.
- Das Backend berechnet den Spielstand.
- Das Frontend zeigt den aktuellen Zustand.
- Die Datenbank speichert den Verlauf.

Moegliche Vereinfachung:

- Treffer werden zuerst manuell ueber Buttons eingegeben.
- Danach bauen wir eine Handy-Kamera-Seite, die testweise Bilder oder Events sendet.
- Erst danach kommt echte Pfeilerkennung.

## 5. Offene Grundentscheidungen

Diese Punkte klaeren wir schrittweise, bevor wir zu viel Code schreiben.

### Technologie

- [x] Backend: Java mit Spring Boot als bevorzugter Start.
- Frontend: einfache HTML/CSS/JavaScript-Seite, React, Vue oder anderes?
- Datenbank: PostgreSQL, SQLite, MariaDB oder anderes?
- Live-Updates: WebSocket, Server-Sent Events oder Polling?
- Mobile Kamera: Browser-Web-App, native Android-App oder Cross-Plattform-App?

### Infrastruktur

- Auf welchem Server soll gehostet werden?
- Laeuft dort Docker?
- Soll die Anwendung spaeter per Domain erreichbar sein?
- Gibt es schon Reverse Proxy, HTTPS oder Container-Setup?

### Kamera-Verbindung

- Handy sendet Bilder/Videos direkt an Backend.
- Handy verarbeitet lokal und sendet nur Treffer-Events.
- Handy streamt Video an Rechner.
- Bluetooth ist fuer Video meist ungeeignet; WLAN ist fuer den Anfang wahrscheinlich realistischer.
- Mobilfunk ist spaeter denkbar, aber fuer lokalen Spielbetrieb vermutlich nicht der erste Schritt.

### Spielumfang

- [x] Erstes Spiel: `501`.
- Spaeter: Cricket, Around the Clock, Trainingsspiele, Multiplayer, Turniere.

## 6. Teilprojekte

### A. Projektorganisation

Status: In Arbeit

- Projektordner strukturieren
- Git einrichten
- README anlegen
- Entwicklungsumgebung dokumentieren
- Aufgabenliste pflegen

### B. Backend

Status: In Arbeit

- [x] API-Grundgeruest erstellen
- Spiel-Session starten
- Spieler verwalten
- [x] Erstes manuelles Treffer-Event entgegennehmen
- [~] Spielstand berechnen
- Fehler und ungueltige Wuerfe behandeln
- Tests fuer Spielregeln schreiben

### C. Datenbank

Status: Offen

- Datenmodell entwerfen
- Tabellen fuer Spieler, Spiele, Legs, Sets, Wuerfe und Geraete planen
- Migrationen einrichten
- Lokale Entwicklungsdatenbank starten
- Backup-Strategie fuer Heimserver klaeren

### D. Frontend

Status: Offen

- Erste Spieloberflaeche bauen
- Spieler-Auswahl
- Scoreboard
- Manuelle Treffer-Eingabe
- Live-Aktualisierung
- Mobile Ansicht fuer Handy und Tablet

### E. Kamera und Erkennung

Status: Offen

- Handy-Kamera im Browser testen
- Bild an Backend senden oder lokal auswerten
- Dartboard kalibrieren
- Board-Segmente bestimmen
- Pfeilposition erkennen
- Treffer in Segment umrechnen
- Genauigkeit messen

### F. Geraete und Setup

Status: Offen

- Board-Konfiguration speichern
- Kamera-Position speichern
- Testmodus fuer Kalibrierung
- Spaeter: Mini-Rechner mit drei Kameras
- Spaeter: Geraete-Registrierung und Health Checks

### G. Hosting

Status: Offen

- Lokaler Entwicklungsstart
- Deployment auf Heimserver
- Datenbank auf Server
- Reverse Proxy und HTTPS
- Logs, Monitoring und Backups

## 7. Empfohlene Reihenfolge

1. Projekt als Git-Repository initialisieren.
2. Entscheidung fuer erste Tech-Stack-Version treffen.
3. Minimalen Backend-Prototyp bauen.
4. Erstes Datenmodell fuer Spiel, Spieler und Wuerfe erstellen.
5. Erstes Frontend mit manueller Eingabe bauen.
6. Spiel `501` regelkonform berechnen.
7. Live-Aktualisierung zwischen mehreren Browsern bauen.
8. Handy-Kamera-Seite als Experiment starten.
9. Kamera sendet Testdaten an Backend.
10. Computer-Vision-Prototyp fuer Board- und Pfeilerkennung bauen.
11. Kalibrierung und Genauigkeit verbessern.
12. Deployment auf Heimserver.
13. Spaeter Hardware-Konzept mit Mini-Rechner und drei Kameras.

## 8. Erste konkrete Aufgaben

Diese Liste ist der direkte Startpunkt.

- [x] Klaeren, ob dieses Projekt in Java bleiben soll oder ob ein anderer Stack sinnvoller ist.
- [x] Git-Repository lokal initialisieren.
- [x] Remote-Repository pruefen oder verbinden.
- [x] Spring Boot als Starttechnologie fuer Phase 1 festlegen.
- [x] Java und Maven sind vorhanden.
- [ ] `README.md` spaeter erstellen, sobald es etwas Startbares gibt.
- [ ] Minimalarchitektur skizzieren.
- [x] Erstes Spiel festlegen.
- [~] Datenmodell grob entwerfen.
- [x] Backend-Grundgeruest erstellen.
- [x] Erste Test-URL `/health` lokal testen.
- [x] `/health` als JSON-Antwort umsetzen.
- [x] Spring Boot DevTools einrichten und testen.
- [ ] Frontend-Grundgeruest erstellen.
- [ ] Erste manuelle Treffer-Eingabe bauen.
- [ ] Ersten kompletten Spielablauf lokal testen.

## 9. Beantwortete Startfragen

Diese Punkte sind fuer den Start geklaert:

- Backend bevorzugt in Java.
- Erste Version so einfach wie moeglich, damit schnell ein testbares Ergebnis entsteht.
- Heimserver: Mac mini 2012 mit Ubuntu Server, aktuell noch nicht fertig konfiguriert.
- Erfahrungsstand: HTML/CSS-Grundlagen, sonst noch wenig Praxis mit Git, Backend, Datenbanken und Fullstack.
- Erstes Spiel: `501`.

Aktueller naechster Schritt:

- Minimalen `501`-Backend-Prototyp festigen und Eingaben validieren.

## 10. Geklaerte Entscheidungen

Stand: 2026-08-08

### Backend-Sprache

Wir starten bevorzugt mit Java.

Grund:

- Java ist ausdruecklich ein Lernziel.
- Das Projekt eignet sich gut, um das Java-Oekosystem praktisch zu verstehen.
- Mit Spring Boot koennen wir Backend, REST-API, Datenbankzugriff und spaeter WebSockets in einem verbreiteten Java-Stack lernen.

Entscheidung:

- Spring Boot wird fuer Phase 1 verwendet.
- Das Frontend startet zunaechst als einfache HTML/CSS/JavaScript-Seite im Spring-Boot-Projekt.
- Ein separates Frontend-Framework wie React oder Vue kommt erst spaeter in Frage, wenn es wirklich gebraucht wird.

Wichtig zur Einordnung:

- Java, HTML, CSS und JSON sind nicht dieselbe "Familie", arbeiten aber in Web-Projekten eng zusammen.
- Java laeuft in unserem Fall auf dem Server und verarbeitet Logik.
- HTML beschreibt die Struktur der Webseite.
- CSS gestaltet die Webseite.
- JavaScript macht die Webseite im Browser interaktiv.
- JSON ist ein Datenformat, mit dem Frontend, Backend und spaeter Kamera-Komponenten Daten austauschen.

### Erste App-Version

Die erste Version soll die einfachste realistische Version sein, damit schnell ein sichtbarer Erfolg entsteht.

Deshalb starten wir nicht direkt mit echter Kamera-Erkennung. Stattdessen:

1. Browser-Seite zeigt ein `501`-Spiel.
2. Treffer werden zuerst manuell eingegeben.
3. Backend berechnet den Spielstand.
4. Danach bauen wir eine Handy-Seite, die Kamera-Zugriff bekommt.
5. Danach pruefen wir, ob die Handy-Seite Bilder, Video-Frames oder erkannte Treffer an das Backend sendet.

Diese Reihenfolge ist wichtig, weil wir so erst die Spielplattform verstehen, bevor wir die schwierigere Bilderkennung einbauen.

### Heimserver

Es gibt einen Mac mini 2012 mit Ubuntu Server.

Aktueller Stand:

- Der Server ist erreichbar.
- Es ist noch nicht klar, welche Dienste installiert oder konfiguriert sind.
- Server-Setup wird spaeter als eigenes Lernfeld behandelt.

Spaeter pruefen wir gemeinsam:

- Ubuntu-Version
- Benutzer und SSH-Zugriff
- Netzwerk/IP-Adresse
- Docker-Verfuegbarkeit
- Firewall
- Speicherplatz
- Reverse Proxy
- HTTPS
- Backup-Konzept

### Erfahrungsstand

Aktueller Stand:

- HTML und CSS wurden in einem kurzen Lehrgang angerissen.
- Git, Datenbanken, Backend und Fullstack-Entwicklung sind noch weitgehend neu.

Konsequenz fuer die Arbeitsweise:

- Wir arbeiten in kleinen Schritten.
- Jeder neue technische Begriff wird am konkreten Projekt erklaert.
- Erst funktionierende Mini-Version, dann verbessern.
- Keine grossen Framework-Spruenge ohne Grund.

### Erstes Spiel

Wir starten mit `501`.

Gruende:

- Es ist ein bekanntes Standardspiel.
- Die Regeln sind klar genug fuer einen ersten Prototyp.
- Score, Wuerfe, Runden und Bust-Regeln eignen sich gut, um Backend-Logik zu lernen.

## 11. Naechster Lernschritt

Der erste minimale `501`-Spielzustand und ein API-Ablauf fuer manuelle Wuerfe sind als Prototyp vorhanden. Als naechstes festigen wir diesen Stand und validieren Eingaben.

Empfohlener Ablauf:

1. Zusammenspiel von Controller, Spiel und Dartpfeil sicher verstehen.
2. Segmentwert und Multiplikator validieren.
3. Bust und Checkout schrittweise modellieren und testen.
4. Danach eine sehr einfache HTML-Seite anzeigen.
5. `README.md` fuer die startbare Version erstellen.

Erstes Ziel fuer den Code:

- Der Server startet lokal.
- Im Browser ist eine Seite oder API erreichbar.
- Wir verstehen, welche Rolle Java, HTML, CSS und JSON jeweils spielen.

## 12. Arbeitsweise

Wir arbeiten iterativ:

- Erst Ziel und Teilaufgabe klaeren.
- Dann kleine technische Entscheidung treffen.
- Dann implementieren.
- Dann lokal testen.
- Dann dokumentieren, was wir gelernt haben.

Dieses Dokument wird nach jedem groesseren Schritt aktualisiert.
