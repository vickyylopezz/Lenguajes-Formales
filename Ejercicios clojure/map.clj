; Explicacion de como funciona el map -> Muy parecido al @ de funcional
; Agarra la funcion (+ aca) y los primeros parametros de cada parametro que tenga. Por ejemplo; 1, 4 y 7. Lo mismo hace con el siguiente: + 2 5 8.
; Es decir, me genera una lista con la suma de los primeros elementos: (12 15 18)
; Cuando el map tiene un solo parametro, ejecuta la funcion en cada elemento de la lista
(map + '(1 2 3) '(4 5 6) '(7 8 9))
; da (12 15 18)

; Incrementa 1 al 1, 1 al 2 y 1 l 3
; Me devuelve el mismo vector incrmentado en 1 cada elemento
; cuando tiene un solo parametro funciona igual al @ 
(map inc [1 2 3])
;da (2 3 4)

; Al aplicar map y una de las listas tiene menos elementos, va a cortar por la de menor elementos
(map + '(1 2 3) '(4 5) '(7 8 9))
; da (12 15)

; Agarra de esa lista y a cada elemento le aplica la funcion first (igual que en fp)
(map first '((1 2 3) (4 5 6)))
; da (1 4)
(map first '(1 2 3) '(4 5 6))
; da error porque le aplico first a como parametro el 1 y el 4. Agarra los primeros elementos (1 y 4) y 
(first '1 '4) ; Esto es lo que hace el map, por eso rompe
; El map cuando tenes mas de un argumento, toma la primer posicion de cada uno y le aplica la funcion que se le paso, luego los segundos y asi sucesivamente
