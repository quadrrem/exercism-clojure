(ns beer-song
  (:require [clojure.string :as s]))

(def b0 "no more bottles")

(def v "%s of beer on the wall, %s of beer.\n%s, %s of beer on the wall.\n")

(def t0 "Go to the store and buy some more")
(def t1 "Take it down and pass it around")
(def tn "Take one down and pass it around")

(defn bpart
  [n]
  (cond
    (< n 0)
      "99 bottles"
    (= n 0)
      b0
    (= n 1)
      "1 bottle"
    :else
      (str n " bottles")))

(defn tpart
  [n]
  (cond
    (= n 0)
      t0
    (= n 1)
      t1
    :else
      tn))

(defn verse
  [n]
  (format v (s/capitalize (bpart n)) (bpart n) (tpart n) (bpart (- n 1))))

(defn sing
  ([f] (sing f 0))
  ([f t] (s/join "\n" (map verse (reverse (range t (+ f 1)))))))
