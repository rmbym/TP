// Getting the project
pipeline {
    agent {
        docker {
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
