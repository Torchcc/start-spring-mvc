pipeline {
    agent any

    stages {
        stage('pull code') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/Torchcc/start-spring-mvc.git']]])
            }
        }
        stage('build project') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('publish project') {
            steps {
                deploy adapters: [tomcat9(credentialsId: '8c2f7e52-3591-4460-84fc-64ac1c1482ad', path: '', url: 'http://106.53.124.190:7080')], contextPath: 'web_demo_pipeline', war: 'target/*.war'
            }
        }
    }
}
