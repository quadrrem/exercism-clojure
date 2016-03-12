(ns roman-numerals)

(def literals {1 "I"
               5 "V"
               10 "X"
               50 "L"
               100 "C"
               500 "D"
               1000 "M"})

(defn- base [n]
  (cond
    (< n 4) 0
    (< n 9) 5
    :else 10))

(defn- literal [l]
  (get literals l ""))

(defn- numeral [n i]
  (let [b (base n)
        o (- b n)
        one (literal i)]
    (apply str (concat (repeat (max 0 o) one)
                       (literal (* i b))
                       (repeat (max 0 (* -1 o)) one)))))

(defn- values [n]
  (let [sn (str n)]
    (filter
      (fn [[k v]] (not= \0 v))
      (map vector (reverse (range (count sn))) sn))))

(defn numerals [n]
  (reduce str
    (map
      (fn [[k v]] (numeral (Character/digit v 10) (int (Math/pow 10 k))))
      (values n))))
