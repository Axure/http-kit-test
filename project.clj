(defproject http-kit-test "0.0.1"
    :description "A http-kit test."
    :dependencies [[http-kit "2.1.18"]]
    :source-paths ["src"]
    :aot [http-kit-test.run-server]
    :main http-kit-test.run-server)
