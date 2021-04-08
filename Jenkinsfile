// Getting the project
pipeline {
    agent {
        dockerAgent {
            image 'openjdk:latest'
        }
    }

    stages {
        stage('Checkout') {
            steps {
            checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/rmbym/TP.git']]])
            }
        }
    }
}
