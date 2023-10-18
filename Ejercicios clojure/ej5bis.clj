;Otra solucion
(defn capicua? [n] (cond
                     (neg? n) nil?
                     (> n 99999) nil?
                     :else (let [unidades (rem n 10), ;a unidades le sumo el resto dividido 10
                                 decenas (rem (quot n 10) 10), ;las decenas es el quot de n sobre 10
                                 centenas (rem (quot n 100) 10),
                                 unidades-mil (rem (quot n 1000) 10),
                                 decenas-mil (rem (quot n 10000) 10)]
                             (cond
                               (< n 10) true
                               (< n 100) (= unidades decenas)
                               (< n 1000) (= unidades centenas)
                               (> n 10000) (if (= unidades unidades-mil) (= decenas centenas) false)
                               :else (if (= unidades decenas-mil) (= decenas unidades-mil) false)))))

;Asigne a cada una de mis variables, el valor que le corresponse

(capicua? 123)
(capicua? 1221)