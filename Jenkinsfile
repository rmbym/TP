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
                sh 'javac -encoding utf-8 -d bin poke_tour/src/*.java'
                sh 'ls bin/poke_tour'
                sh 'jar cvf poke_tour.jar bin/poke_tour/*.class'
            }
        }
        stage('Artifacting Jar file') {
            steps {
                archiveArtifacts artifacts: 'poke_tour.jar', fingerprint: true, followSymlinks: false, onlyIfSuccessful: true
            }
        }

        stage('Code Quality') {
            steps {
            sh 'echo doing'
            }
        }
    }
}
