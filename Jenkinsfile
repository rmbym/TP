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
/// 2- Build project
        stage('Build') {
            steps {
                sh 'javac -encoding utf-8 -d bin poke_tour/src/*.java'
                sh 'ls bin/poke_tour'
                sh 'jar cvf poke_tour.jar bin/poke_tour/*.class'
            }
        }
/// 3- Code quality
        stage('Code Quality') {
            steps {
                scanForIssues tool: java(reportEncoding: 'UTF-8')
                scanForIssues tool: checkStyle(reportEncoding: 'UTF-8')
                publishIssues healthy: 10, issues: [], unhealthy: 50
                //recordIssues(tools: [checkStyle(reportEncoding: 'UTF-8')])
            }
        }
    }
/// 3- Artifact
    post {
            always {
                archiveArtifacts artifacts: 'poke_tour.jar', fingerprint: true, followSymlinks: false, onlyIfSuccessful: true
            }
        }
}
