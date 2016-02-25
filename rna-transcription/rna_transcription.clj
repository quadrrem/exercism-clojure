(ns rna-transcription)
(def rna
  {\G \C
  \C \G
  \T \A
  \A \U})
(defn check-and-get
  [coll d]
  (do (assert (contains? coll d))
      (get coll d)))

(defn to-rna
  [dna]
  (apply str (map #(check-and-get rna %) (seq dna))))
