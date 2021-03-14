pipeline {
    agent any

    stages {
        stage('Build-Stash-Clean') {
            agent {label 'jenkins-master'}
            steps {
                sh 'uname -a'
                echo 'Building...'
                sh 'mvn clean package'
                echo 'Stashing...'
                stash includes: 'target/*spring*.jar', name: 'binary'
                echo 'Cleaning...'
                sh 'mvn clean'
            }
        }
        stage('Unstash-Run') {
            agent {label 'wombat-agent'}
            steps {
                echo 'Unstashing...'
                unstash 'binary'
                echo 'Running...'
                sh 'java -jar target/*spring*.jar'
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
