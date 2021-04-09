// Getting the project
pipeline {
    agent none
/// 1- Recupérer le code
    stages {
        stage('Checkout') {
            steps {
            checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/rmbym/TP.git']]])
            }
        }
/// 1- Build project
        stage('Build') {
        agent {
                docker {
                    image 'openjdk:latest'
                }
            }
            steps {
                bash 'ls'
            }
        }
    }
}
