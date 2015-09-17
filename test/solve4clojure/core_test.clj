(ns solve4clojure.core-test
  (:require [clojure.test :refer :all]
            [solve4clojure.prime :as prime]
            [solve4clojure.nth-my :as nth]
            [solve4clojure.count-my :as cnt]
            [solve4clojure.all-other :as all]))

(deftest prime-test
  (testing "prime"
    (is (= (prime/get-prime 2) [2 3]))
    (is (= (prime/get-prime 5) [2 3 5 7 11]))
    (is (= (last (prime/get-prime 100)) 541))))

(deftest nth-test
  (testing "nth-my"
    (is (= (nth/nth-my '(4 5 6 7) 2) 6))
    (is (= (nth/nth-my [:a :b :c] 0) :a))))

(deftest count-my
  (testing "count-my"
    (is (= (cnt/count-my '(1 2 3 3 1)) 5))))

(deftest all-other
  (testing "all other"
    (is (= (all/rev-seq '(1 2 3 4)) [4 3 2 1]))
    (is (= (take 8 (all/fib1)) '(1 1 2 3 5 8 13 21)))
    (is (= (take 8 (all/fib2)) '(1 1 2 3 5 8 13 21)))
    ))
