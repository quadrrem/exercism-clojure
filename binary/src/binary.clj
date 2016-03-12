(ns binary)

(defn to-decimal [b]
  (let [db (filter #(Character/isDigit %) b)]
    (reduce +
      (map (fn [[x y]] (* (Character/digit x 10) (reduce * (repeat y 2))))
           (map vector db (reverse (range (count db))))))))
