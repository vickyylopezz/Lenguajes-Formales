; Definir una función para eliminar las ocurrencias de un dato escalar en una lista (a todo nivel).
; Dado una lista y un parametro, eliminar todas las ocurrencias de ese elemento en la lista

(defn mismo_elemento [x y]
  (cond
    (== x y) x))

(defn eliminar [x y]
  (concat (mismo_elemento (first x) y) (eliminar (pop x) y)))

;(println (eliminar '(1 2 3 4 2 3 2) 2))

(println (first '(1 2 3 4 2 3 2)))
(println (mismo_elemento (first '(1 2 3 4 2 3 2)) 2))
(println (mismo_elemento (first (pop '(1 2 3 4 2 3 2))) 2))

; Si el primer elemento de la lista es igual al buscado, llamo al recursivo con la cola. Sino construyo el first con el recursivo. La condicion de corte es cuando la cola es null, empty

(defn eliminar_ocurrencias [lista escalar]
  (cond
    (empty? lista) lista
    (= (first lista) escalar) (eliminar_ocurrencias (rest lista) escalar)
    :else (cons (first lista) (eliminar_ocurrencias (rest lista) escalar))))

(println (eliminar_ocurrencias '(1 2 3 4 2 3 2) 2))
