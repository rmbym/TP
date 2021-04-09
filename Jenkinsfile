// Getting the project
pipeline {
    agent {
    docker {
        image 'openjdk:latest'
        }
    }
/// 1- Recupérer le code
    stages {
        stage('Checkout') {
            steps {
            checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/rmbym/TP.git']]])
            }
        }
/// 1- Build project
        stage('Build') {
            steps {
                sh 'ls'
                sh 'cd poke_tour/'
                sh 'javac ./src/main.java'
            }
        }
    }
}
