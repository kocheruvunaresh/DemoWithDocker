pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Test') {
            steps {
                bat 'mvnw.cmd test'
            }
        }

        stage('Deploy') {
            steps {
                bat 'docker compose down || exit /b 0'
                bat 'docker compose up -d --build'
            }
        }
    }

    post {
        success {
            echo 'Deployed. API: POST http://localhost:8070/api/items'
        }
        failure {
            echo 'Pipeline failed. Check console output.'
        }
    }
}
