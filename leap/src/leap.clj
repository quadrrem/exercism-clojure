(ns leap)

(defn leap-year? [year]
  (and (zero? (rem year 4))
       (or (not (zero? (rem year 100)))
           (zero? (rem year 400)))))
