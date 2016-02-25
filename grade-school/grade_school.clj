(ns grade-school)

(defn grade
  [db grd]
  (db grd []))

(defn add
  [db student grd]
  (assoc db grd (conj (grade db grd) student)))

(defn sorted
  [db]
  (reduce-kv #(assoc %1 %2 (sort %3)) (sorted-map) db))
