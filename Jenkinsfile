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

        stage('Code Quality') {
            steps {
                recordIssues(tools: [java(pattern: '\'**/checkstyle-results.xml\'', reportEncoding: 'UTF-8'), checkStyle(pattern: '\'**/checkstyle-results.xml\'', reportEncoding: 'UTF-8')])
            }
        }

        stage('Build') {
            steps {
                sh 'javac -encoding utf-8 -d bin poke_tour/src/*.java'
               // does not work, cannot import Junit | sh 'javac -encoding utf-8 -d . testjunit.java'
                sh 'jar cvf poke_tour.jar bin/poke_tour/*.class'
               // cannot import Junit | sh 'java -cp junit.jar testjunit.java.class junit.textui.TestRunner testjunit'
            }
        }

        stage('DockerImage') {
            agent { docker { image 'docker:dind'}}
            steps {
                sh 'docker build -t yannickraoumbe/poke_tour:latest .'
                sh 'docker images '
            }
        }
    }
    post {
            always {
                archiveArtifacts artifacts: 'poke_tour.jar', fingerprint: true, followSymlinks: false, onlyIfSuccessful: true
            }
        }
}
