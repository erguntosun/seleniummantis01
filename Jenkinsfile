pipeline {

    agent {
        docker {
            image 'markhobson/maven-chrome:jdk-11'
            args '-v /appdata:/appdata:rw,z -w /appdata --name seleniummantis01'
        }
    }

    stages {
        stage('Execute selenium test'){
            steps {
                sh 'mvn clean test'
            }
        }
    }
}