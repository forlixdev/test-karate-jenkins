pipeline {
    agent {label "maven"}
    stages {
        stage('Build') {
          steps {
            container('maven') {
              sh 'mvn test'
                }
            }
        }
    }
}