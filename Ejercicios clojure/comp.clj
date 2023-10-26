; Composicion de funciones
; Pongo todas las funciones que quiero componer y un parametro que es una lista
(println ((comp first second second) '(1 (33 (5 4)))))
; Se aplica second, lo cual da (33 (5 4))
; Ahora se aplica second otra vez al resultado, lo cual da (5 4)
; Ahora se aplica first, lo cual da 5 -> Resultado

; Recibe un solo argumento