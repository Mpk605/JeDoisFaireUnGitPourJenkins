pipeline {
    agent any

    environment {
        // Définir le nom de l'image Docker
        IMAGE_NAME = 'maven-app'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    // Construire l'image Docker
                    docker.build("${IMAGE_NAME}")
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Déployer en utilisant Docker Compose
                    sh 'docker-compose up -d'
                }
            }
        }
    }

    post {
        always {
            // Nettoyer après les builds
            cleanWs()
        }
        success {
            // Actions en cas de succès du pipeline
            echo 'Build and deployment successful!'
        }
        failure {
            // Actions en cas d'échec du pipeline
            echo 'Build or deployment failed.'
        }
    }
}
