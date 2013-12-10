


(defmacro init
  []
  (do
    (use '[cemerick.pomegranate :only (add-dependencies)])
    (add-dependencies :coordinates '[[backtick "LATEST"]
                                     [swiss-arrows "LATEST"]
                                     [hiccup "LATEST"]
                                     [garden "LATEST" :excludes [org.clojure/clojure]]
                                     [prismatic/plumbing "LATEST"]
                                     [cuma "LATEST"]
                                     [me.raynes/conch "0.5.0"]
                                     [org.jsoup/jsoup "1.7.3"]
                                     [net.sf.jtidy/jtidy "r938"]
                                     ]
                    :repositories (merge cemerick.pomegranate.aether/maven-central
                                         {"clojars" "http://clojars.org/repo"}))

  (require '[backtick :refer (syntax-quote template)] ;; quoting and templating variables and resolution
           '[clojure.repl :refer (dir source doc apropos)] ;; commandline read-eval-print loop tools
           '[hiccup.core :refer (html)] ;; HTML DSL for Clojure
           '[garden.core :refer (css)] ;; CSS DSL for Clojure
           '[cuma.core :refer (render)] ;; Map based string template substitutions
           '[plumbing.core :refer :all] ;; Graphing computed values
           '[plumbing.graph :as graph] ;; ...
           '[me.raynes.conch :refer (programs with-programs let-programs)] ;; Shell API
           '[me.raynes.conch.low-level :as sh])

  (import '(org.w3c.tidy Tidy)
          '(org.jsoup Jsoup)
          '(org.jsoup.parser Parser)
          '(javax.xml XMLConstants)
          '(org.xml.sax SAXException)
          '(javax.xml.validation SchemaFactory)
          '(java.io File)
          '(java.io StringReader)
          '(javax.xml.transform.stream StreamSource))
  :done))

(init)




