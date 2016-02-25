(ns grains)

(def board-size 64)

(defn square [x]
  (if (= x 1)
    1
    (*' 2 (square (dec x)))))

(defn total []
  (reduce +' (map square (range 1 (inc board-size)))))
