# MundiPets — Módulo de Gestión y Validación Médica de la Mascota

Documento de exposición-demostración del ciclo de **Desarrollo Dirigido por Modelos (MDD)** aplicado al subsistema **Módulo de Gestión y Validación Médica de la Mascota** del proyecto de fin de curso (PFC) **MundiPets**.

---

## (i) Título del proyecto y equipo

**Proyecto:** MundiPets — Módulo de Gestión y Validación Médica de la Mascota (documento MDD)
**Materia:** Ingeniería de Requerimientos
**Institución:** Universidad Técnica Estatal de Quevedo (UTEQ) — Facultad de Ciencias de la Computación, Carrera de Ingeniería en Software
**Docente:** Ing. Guerrero Ulloa Gleiston Cicerón
**Equipo:** Equipo E

| Integrante |
|---|
| Jimmy Samuel Nieves Sánchez |
| Gary Alejandro Morales Sánchez |

## (ii) Descripción del sistema PFC y del subsistema modelado

**MundiPets** es una plataforma para la adopción de mascotas y la crianza responsable, que conecta adoptantes, organizaciones/refugios y criadores registrados.

El subsistema modelado por el Equipo E es el **Módulo de Gestión y Validación Médica de la Mascota**, compuesto por **8 clases de dominio**, y da soporte a los siguientes requerimientos funcionales:

`RF02` · `RF03` · `RF09` · `RF10` · `RF14` · `RF16`

El documento recorre las tres capas del MDD (CIM → PIM → PSM) y describe las transformaciones M2M/M2T aplicadas sobre este modelo para llegar al código.

## (iii) Herramienta empleada (versión exacta)

| Herramienta | Versión | Uso |
|---|---|---|
| **Modelio** | 5.4, edición **Community** [confirmar build exacto, ej. 5.4.1, si difiere] | Modelado UML (diagrama de clases, perfil) |
| **Módulo Java Designer** | [confirmar versión del módulo instalado desde el Modelio Marketplace] | Generación de código M2T (Java) y reverse engineering |
| **Java / JDK objetivo** | 17 | Plataforma del código generado |
| **IntelliJ IDEA** | 	Ultimate 2026.2, build IU-262.8665.258 | IDE para abrir, compilar y ejecutar el código generado |

## (iv) Requisitos previos

| Componente | Requisito | Uso |
|---|---|---|
| **JDK para ejecutar Modelio** | JDK 11 o superior instalado (no solo JRE) — confirmar la versión exacta usada, ya que Modelio la exige para arrancar | Ejecutar el propio Modelio 5.4 |
| **JDK objetivo del código generado** | JDK 17 | Compilar y ejecutar el código generado |
| **IntelliJ IDEA** | Ultimate 2026.2 | Abrir, compilar y ejecutar el proyecto Java generado |
| **Modelio 5.4 Community + módulo Java Designer** | Instalado desde modelio.org / Modelio Marketplace | Modelado y generación de código |
| **Distribución LaTeX** | TeX Live 2023+ o MiKTeX | Compilar `informe.tex` |
| **Biber** | 2.19+ (incluido en TeX Live/MiKTeX) | Procesar `referencias.bib` |
| **Git** | Cualquier versión reciente | Clonar el repositorio |

**Sistema operativo probado:** [completar, ej. Windows 10/11 de 64 bits — indicar el SO real usado por el equipo].

## (v) Instrucciones reproducibles paso a paso

> Nota: la generación de código (pasos 3-4) corresponde a las secciones 6-8 del informe, que están en desarrollo. Estos pasos son la guía base sobre el flujo estándar de Modelio Java Designer; ajústenlos a los clics exactos una vez ejecuten y capturen la generación real.

**1. Clonar el repositorio**

```bash
git clone [URL_DEL_REPOSITORIO]
cd [nombre-carpeta-repositorio]
```

**2. Abrir el modelo en Modelio**

1. Abrir Modelio 5.4 (Community).
2. `File → Open Project` y seleccionar el archivo de proyecto Modelio (`.modelio` o carpeta de proyecto) incluido en el repositorio.
3. Verificar que el módulo **Java Designer** aparezca activo en `Module Manager`; si no, instalarlo desde el Modelio Marketplace antes de continuar.

**3. Ejecutar la generación de código**

1. En el árbol del modelo, seleccionar el paquete/diagrama de clases del subsistema (las 8 clases de dominio).
2. `Tools → Java Designer → Generate Code` (o la ruta equivalente del módulo instalado).
3. Configurar la carpeta de salida y el target Java 17.
4. Ejecutar la generación y revisar el log para confirmar que no hay errores.

**4. Compilar y ejecutar el código generado (IntelliJ IDEA)**

1. Abrir IntelliJ IDEA → `File → Open` y seleccionar la carpeta del código generado por Modelio.
2. Confirmar que el **Project SDK** esté configurado en JDK 17 (`File → Project Structure → Project`).
3. Dejar que IntelliJ indexe el proyecto y resuelva las clases generadas.
4. `Build → Build Project` para compilar.
5. Ejecutar la clase principal (o la clase/prueba que corresponda) con `Run` para verificar que el código generado compila y corre sin errores.

## (vi) Compilar el informe (`informe.tex` → `informe.pdf`)

- **Compilador:** `pdflatex` (motor pdfTeX)
- **Motor de bibliografía:** `biber` (backend de `biblatex`, estilo IEEE numérico)
- **Número de pasadas:** 3 pasadas de `pdflatex` + 1 pasada de `biber` (4 en total)

`informe.tex` vincula la bibliografía con `\addbibresource{referencias.bib}` en el preámbulo; cada cita en el cuerpo usa `\cite{clave}` contra las claves definidas en `referencias.bib` (p. ej. `schmidt2006`, `brambilla2017`, `omgmof2016`, `modelioOficial`). El listado final se imprime con `\printbibliography[heading=none]`. El backend es `biber`, **no** `bibtex` clásico.

Con `informe.tex` y `referencias.bib` en la misma carpeta:

```bash
pdflatex informe.tex     # 1ª pasada: genera informe.aux e informe.bcf con las citas pendientes
biber informe            # procesa referencias.bib -> informe.bbl (sin extensión .tex)
pdflatex informe.tex     # 2ª pasada: incorpora la bibliografía ya formateada
pdflatex informe.tex     # 3ª pasada: resuelve referencias cruzadas, numeración, tablas e índice
```

Paquetes LaTeX requeridos (incluidos en una instalación completa de TeX Live/MiKTeX): `inputenc`, `fontenc`, `babel` (spanish), `lmodern`, `microtype`, `graphicx`, `float`, `geometry`, `array`, `booktabs`, `tabularx`, `longtable`, `ragged2e`, `enumitem`, `titlesec`, `setspace`, `fancyhdr`, `caption`, `needspace`, `csquotes`, `biblatex` (backend=biber), `hyperref`.

**Alternativa — Overleaf:** subir `informe.tex` y `referencias.bib` (y figuras, si aplica) a un proyecto nuevo, fijar **Compiler: pdfLaTeX** en *Menu → Settings*; Overleaf detecta `backend=biber` y corre las pasadas automáticamente con *Recompile*.

## (vii) Video de la demostración

https://youtu.be/fSEcB63kXRM

## (viii) Créditos y responsabilidades individuales

| Integrante | Responsabilidades |
|---|---|
| Jimmy Samuel Nieves Sánchez | Documentador, configuración de Java Designer, marco teórico, generación, compilación |
| Gary Alejandro Morales Sánchez | Responsable del GitHub, modelado UML, verificación de código, roundtrip |

