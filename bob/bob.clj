(ns bob
  (:require [clojure.string :as s]))
(defn response-for
  [x]
  (cond
    (s/blank? (s/trim x))
      "Fine. Be that way!"
    (and (= x (s/upper-case x)) (re-find #"[A-Za-z]+" x))
      "Woah, chill out!"
    (.endsWith x "?")
      "Sure."
    :else "Whatever."))
