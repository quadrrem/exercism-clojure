(ns bob)
(defn response-for
  [x]
  (if (clojure.string/blank? (clojure.string/trim x))
    "Fine. Be that way!"
    (if (and (= x (clojure.string/upper-case x)) (re-find #"[A-Za-z]+" x))
      "Woah, chill out!"
      (if (.endsWith x "?")
        "Sure."
        "Whatever."))))
