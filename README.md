# Project DACD - Sprint 1

## Descripción

Este proyecto forma parte de la asignatura **Desarrollo de Aplicaciones para Ciencia de Datos (DACD)**.

El objetivo de este primer sprint es comenzar la construcción de una aplicación Java organizada en múltiples módulos, capaz de:

* Obtener datos desde una **API pública**
* Obtener datos mediante **scraping web**
* Procesar y organizar la información obtenida

---

## Estructura del proyecto

El proyecto se ha organizado como un **proyecto multimódulo utilizando Maven**, con la siguiente estructura:

```
project-dacd-sprint1
│
├── source-api
│   ├── ApiClient
│   └── ApiService
│
└── source-scraper
    ├── ScraperClient
    └── ScraperService
```

---

## Arquitectura inicial

Se ha definido una separación clara de responsabilidades entre los módulos:

* **source-api** → Encargado de gestionar la comunicación con APIs externas.
* **source-scraper** → Encargado de realizar la extracción de datos desde páginas web.

Dentro de cada módulo se han definido dos tipos principales de clases:

* **Client** → Responsable de realizar la conexión o acceso a la fuente de datos.
* **Service** → Responsable de gestionar la lógica de negocio y el procesamiento de la información.

---

## Tecnologías utilizadas

Las principales tecnologías empleadas en este proyecto son:

* **Java 21**
* **Maven** (gestión de dependencias y estructura multimódulo)
* **IntelliJ IDEA** (entorno de desarrollo)
* **Git y GitHub** (control de versiones)

---

## Enfoque del proyecto

El sistema integrará distintas fuentes de información económica con el objetivo de analizar la relación entre noticias recientes y fluctuaciones en los mercados financieros.

Se combinarán:

- Noticias globales mediante NewsAPI
- Precios y estadísticas de criptomonedas mediante CoinGecko API
- Datos financieros adicionales (acciones y tasas de cambio) mediante Alpha Vantage

---

## Objetivo funcional

Permitir:

- Relacionar variaciones en precios de criptomonedas con noticias económicas recientes.
- Generar visualizaciones o alertas basadas en eventos relevantes.
- Construir un pequeño sistema de seguimiento financiero combinado.