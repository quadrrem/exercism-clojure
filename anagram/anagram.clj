(ns anagram
  (:require [clojure.string :as str]))

(defn lower
  [word]
  (str/lower-case word))

(defn anagrams-for
  [ana words]
  (filter #(= (frequencies (lower ana)) (frequencies (lower %))) (filter #(not (= (lower ana) (lower %))) words)))
