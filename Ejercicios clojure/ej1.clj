(defn tercer-angulo [angulo1 angulo2]
  (cond
    (> 0 angulo1) (println "Error Angulo1 negativo")
    (> 0 angulo2) (println "Error Angulo2 negativo")
    (< 180 (+ angulo1 angulo2)) (println "Error")

    :else (println (- 180 (+ angulo1 angulo2)))))

(tercer-angulo 20 60)
(tercer-angulo 20 1860)

(defn tercer-angulo [angulo1 angulo2]
  (cond
    (or (> 0 angulo1) (> 0 angulo2)) (println "Error negativo")
    (< 180 (+ angulo1 angulo2)) (println "Error")

    :else (println (- 180 (+ angulo1 angulo2)))))

(tercer-angulo 20 60)
(tercer-angulo 20 1860)


