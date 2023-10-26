;Definir la función repartir que, llamada sin argumentos, devuelva la cadena "Uno para vos, uno para mí". De lo contrario, se devolverá una lista, en la que habrá una cadena "Uno para X, uno para mí" por cada argumento X.

(defn frase [x]
  (str "Uno para " x ", uno para mí.\n"))

(defn repartir
  ([] "Uno para vos, uno para mí.")
  ([& args] (map frase args)))

(println (repartir))
(println (repartir "Vicky" "Vicky2"))