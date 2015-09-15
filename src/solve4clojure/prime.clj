(ns solve4clojure.prime)

(defn prime? [n]
  (when (< n 3) true)
  (not (some zero? (map #(mod n %) (range 2 (-> (Math/sqrt n) int inc))))))

(defn prime-gen []
  (filter prime? (iterate inc 2)))

(defn
  get-prime [x] (take x (prime-gen)))

;; For load on 4clojure site, unit all funcs in to one
;; #(take 5 (filter
;;           (fn [n]
;;             (when (< n 3) true)
;;             (not (some zero? (map (fn [x] mod n x) (range 2 (-> (Math/sqrt n) int inc))))))
;;           (iterate inc 2)))
