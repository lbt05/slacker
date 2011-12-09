(defproject info.sunng/slacker "0.2.0-SNAPSHOT"
  :description "Clojure RPC"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [aleph "0.2.0"]
                 [info.sunng/carbonite "0.1.0"]
                 [com.alibaba/fastjson "1.1.9"]
                 [commons-pool/commons-pool "1.5.6"]]
  :dev-dependencies [[codox "0.2.3"]
                     [lein-exec "0.1"]]
  :repositories {"alibaba" "http://code.alibabatech.com/mvn/releases/"}
  :aot [slacker.SlackerException])


