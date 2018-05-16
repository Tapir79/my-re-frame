(ns my-re-frame.views
  (:require [re-frame.core :as re-frame]
            [my-re-frame.subs :as subs]
            ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div "Hello from " @name]))
