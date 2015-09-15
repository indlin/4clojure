(defproject solve4clojure "0.1.0-SNAPSHOT"
  :description "Solving 4clojure.com problems"
  :url "https://www.4clojure.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :main ^:skip-aot solve4clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
