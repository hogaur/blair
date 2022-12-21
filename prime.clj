(ns blair.core
    (:require  [clojure.math.numeric-tower :as math]))

(defn- gcd
    "Uses the numeric tower gcd for two numbers"
      [x y]
        (math/gcd x y))

(defn- lcm
    "Uses the numeric tower lcm for two numbers"
      [x y]
        (math/lcm x y))

(prn (* (lcm 26 64) (gcd 26 64)))

(prn (* 26 64))
