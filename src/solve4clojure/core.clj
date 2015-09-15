(ns solve4clojure.core
  (:gen-class)
  (:require [solve4clojure.prime :as p]))

(defn -main
  "Run some solved problems from 4 clojure"
  []
  (println "First 10 prime numbers" (p/get-prime 10)))
