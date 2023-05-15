pipeline {
    agent any
    tools {
        maven 'maven-3.9.1'
    }
    stages {
        stage("build jar") {
            steps {
                script {
                    echo "building the app"
                    sh 'mvn package'
                }
            }
        }
        stage("build imager") {
            steps {
                script {
                    echo "building the docker image"
                    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo',passwordVariable: 'PASS',usernameVariable: 'USER')]){
                        sh 'docker build -t mohamedfayez7/my-repo:jma-2.0 .'
                        sh "echo $PASS | docker login -u $USER --password-stdin"
                        sh 'docker push mohamedfayez7/my-repo:jma-2.0'
                    }

                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    echo 'deploying the app'
                }
            }
        }
    }
}
