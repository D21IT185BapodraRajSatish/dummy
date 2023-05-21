pipeline{
  agent any
  tools{
    maven 'Maven-3.9.2'
  }
  stages{
      stage('Build Maven Project'){
          steps{
            checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/D21IT185BapodraRajSatish/dummy']])
            sh 'mvn clean install'
          }

      }
      stage('Build Docker image'){
        steps{
            script{
                sh 'docker build -t CLDC/devops-integration .'
            }
        }
      }
  }
}
