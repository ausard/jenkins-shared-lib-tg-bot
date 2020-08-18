#!/usr/bin/env groovy

def call(String name = 'human') {
  sh 'curl http://localhost:7001/I%20am%20alive!!!'
}
