pipeline {
    agent any

    stages {
        stage ('compile stage') {
            steps {
                withMaven(maven : 'Maven'){
                bat 'mvn clean compile'
                }
            }
        }
        stage ('test') {
            steps {
                withMaven(maven : 'Maven'){
                bat 'mvn test'
                }
            }
        }
    }
}
