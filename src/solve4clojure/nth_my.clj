(ns solve4clojure.nth-my)
;; #21

(defn nth-my [coll x]
  (if (zero? x)
    (first coll)
    (recur (next coll) (dec x))))

;; For load on 4clojure site
(fn [coll x]
  (if (zero? x)
    (first coll)
    (recur (next coll) (dec x))))
