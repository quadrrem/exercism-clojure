(ns scrabble-score)

(def score {"Q" 10
            "Z" 10
            "J" 8
            "X" 8
            "K" 5
            "F" 4
            "H" 4
            "V" 4
            "W" 4
            "Y" 4
            "B" 3
            "C" 3
            "M" 3
            "P" 3
            "D" 2
            "G" 2})

(defn score-letter [c]
  (get score (clojure.string/upper-case c) 1))

(defn score-word [w]
  (apply + (map score-letter w)))
