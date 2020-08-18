def call(Map config=[:], Closure body) {
    node {
        sh 'curl http://localhost:7001/I%20am%20alive!!!'
        body()
    }
}
