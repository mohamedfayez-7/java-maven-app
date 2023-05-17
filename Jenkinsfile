#!/usr/bin/env groovy
@Library('jenkins-shared-library')
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
                    buildJar()
                }
            }
        }
        stage("buildImage") {
            steps {
                script {
                    buildImage 'mohamedfayez7/my-repo:jma-3.0'
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
