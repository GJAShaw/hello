pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh 'mvn clean package'
                echo 'Stashing...
                stash includes: 'target/*spring*.jar', name: 'binary'
                echo 'Cleaning...'
                sh 'mvn clean'
            }
        }
        stage('Try-Unstash') {
            steps {
                echo 'Unstashing...'
                unstash 'binary'
                sh 'find . -type f -name "*.jar"'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'echo PWD = $(pwd)'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh 'echo PWD = $(pwd)'
            }
        }
    }
}
