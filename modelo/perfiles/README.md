# perfiles/ — Perfil UML y estereotipos aplicados

Esta carpeta documenta el perfil UML utilizado para habilitar la generación de código y los
estereotipos aplicados sobre el modelo de MundiPets.

## Perfil utilizado

Se empleó el perfil incorporado por el módulo **Java Designer 5.4.00** de Modelio, no un
perfil personalizado. Este perfil se instala junto con el módulo (habilitado en
**Configuration → Modules**) y no se distribuye como un archivo de perfil independiente
exportable por separado; por eso no existe un `.uml`/`.profile` propio en esta carpeta, sino
la documentación de su uso y aplicación dentro del modelo (`modelo/Ing.zip`).

## Estereotipo aplicado

| Estereotipo | Origen | Clases donde se aplicó |
|---|---|---|
| `«JavaClass»` | Perfil de Java Designer 5.4.00 | Propietario, Mascota, HistorialMedico, Vacuna, DocumentoVeterinario, Veterinario, ValidacionMedica, AntecedenteGenetico |

El estereotipo `«JavaClass»` marca las clases del diagrama que el generador debe transformar
en archivos `.java`. No se utilizaron estereotipos adicionales de persistencia, servicios o
controladores (`«Entity»`, `«Service»`, `«Controller»`), ya que el generador estándar de Java
Designer produce estructuras de clase Java y no implementa automáticamente una arquitectura
por capas.

## Contenido de esta carpeta

| Archivo | Descripción |
|---|---|
| `estereotipo-javaclass.md` (o evidencia equivalente) | Notas y/o capturas del proceso de aplicación del estereotipo `«JavaClass»` a las ocho clases del modelo |

## Cómo verificarlo en Modelio

1. Abre el proyecto importado desde `modelo/Ing.zip`.
2. Selecciona cualquiera de las ocho clases del diagrama.
3. En el panel de propiedades, confirma que el estereotipo aplicado es `«JavaClass»`.
4. En **Configuration → Modules**, confirma que **Java Designer 5.4.00** aparece como módulo
   instalado y habilitado; de ahí proviene el perfil.
