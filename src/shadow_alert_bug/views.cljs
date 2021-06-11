(ns shadow-alert-bug.views
  (:require [re-frame.core :as re-frame]
            [shadow-alert-bug.subs :as subs]
            ["@material-ui/core" :refer [AppBar]]))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:> AppBar {:position "relative" :elevation 0}
      [:p "Shadow Test"]]
     [:h1
      "Hello from " @name]
     ]))
