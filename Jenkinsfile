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
        stage('Build') {
        agent {
                docker {
                    image 'openjdk:latest'
                }
            }
            steps {

            }
        }
    }
}
