; Explicacion de como funciona el reduce -> Es muy parecido al / pero se hace de izquierda a derecha
; Es la insercion de esa funcion en cada elemento de la lista
reduce - '(1 2 3 4) ;o
(reduce - [1 2 3 4])
; Hace: (1 - 2 - 3 - 4) y da -8

(reduce + '(2 3 5 4))
; Hace: (2 + 3 + 5 +4) y da 14
; Insercion del + entre cada elemento de la lista