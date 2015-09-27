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

;; #28
(defn flat-col [coll]
    (if (sequential? coll) (mapcat flat-col coll)
        [coll]))

(defn inter-col [coll1 coll2]
  (loop [acc []
         [el1 & rest1] coll1
         [el2 & rest2] coll2]
    (if (or (nil? el1) (nil? el2)) acc
        (recur (conj acc el1 el2) rest1 rest2))))

(defn fact [x]
  (if
    (< x 2) x
    (* x (fact (dec x)))))

(defn fact2 [x]
  (reduce * (range 1 (inc x))))

(defn compr [coll]
  (map first (partition-by identity coll)))

(defn repl [coll x]
  (mapcat #(repeat x %) coll))

(defn halftruth [& args]
  (boolean (and (some #{true} args) (not-every? #{true} args))))

;; #66 Euclid's algorithm
(defn grt-common [x1 x2]
  (cond (= x1 x2) x1
        (< x1 x2) (recur x1 (- x2 x1))
        :default (recur x2 (- x1 x2))))

(defn comparition [op arg1 arg2]
  (let [res1 (op arg1 arg2)
        res2 (op arg2 arg1)]
    (case [res1 res2]
      [false false] :eq
      [true false] :lt
      :gt)))

(defn inter [arg1 arg2]
  (into #{} (filter #(and (contains? arg1 %) (contains? arg2 %)) (concat arg1 arg2))))

(defn iter [f x]
   (lazy-seq (cons x (iter f (f x)))))

(defn cartesian [s1 s2]
  (set (for [x s1
             y s2]
         [x y])))
