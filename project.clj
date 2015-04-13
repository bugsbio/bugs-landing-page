(defproject bugs-landing-page "0.1.0"
  :description "Generate a BUGS Bioscience landing page"
  :url "http://github.com/bugsbio/bugs-landing-page"
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :plugins [[s3-wagon-private "1.1.2"]]
  :repositories [["snapshots" {:url "s3p://bugs-artifacts/snapshots/"
                               :username :env
                               :passphrase :env}]
                 ["releases" {:url "s3p://bugs-artifacts/releases/"
                              :username :env
                              :passphrase :env
                              :snapshots false}]])
