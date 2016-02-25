(ns etl
  (:require [clojure.string :as s]))

(defn transform [vs]
  (reduce-kv
    (fn [m k v]
      (reduce #(assoc %1 (s/lower-case %2) k) m v))
    {}
    vs))
