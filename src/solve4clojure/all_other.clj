(ns solve4clojure.all-other)

;; #23
(defn rev-seq [col]
  (reduce (fn [acc val] (cons val acc)) [] col))

;; #26
(defn fib1
  ([] (fib1 1 1))
  ([a b]
    (cons a (lazy-seq (fib1 b (+ a b))))))

(defn fib2 []
  (map first (iterate (fn [[a b]] [b (+ a b)]) [1 1])))

(defn grp-seq [f coll]
  (reduce (fn [acc v] (update-in acc [(f v)] #(conj (vec %) v))) {} coll))
