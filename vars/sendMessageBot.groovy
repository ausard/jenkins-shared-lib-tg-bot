#!/usr/bin/env groovy

def call(String ip, String message = 'I%20am%20alive!') {
  sh "curl 'http://${ip}/${message}'"
}
