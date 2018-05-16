(ns my-re-frame.views
  (:require [re-frame.core :as re-frame]
            [my-re-frame.subs :as subs]
            ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])
        test (re-frame/subscribe [::subs/test])]
    [:div
     [:p "Testi " @test]
     [:p "Hello from " @name]
      ]))
