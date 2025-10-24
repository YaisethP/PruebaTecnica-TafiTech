# Análisis y Propuesta de QA

## 1. Priorización de Automatización

**Inicio de automatización:**  
- **APIs primero** (REST y gRPC), ya que contienen la lógica central del negocio, son más estables y rápidas de automatizar que la UI.  
- **UI** se automatizará después, enfocándose en flujos críticos y frecuentes.  

**Criterios para priorizar pruebas:**  
- Criticidad de la funcionalidad (ej. login, pagos, procesos core).  
- Frecuencia de uso por los usuarios.  
- Riesgo de regresión o impacto en producción.  
- Dependencias entre módulos y servicios.  
- Complejidad y facilidad de automatización (priorizando ROI en tiempo).  

---

## 2. Herramientas Recomendadas

| Tipo de prueba  | Herramienta                                                       | Motivo                                                                  |
| --------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------------- |
| API REST / gRPC | **Serenity BDD + RestAssured** o **Postman/Newman**               | Integración con CI/CD, reportes claros y soporte a múltiples protocolos |
| UI Web          | **Serenity BDD + Selenium / Playwright**                          | Soporte a Screenplay, paralelismo y buena legibilidad                   |
| DB              | **MongoDB Compass** o validaciones con **Serenity + Java Driver** | Validar integridad de datos post-request                                |
| CI/CD           | **GitHub Actions / Jenkins**                                      | Automatización del pipeline de pruebas                                  |
| Reportes        | **Serenity Reports + Allure**                                     | Métricas visuales y trazabilidad de escenarios                          |
| Gestión QA      | **Azure DevOps / Jira / TestRail**                                | Trazabilidad entre requerimientos, casos y defectos                     |

**Justificación:**  
- Aunque algunas herramientas no se han usado directamente, la investigación indica que son **compatibles con el stack, mantenibles y permiten integración continua efectiva**.  

---

## 3. Proceso de QA (Releases cada 2 semanas)

**Involucramiento de QA:**  
- Participa desde **el inicio del sprint**, revisando historias y criterios de aceptación.  
- Durante el sprint: define tests automatizados y casos manuales críticos.  
- Antes del release: ejecuta pruebas automatizadas y manuales clave, valida regresión y aprueba release.  

**Qué automatizar vs manual:**  

| Tipo | Qué cubrir |
|------|-----------|
| Automatizado | APIs críticas, flujos de negocio frecuentes, integración con Kafka/MongoDB |
| Manual | UI exploratoria, casos poco frecuentes, validación visual y experiencia de usuario |


---

## 4. Métricas de Calidad
1. Cobertura de tests automatizados (% endpoints críticos)
2. Número de bugs por sprint, categorizados por severidad
3. Tiempo medio de detección y resolución de bugs (MTTD / MTTR)
4. % de builds exitosos en CI/CD
5. Reaparición de bugs/regresiones en producción


---

## Explicación

Este plan prioriza la estrategia aprovechando la automatización para automatizar lo que ofrece mayor retorno de inversión.
Se busca equilibrar la velocidad y la cobertura con la que se hacen las cosas, paso a paso hasta lograr una estabilidad que ronde la perfección.
Busco utilizar herramientas del mercado, que ya conozca o a las que me pueda adaptar aportando flexibilidad para adaptarme a los cambios que puedan existir en el sprint.

Se supone que:
1. El equipo tiene acceso a repositorios y pipelines CI/CD.
2. La UI se automatizará gradualmente según disponibilidad y estabilidad del diseño.
3. Las herramientas serán elegidas considerando experiencia previa y mejores prácticas, priorizando integración con CI/CD y trazabilidad.
