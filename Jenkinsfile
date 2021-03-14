pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh '''
                    mvn clean package
                    stash includes: 'target/*spring*.jar', name: 'binary'
                '''
            }
        }
        stage('Try-Unstash') {
            steps {
                echo 'mvn clean, followed by unstash...'
                sh '''
                    mvn clean
                    unstash 'binary'
                    find . -type f -name "*.jar"
                '''
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
