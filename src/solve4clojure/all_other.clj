(ns solve4clojure.all-other)

(defn rev-seq [col]
  (reduce (fn [acc val] (cons val acc)) [] col))

(defn fib1
  ([] (fib1 1 1))
  ([a b]
    (cons a (lazy-seq (fib1 b (+ a b))))))

(defn fib2 []
  (map first (iterate (fn [[a b]] [b (+ a b)]) [1 1])))
