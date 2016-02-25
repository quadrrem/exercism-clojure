(ns gigasecond
  (:import (java.time LocalDateTime Duration)
           (java.time.temporal ChronoUnit)))

(defn- exp [b e]
  (reduce * (repeat e b)))

(defn from [y m d]
  (let [date (.plus (LocalDateTime/of y m d 0 0) (Duration/ofSeconds (exp 10 9)))]
    [(.getYear date) (.getMonthValue date) (.getDayOfMonth date)]))
