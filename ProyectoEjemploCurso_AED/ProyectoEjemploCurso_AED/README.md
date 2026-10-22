# ☕ Sistema de Estructuras de Datos Dinámicas y Algoritmos Avanzados (AED)

Este es un proyecto enfocado en el diseño, implementación y evaluación de estructuras de datos dinámicas y algoritmos de ordenamiento avanzados en **Java**, construidos de forma nativa para resolver problemas complejos de gestión de datos sin depender de colecciones prefabricadas del lenguaje.

## 🚀 Arquitectura y Patrones del Sistema
El aplicativo adopta una estructura desacoplada para separar la interfaz gráfica de las reglas de negocio y los flujos logísticos:
* **Patrón Arquitectónico:** Orientado a Objetos con organización basada en capas (`Controlador`, `Modelo`, `Vista`).
* **Capa de Procesos (`Procesos`):** Módulos dedicados al procesamiento secuencial y lógico de las operaciones del sistema.

## 🧠 Estructuras de Datos Dinámicas Implementadas
El núcleo del proyecto destaca por el desarrollo propio de componentes jerárquicos y lineales dinámicos basados en la gestión de nodos:
* **Listas Dobles Enlazadas (`ListasDoblesEnlazadas`):** Estructuras lineales dinámicas con punteros bidireccionales para operaciones eficientes de inserción, eliminación y recorrido en ambos sentidos.
* **Listas Enlazadas Simples (`ListasEnlazadas`):** Implementación de colecciones dinámicas de un solo sentido para optimización de memoria.
* **Estructuras Avanzadas (`EstructuraDinamica`):** Algoritmos personalizados para simular y controlar el comportamiento dinámico de la memoria y los objetos de negocio.

## ⚙️ Componentes Técnicos y Persistencia
* **Módulo de Ordenamiento (`Ordenamiento`):** Implementación de algoritmos clásicos y avanzados para organizar colecciones de datos bajo distintos criterios de rendimiento.
* **Módulo de Persistencia Binaria (`Almacenamiento`):** Mecanismo de persistencia local mediante la serialización de objetos en archivos de datos planos (`.bin`), administrando listas de asistentes, empleados y estudiantes.

## 💻 Ejecución
El punto de entrada principal para inicializar la interfaz gráfica y los flujos del sistema se encuentra centralizado en el paquete de arranque:
```bash
src/Principal/
```
