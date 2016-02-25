(ns robot-name)

(definterface IRobotType
  (getName [])
  (setName [v]))

(deftype RobotType [^:unsynchronized-mutable name]
  IRobotType
  (getName [_] name)
  (setName [this v] (set! name v)))

(defn robot []
  (RobotType. nil))

(defn generate-name []
  (apply str (concat
              (repeatedly 2 #(char (rand-nth (range (int \A)
                                                    (inc (int \Z)))))) 
              (repeatedly 3 #(rand-int 10)))))

(defn robot-name [robot]
  (do (when (not (.getName robot))
           (.setName robot (generate-name)))
      (.getName robot)))

(defn reset-name [robot]
  (.setName robot nil))
