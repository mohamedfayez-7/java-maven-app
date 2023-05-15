#!/usr/bin/env groovy
def gv
pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    stages {
        stage("init") {
            steps {
                script { 
                    echo 'mohamed fayez'
                    gv = load "script.groovy"
                }
            }
        }        
        stage("build") {
            steps {
                script {
                    gv.buildApp()
                }
            }
        }
        stage("test") {
            when {
                expression {
                    params.executeTests == true
                }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }
        stage("deploy") {
            input {
                message "Select Environment to deploy to"
                ok "OK"
                parameters {
                    choice(name: 'Environment1', choices: ['dev', 'stage', 'prod'], description: '')
                }
            }
            steps {
                script {
                    env.Environment2 = input message: "Select Environment to deploy to", ok: "OK", parameters: [choice(name: 'Environment2', choices: ['dev', 'stage', 'prod'], description: '')]
                    gv.deployApp()
                    echo "deploying to ${Environment1}"
                    echo "deploying to ${Environment2}"
                }
            }
        }
    }
}
