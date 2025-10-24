# Instrucciones para configurar Postman, Newman y Git

Este documento describe cómo instalar **Postman**, **Newman** y cómo ejecutar colecciones de Postman desde tu computadora.

---

## 1. Instalación de Postman

1. Descarga Postman desde su página oficial: https://www.postman.com/downloads/
2. Instala y abre la aplicación.
3. Puedes crear y probar colecciones de manera visual desde la interfaz de Postman

## 2. Instalación de Newman (CLI para Postman)

Newman permite ejecutar colecciones de Postman desde la línea de comandos.

1. Asegúrate de tener Node.js instalado: https://nodejs.org

2. Abre la terminal y ejecuta:

```bash
npm install -g newman

Verifica la instalación:
```bash
newman --version

## 3. Ejecutar colecciones de Postman con Newman

1. Exporta tu colección de Postman a formato JSON:
    En Postman, ve a Collections → … → Export → Collection v2.1 → Export.
2. Ejecuta la colección desde la terminal:

```bash
newman run API-Testing-JsonPlaceholder.postman_collection -e API-Testing-JsonPlaceholder 

```bash
newman run Carga-Basica.postman_collection -e API-Testing-JsonPlaceholder -d carga_basica


