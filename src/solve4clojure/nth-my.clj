(ns solve4clojure.nth-my)
;; #21

(defn
  ^{:test (fn []
            (assert (= (nth-my '(4 5 6 7) 2) 6)))}
  nth-my [coll x]
  (if (zero? x)
    (first coll)
    (recur (next coll) (dec x))))

;; For load on 4clojure site
(fn [coll x]
  (if (zero? x)
    (first coll)
    (recur (next coll) (dec x))))
