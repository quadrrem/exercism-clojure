(ns binary-search)

(defn middle [xs]
  (int (/ (count xs) 2)))

(defn search-for [x xs]
  (if (seq xs)
    (if (= xs (sort xs))
      (let [m (middle xs)
            o (inc m)
            y (nth xs m)]
         (cond (= x y) m
               (< x y) (search-for x (take m xs))
               (> x y) (+ (search-for x (drop o xs)) o)))
      (throw (Exception. "must be sorted")))
    (throw (Exception. "not found"))))
