(ns hamming)

(defn distance [xs ys]
  (when (= (count xs) (count ys))
    (count (filter false? (map = xs ys)))))
