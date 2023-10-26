; Definir una función para producir una lista con los elementos en las posiciones pares de dos listas dadas.
; Funcion que enviamos dos listas como parametro y como resultado obtengo una lista sola con las posiciones pares de ambas listas

(defn lista_pares_mio [x y]
  (concat ((take-nth 2 x) (take-nth 2 y))))

(println (lista_pares_mio '(1 2 3) '(4 5 6)))

(println (pop (take-nth 2 (concat '(0) '(1 2 3 4))))) ; --> Necesito eliminar el primer cero
(println (take-nth 2 (range 30)))

; Por profe:
(defn lista_pares [x y]
  (concat (map second (partition 2 x)) (map second (partition 2 y))))
; Tengo todas listas de dos elementos ((2 4) (5 7)) y le aplico second
; Partition: van 2 elementos, la lista y un numero. Separa la lista de n en n
(println (lista_pares '(2 4 5 7 8) '(1 2 3 4 9)))
; da: (4 7 2 4)
(println (partition 2 '(2 4 5 7 8)))
; da: ((2 4) (5 7))
