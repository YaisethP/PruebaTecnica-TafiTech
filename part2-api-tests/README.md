# Instrucciones para configurar Postman, Newman y Git

Este documento describe cómo instalar **Postman**, **Newman** y **Git**, y cómo ejecutar colecciones de Postman desde tu computadora.

---

## 1. Instalación de Git

1. Descarga Git desde su página oficial: [https://git-scm.com/downloads](https://git-scm.com/downloads)  
2. Ejecuta el instalador y sigue los pasos por defecto.  
3. Verifica la instalación abriendo la terminal y escribiendo:

```bash
git --version

Deberías ver algo como:
git version 2.x.x

## 2. Instalación de Postman

1. Descarga Postman desde su página oficial: https://www.postman.com/downloads/
2. Instala y abre la aplicación.
3. Puedes crear y probar colecciones de manera visual desde la interfaz de Postman

## 3. Instalación de Newman (CLI para Postman)

Newman permite ejecutar colecciones de Postman desde la línea de comandos.

1. Asegúrate de tener Node.js instalado: https://nodejs.org

2. Abre la terminal y ejecuta:

```bash
npm install -g newman

Verifica la instalación:
```bash
newman --version

## 4. Ejecutar colecciones de Postman con Newman

1. Exporta tu colección de Postman a formato JSON:
    En Postman, ve a Collections → … → Export → Collection v2.1 → Export.
2. Ejecuta la colección desde la terminal:

```bash
newman run API-Testing-JsonPlaceholder.postman_collection -e API-Testing-JsonPlaceholder 

```bash
newman run Carga-Basica.postman_collection -e API-Testing-JsonPlaceholder -d carga_basica


