(ns triangle)

(defn- rotate [n xs]
  (let [r (mod n (count xs))]
    (concat (drop r xs) (take r xs))))

(defn- valid? [sides]
  (every?
    (fn [[a & as]] (> (apply + as) a))
    (for [x (range (count sides))]
        (rotate x sides))))

(defn type [& sides]
  (if (valid? sides)
    (let [d (distinct sides)]
        (case (count d)
          1 :equilateral
          2 :isosceles
          :scalene))
    :illogical))
