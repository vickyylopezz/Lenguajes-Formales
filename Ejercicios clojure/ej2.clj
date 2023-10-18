(defn segundos [d h m s]
  (cond
    (> 0 d) (println "Error dia")
    (or (> 0 h) (< 24 h)) (println "Error horas")
    (or (> 0 m) (< 60 m)) (println "Error horas")
    (or (> 0 s) (< 60 s)) (println "Error horas")

    :else (println (+ (* d 24 60 60) (* h 60 60) (* m 60) s))))

(segundos 1 1 1 1)