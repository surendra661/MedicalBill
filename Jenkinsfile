pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                git credentialsId: 'github-token', url: 'https://github.com/surendra661/MedicalBill.git'
            }
        }
        stage('Build') {
            steps {
                echo "Build step"
            }
        }
        stage('Test') {
            steps {
                echo "Test step"
            }
        }
    }
}
