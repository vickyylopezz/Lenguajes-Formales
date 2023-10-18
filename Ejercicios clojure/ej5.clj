(defn capicua? [n]
  (cond
    (or (< n 0) (> n 99999)) (println "Numero mayor a 5 digitos")
    :else (println (= (str n) (apply str (reverse (str n)))))))

(capicua? 101000)
(capicua? 1221)

; str convierte a string
(println (str 1234))
; Le aplico reverse (transforma en una lista y lo iniverte)
(println (reverse (str 1234)))
;apply: toma cada uno de los elementos de la lista como parametro independiente del str. Al apply le llega una funcion y una lista y lo que hace es ejecutar esa funcion y todos los elementos de la lista como parametro
(println (apply str(reverse (str 1234))))
(println (str(reverse (str 1234))))
(println (str '4 '3 '2 '1))


