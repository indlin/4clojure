(ns solve4clojure.core-test
  (:require [clojure.test :refer :all]
            [solve4clojure.prime :as prime]
            [solve4clojure.nth-my :as nth]))

(deftest prime-test
  (testing "prime"
    (is (= (prime/get-prime 2) [2 3]))
    (is (= (prime/get-prime 5) [2 3 5 7 11]))
    (is (= (last (prime/get-prime 100)) 541))))

(deftest nth-test
  (testing "nth-my."
    (is (= (nth/nth-my '(4 5 6 7) 2) 6))
    (is (= (nth/nth-my [:a :b :c] 0) :a))))
