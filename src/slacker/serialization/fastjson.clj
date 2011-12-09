(ns slacker.serialization.fastjson
  (:import [com.alibaba.fastjson JSON])
  (:import [com.alibaba.fastjson.serializer SerializerFeature]))

(defn parse-string [data]
  (JSON/parse data))

(defn generate-string [obj with-type]
  (if with-type
    (JSON/toJSONString obj
                       (into-array [SerializerFeature/WriteClassName]))
    (JSON/toJSONString obj)))
