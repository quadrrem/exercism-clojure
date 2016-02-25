(ns point-mutations
  (:require [clojure.core :as c]))

(defn distance
  [i val]
  (if (= (first val) (last val))
  i
  (inc i)))

(defn hamming-distance
  [str str2]
  (if (= (count str) (count str2))
  (reduce distance 0 (map vector str str2))
  nil))
