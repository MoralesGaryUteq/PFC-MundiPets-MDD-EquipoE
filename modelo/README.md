# modelo/ — Proyecto nativo de Modelio

Esta carpeta contiene el proyecto UML nativo de MundiPets desarrollado en **Modelio 5.4.01**
(diagrama de clases, perfil `JavaClass` de Java Designer y demás elementos del modelo).

El proyecto se sube comprimido como `Ing.zip`. Modelio importa el proyecto directamente
desde el `.zip`, sin necesidad de descomprimirlo manualmente antes.

## Contenido

| Archivo | Descripción |
|---|---|
| `Ing.zip` | Proyecto Modelio comprimido, listo para importar |

## Cómo importar el modelo en Modelio

1. Descarga o clona el repositorio y localiza `modelo/Ing.zip`.
2. Abre Modelio 5.4.01.
3. Ve a **File → Import → Import project...** (o la opción equivalente de importación de
   proyecto según el menú de tu versión).
4. En el selector de archivos, apunta directamente a `Ing.zip` — Modelio reconoce y extrae
   el proyecto desde el `.zip` automáticamente.
5. Confirma la importación y espera a que Modelio cargue el proyecto en el workspace.
6. Verifica que el módulo **Java Designer 5.4.00** esté habilitado en
   **Configuration → Modules**, ya que el perfil `JavaClass` depende de él.

## Requisitos previos

- Modelio **5.4.01** (o compatible).
- Módulo **Java Designer 5.4.00** instalado y habilitado.
- Sistema operativo probado: Windows x86_64.

