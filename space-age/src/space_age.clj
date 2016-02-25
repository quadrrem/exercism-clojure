(ns space-age)

(def ratio {:earth 1
            :mercury 0.2408467
            :venus 0.61519726
            :mars 1.8808158
            :jupiter 11.862615
            :saturn 29.447498
            :uranus 84.016846
            :neptune 164.79132})

(defn on-earth
  ([s] (on-earth s :earth))
  ([s p] (/ (/ s 31557600) (p ratio))))

(defn on-mercury [s]
  (on-earth s :mercury))

(defn on-venus [s]
  (on-earth s :venus))

(defn on-mars [s]
  (on-earth s :mars))

(defn on-jupiter [s]
  (on-earth s :jupiter))

(defn on-saturn [s]
  (on-earth s :saturn))

(defn on-uranus [s]
  (on-earth s :uranus))

(defn on-neptune [s]
  (on-earth s :neptune))
