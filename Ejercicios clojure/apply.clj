; Aplica a cada elemento
; desempaqueta el parametro que estoy enviando
 (apply str '(a b c))

(apply str '(h o l a))

; Desempaqueta el parametro que esta en la lista como parametros independientes de la funcion y los envia
; Agarra '(a b c) y los separa en 'a 'b 'c y les aplica str
(println (str 'a 'b 'c))

; Ejemplo:
(println (apply list '((ab) c d)))
; Ejecuta la funcion list y como parametro va 'ab 'c 'd
(println (list '(ab) 'c 'd))

; Tengo una lista con los parametros a enviar a la funcion, por ende tiene que ser una funcion de aridad igual de la cantidad de elementos que yo tengo. Con first no funcionaria porque firs se le aplica a un solo parametro y aca estoy enviando tres

; map vs apply
; El map hace el list aplicado a cada una de las listas
; (println (map list '((ab) c d)))
; da: (((ab)) (c) (d))
;(println (apply list '((ab) c d)))
; da: ((ab) c d)