; Muy parecido al map
; Genera un parametro en forma automatica
; Pasa como primer parametro en range de la cantidad de elementos que te paso como segundo parametro. 
(map-indexed list '(1 2 3 4))
; da ((0 1) (1 2) (2 3) (3 4))
; Automaticamente me pone un parametro fijo que es la enumeracion de la lista
; Es lo mismo que: 
(map list '(0 1 2 3) '(1 2 3 4))

; Ejemplo:
(list 0 1)
; da (0 1)
