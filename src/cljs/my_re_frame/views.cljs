(ns my-re-frame.views
  (:require [re-frame.core :as re-frame]
            [my-re-frame.subs :as subs]
            [my-re-frame.events :as events]
            ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])
        test (re-frame/subscribe [::subs/test])]
    [:div
     [:p "Test value: " @test]
     [:p "Name value: " @name]
     [:button {
               :on-click #(re-frame/dispatch [::events/name-change "Name changed!"])
               } "Change name"]
      ]))
