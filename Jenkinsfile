#!/usr/bin/env groovy

def gv

pipeline {
    agent any
    stages {
        stage("init") {
            steps {
                script {
                   gv = load "script.groovy"
                }
            }
        }
        stage("buildJar") {
            steps {
                script {
                    gv.buildJar()
                }
            }
        }
        stage("buildImage") {
            steps {
                script {
                    gv.buildImage()
                }
            }
        }
        stage("deployApp") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}
