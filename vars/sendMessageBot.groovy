#!/usr/bin/env groovy

def call(String message = 'I%20am%20alive!') {
  sh 'curl http://localhost:7001/${message}'
}
