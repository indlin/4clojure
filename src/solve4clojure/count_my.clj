(ns solve4clojure.count-my)

(defn count-my [col]
  (loop [x 0
         c col]
    (if (nil? c) x
        (recur (inc x) (next c)))))

(defn count-my1 [col]
  (reduce (fn [x _] (inc x)) 0 col))
