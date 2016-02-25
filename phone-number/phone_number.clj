(ns phone-number
  (:require [clojure.string :as string]))

(def invalid "0000000000")

(defn clean-number
  [nr]
  (apply str (filter #(Character/isDigit %) nr)))

(defn number
  [nr]
  (let [clean (clean-number nr)
        s (count clean)]
    (cond
      (= 10 s) clean
      (and (= 11 s) (= \1 (first clean))) (apply str (rest clean))
      :else invalid)))

(defn area-code
  [nr]
    (apply str (take 3 (number nr))))

(defn pretty-print
  [nr]
  (let [area (area-code nr)
        no_area (drop 3 (number nr))]
  (format "(%s) %s-%s" area (apply str (take 3 no_area)) (apply str (drop 3 no_area)))))
