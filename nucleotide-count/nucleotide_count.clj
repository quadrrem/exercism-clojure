(ns nucleotide-count
  (:require [clojure.core :as c]))
(def dna #{\A \T \G \C})
(def allowed (conj dna \U))

(defn count
  [chr str]
  (if (contains? allowed chr)
  (c/count (filter #(= chr %) str))
  (throw (Exception. "invalid nucleotide"))))

(defn nucleotide-counts
  [s]
  (zipmap dna (map #(count % s) dna)))
