# Plantillas / Configuración del generador

## Situación

Java Designer 5.4.00 es un **módulo compilado** de Modelio (`.jmdac`), distribuido
como binario por Modeliosoft. A diferencia de herramientas como Papyrus + Acceleo
(que exponen plantillas de transformación `.mtl` editables por el usuario), Java
Designer no expone archivos de plantilla de texto que el equipo pueda modificar o
versionar como "plantilla propia".

Por esta razón, esta carpeta **no contiene archivos de plantilla en el sentido
tradicional** (no hay `.mtl`, `.xpt` ni similares que editar). En su lugar,
contiene la documentación de la **configuración efectiva** usada para la
generación de código, siguiendo lo indicado en la Sección 5.1 del informe
(`informe.tex`).

No se incluye el binario `JavaDesigner_5.4.00.jmdac` en este repositorio porque:

- Es un artefacto de terceros (Modeliosoft), no producido ni modificado por el equipo.
- Está disponible públicamente en su fuente oficial (ver abajo).

## Módulo utilizado

| Campo | Valor |
|---|---|
| Módulo | JavaDesigner_5.4.00.jmdac |
| Entorno base | Modelio Open Source 5.4.01 |
| Fuente oficial | https://github.com/ModelioOpenSource/ExtentionsForModelio |
| Licencia | GNU General Public License v3.0 (GPL-3.0) |
| Tipo | Módulo compilado (sin plantillas de texto editables) |

