pipeline {
    agent any
    tools {
        maven 'mymaven'
    }

    stages {
        stage('Clone') {
            steps {
                git(
                    branch: 'main',
                    credentialsId: 'github-token',
                    url: 'https://github.com/surendra661/MedicalBill.git'
                )
            }
        }

        stage('Build') {
            steps {
                echo "Building project with Maven"
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo "Running unit test"
                sh 'mvn tests'
            }
        }
    }
}
