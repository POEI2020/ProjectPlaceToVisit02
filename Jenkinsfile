pipeline {
    agent any

    stages {
        stage ('compile stage') {
            withMaven(maven : 'Maven'){
                sh 'mvn clean compile'
            }
        }
        stage ('testing stage') {
            withMaven(maven : 'Maven'){
                sh 'mvn test'
            }
        }
    }
}