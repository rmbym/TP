// Getting the project
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
            echo "Starting pipeline"
            checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/rmbym/TP.git']]])
            }
        }
    }
}
