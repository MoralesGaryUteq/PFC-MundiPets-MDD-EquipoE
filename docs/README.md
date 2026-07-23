# docs/ — Documento evidencia (LaTeX)

Documento evidencia del proyecto en formato LaTeX y su PDF compilado.

## Archivos

| Archivo | Descripción |
|---|---|
| `informe.tex` | Código fuente LaTeX del documento |
| `informe.pdf` | Documento compilado (entregable) |
| `referencias.bib` | Referencias bibliográficas en formato IEEE |
| `figuras/` | Diagramas y capturas insertadas en el informe |

## Compilación

```
pdflatex informe.tex
biber informe
pdflatex informe.tex
pdflatex informe.tex
```

Ver el `README.md` de la raíz del repositorio para el detalle completo.