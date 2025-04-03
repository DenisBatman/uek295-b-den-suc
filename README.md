# Projekt für das Backend eines Buchladens

Dies ist ein Backend-System für einen Buchladen, das mit **Spring Boot** entwickelt wurde. Es implementiert grundlegende CRUD-Operationen für zwei Hauptentitäten: **Customer** (Kunden) und **Address** (Adressen). Das Projekt folgt den Prinzipien einer dreischichtigen Architektur (Controller, Service, Repository) und verwendet **PostgreSQL** für die Datenpersistenz.

## Inhaltsverzeichnis

- [Projektbeschreibung](#projektbeschreibung)
- [Technologien](#technologien)
- [Installation](#installation)
- [Verwendung](#verwendung)
- [Endpunkte](#endpunkte)
- [Tests](#tests)
- [Lizenzen](#lizenzen)

## Projektbeschreibung

Das Projekt implementiert die Verwaltung von Kunden und deren Adressen in einem Buchladen. Es enthält folgende Komponenten:

- **Customer**: Repräsentiert einen Kunden mit Attributen wie Name, Telefonnummer und Geburtsdatum.
- **Address**: Repräsentiert eine Adresse mit Attributen wie Stadt, Straße und Land.

Das Backend ist so aufgebaut, dass es mit einer **PostgreSQL-Datenbank** kommuniziert und grundlegende REST-API-Endpunkte zur Verwaltung von Kunden und Adressen bereitstellt.

## Technologien

- **Spring Boot**: Framework für die Entwicklung von Java-basierten Anwendungen.
- **JPA (Java Persistence API)**: Für die Datenbankinteraktion.
- **PostgreSQL**: Datenbankmanagementsystem zur Persistierung der Daten.
- **Lombok**: Zum Reduzieren von Boilerplate-Code.
- **Swagger**: Zur Dokumentation der API.

## Installation

Um das Projekt lokal auszuführen, folge diesen Schritten:

1. **Klonen des Repositories**:
   ```bash
   git clone https://github.com/dein-benutzername/projekt-uek295.git
