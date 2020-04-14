(defproject org.curbside.timbre-over-slf4j "0.1.0"
  :description "Timbre appender that logs messages via slf4j forked from https://github.com/PetrGlad/timbre-over-slf4j"
  :url "https://github.com/RakutenReady/timbre-over-slf4j"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.slf4j/slf4j-api "1.7.12"]
                 [com.taoensso/timbre "4.1.4"]]
  :profiles {:test {:dependencies [[uk.org.lidalia/slf4j-test "1.1.0"]]}
             :dev {:dependencies [[uk.org.lidalia/slf4j-test "1.1.0"]]}})
