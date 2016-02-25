(ns word-count
  (:require [clojure.string :as str]))

(defn to-lower
  [w]
  (str/lower-case w))

(defn split
  [words]
  (str/split words #"\W+"))

(defn word-count
  [words]
  (frequencies (map to-lower (split words))))
