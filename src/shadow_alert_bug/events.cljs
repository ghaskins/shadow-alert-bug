(ns shadow-alert-bug.events
  (:require
   [re-frame.core :as re-frame]
   [shadow-alert-bug.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
