(ns solve4clojure.prime-test
  (:require [solve4clojure.prime :as p]
            [clojure.test :refer :all]))

(deftest prime-test-2
  (testing "First 2 prime number."
    (is (= (p/get-prime 2) [2 3]))))

(deftest prime-test-5
  (testing "First 5 prime number."
    (is (= (p/get-prime 5) [2 3 5 7 11]))))

(deftest prime-test-last
  (testing "Last 100-th prime number."
    (is (= (last (p/get-prime 100)) 541))))
