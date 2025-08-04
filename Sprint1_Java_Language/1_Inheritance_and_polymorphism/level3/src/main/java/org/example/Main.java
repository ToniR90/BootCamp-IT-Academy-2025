package org.example;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

    }
}

/*src/
└── main/
    ├── java/
    │   └── org/example/level3/
    │       ├── Level3Application.java         ← Classe principal amb @SpringBootApplication
    │
    │       ├── model/
    │       │   ├── Redactor.java
    │       │   ├── Noticia.java               ← Classe base abstracta
    │       │   ├── FutbolNoticia.java
    │       │   ├── BasquetNoticia.java
    │       │   ├── TenisNoticia.java
    │       │   ├── F1Noticia.java
    │       │   ├── MotociclismeNoticia.java
    │       │   └── enums/
    │       │       ├── Esport.java
    │       │       └── ...
    │
    │       ├── rules/
    │       │   ├── PreuRule.java
    │       │   ├── PuntuacioRule.java
    │       │   ├── futbol/
    │       │   │   ├── FutbolPreuRule.java
    │       │   │   └── FutbolPuntuacioRule.java
    │       │   └── ...
    │
    │       ├── service/
    │       │   ├── RedactorService.java       ← CRUD de redactors
    │       │   ├── NoticiaService.java        ← CRUD de notícies
    │       │   ├── PreuCalculator.java
    │       │   └── PuntuacioCalculator.java
    │
    │       ├── controller/
    │       │   ├── RedactorController.java    ← REST endpoints per redactors
    │       │   └── NoticiaController.java     ← REST endpoints per notícies
    │
    │       └── config/
    │           └── Constants.java             ← Sou, preus base, etc.
    │
    └── resources/
        ├── application.properties             ← Configuració de Spring Boot
        └── static/                            ← (Opcional) HTML/CSS si hi ha interfície web*/