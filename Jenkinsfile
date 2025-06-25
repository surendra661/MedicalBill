pipeline {
    agent any

    tools {
        maven 'mymaven'
    }

    stages {
        stage('code') {
            steps {
                git 'https://github.com/surendra661/medical-bill.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
